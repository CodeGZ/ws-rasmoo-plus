package com.client.ws.rasmooplus.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;


import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionTypeDto {
    private Long id;

    @NotBlank(message = "Name field cannot be null or empty")
    @Size(min = 5, max = 30, message = "The Name field must be between 5 and 30 characters long")
    private String name;

    @Max(value = 12, message = "accessMonths field cannot be greater than 12")
    private Long accessMonths;

    @NotNull(message = "Price field cannot be null")
    private BigDecimal price;

    @NotBlank(message = "productKey field cannot be null or empty")
    @Size(min = 5, max = 15, message = "The productKey field must be between 5 and 15 characters long")
    private String productkey;
}
