package com.ndiaye.api.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UpdateUserDto {

    @NotEmpty(message = "Should not be empty")
    private String address;
    @NotEmpty(message = "Should not be empty")
    private String zipCode;
    @NotNull(message = "Should not be null")
    private String country;

    public UpdateUserDto() {
    }

    public UpdateUserDto(String address, String zipCode, String country) {
        this.address = address;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "UpdateUserDto{" +
                "address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
