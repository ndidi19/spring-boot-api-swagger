package com.ndiaye.api.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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

    public CreateUserDto() {
    }

    public CreateUserDto(String firstname, String lastname, String email, String address, String zipCode,
                         String country, Long age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.zipCode = zipCode;
        this.country = country;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CreateUserDto{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}
