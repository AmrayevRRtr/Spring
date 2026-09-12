package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MoodService {

    public String getMood(String mood) {
        return "My mood at start of the course is " + mood;
    }
}
