package com.SumOfNumbers.service.impl;

import com.SumOfNumbers.service.SumOfNumbers;
import com.SumOfNumbers.service.SumOfNumbers;
import com.example.sparkdemo.service.WordCountService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class SumOfNumbersImpl implements SumOfNumbers {
    @Autowired
    private JavaSparkContext sc;

    @Override
    public int getCount(){
        int countr = 0;

        JavaRDD<String> lines = sc.textFile("D:\\iti\\java\\Day 7\\Spark\\src\\in\\prime_nums.text");
        JavaRDD<String> numbers = lines.flatMap(line -> Arrays.asList(line.split("\\s+")).iterator());

        JavaRDD<String> validNumbers = numbers.filter(number -> !number.isEmpty());

        JavaRDD<Integer> intNumbers = validNumbers.map(number -> Integer.valueOf(number));

        countr = intNumbers.reduce((x, y) -> x + y);
        return countr;
    }
}
