package com.login.api.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return true;
    }
}