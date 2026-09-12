package com.example.demo.controller;

import org.example.practice1.service.MoodService;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/moods")
public class MoodController {

    private final MoodService moodService;

    public MoodController(MoodService moodService) {
        this.moodService = moodService;
    }

    @GetMapping
    public String get(@RequestParam String mood) {
        return moodService.getMood(mood);
    }

    @PostMapping
    public String add(@RequestBody String mood) {
        return moodService.getMood(mood);
    }
}
