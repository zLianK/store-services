package com.lk.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
