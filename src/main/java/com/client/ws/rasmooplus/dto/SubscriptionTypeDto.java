package com.client.ws.rasmooplus.dto;

import lombok.*;


import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionTypeDto {
    private Long id;
    private String name;

    private Long accessMonths;
    private BigDecimal price;

    private String productkey;
}
