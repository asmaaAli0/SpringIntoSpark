package com.example.sparkdemo.controller;

import com.example.sparkdemo.model.Count;
import com.example.sparkdemo.service.WordCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordCountController {

    @Autowired
    private WordCountService wordCountService;

    @GetMapping("/wordCount")
    public List<Count> getWordCount() {
        return this.wordCountService.getWordCount();
    }
}
