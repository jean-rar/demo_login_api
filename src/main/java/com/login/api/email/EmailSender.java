package com.login.api.email;

public interface EmailSender {
    void send(String to, String email);
}
