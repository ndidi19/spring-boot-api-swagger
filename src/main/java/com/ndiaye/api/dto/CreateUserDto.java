package com.ndiaye.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserDto {

    @NotEmpty(message = "Should not be empty")
    private String firstname;
    @NotNull(message = "Should not be null")
    private String lastname;
    @NotEmpty(message = "Should not be empty")
    private String email;
    private String address;
    private String zipCode;
    private String country;
    private Long age;
}
