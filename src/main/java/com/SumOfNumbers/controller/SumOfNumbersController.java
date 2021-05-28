package com.SumOfNumbers.controller;
import com.SumOfNumbers.model.count;
import com.SumOfNumbers.service.SumOfNumbers;

import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SumOfNumbersController {
    @Autowired
    private SumOfNumbers sumofnumbers;

    @GetMapping("/primeCount")
    public int getCount() {
        return this.sumofnumbers.getCount();
    }
}
