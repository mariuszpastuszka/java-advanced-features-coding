package com.sda.sql_mapping;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressEntity {

    private Long id;

    private String city;

    private String street;

    private Long flatNumber;

    private String zipCode;
}
