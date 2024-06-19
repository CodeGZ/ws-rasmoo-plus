package com.client.ws.rasmooplus.service.impl;

import com.client.ws.rasmooplus.dto.UserDto;
import com.client.ws.rasmooplus.exception.BadRequestException;
import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.mapper.UserMapper;
import com.client.ws.rasmooplus.model.User;
import com.client.ws.rasmooplus.model.UserType;
import com.client.ws.rasmooplus.repository.UserRepository;
import com.client.ws.rasmooplus.repository.UserTypeRepository;
import com.client.ws.rasmooplus.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final UserTypeRepository userTypeRepository;

    UserServiceImpl(UserRepository userRepository, UserTypeRepository userTypeRepository){
        this.userRepository = userRepository;
        this.userTypeRepository = userTypeRepository;
    }
//   @Override
//    public List<User> findAll(){
//        return userRepository.findAll();
//    }
//
//    @Override
//    public User findById(Long id) {
//        return getUser(id);
//    }

    @Override
    public User create(UserDto dto) {
        if(Objects.nonNull(dto.getId())){
            throw new BadRequestException("ID must be null ");
        }
        //return userRepository.save(UserMapper.fromDtoToEntity(dto));
        var userTypeOpt = userTypeRepository.findById(dto.getUserTypeId());

        if(userTypeOpt.isEmpty()){
            throw new NotFoundException("userTypeId not found");
        }

        UserType userType = userTypeOpt.get();
        User user =  UserMapper.fromDtoToEntity(dto, userType, null);
        return userRepository.save(user);
    }

//    @Override
//    public User update(Long id, UserDto dto) {
//        getUser(id);
//        dto.setId(id);
//        return userRepository.save(UserMapper.fromDtoToEntity(dto, userType, null));
//    }
//
//    @Override
//    public void delete(Long id) {
//        getUser(id);
//        userRepository.deleteById(id);
//    }
//
//    private User getUser(Long id) {
//        Optional<User> optionalUser = userRepository.findById(id);
//        if(optionalUser.isEmpty()){
//            throw new NotFoundException("User not found");
//        }
//        return optionalUser.get();
//    }

}
