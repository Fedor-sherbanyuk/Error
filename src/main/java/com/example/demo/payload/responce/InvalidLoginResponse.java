package com.example.demo.payload.responce;

import lombok.Getter;

@Getter
public class InvalidLoginResponse {
    String username;
    String password;

    public InvalidLoginResponse() {
        this.username = "Invalid Username";
        this.password = "Invalid Password";
    }
}
