package com.example.sparkdemo.service;

import com.example.sparkdemo.model.Count;

import java.util.List;

public interface WordCountService {
    List<Count> getWordCount();
}
