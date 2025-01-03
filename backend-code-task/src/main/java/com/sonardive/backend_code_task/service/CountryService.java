package com.sonardive.backend_code_task.service;


import org.springframework.stereotype.Service;

@Service
public class CountryService {
    public String getName(String isoCode) {
        return "name of " + isoCode;
    }
}