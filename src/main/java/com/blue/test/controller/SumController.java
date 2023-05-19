package com.blue.test.controller;

import com.blue.test.service.FirstUniqueSum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class SumController {
    
    @GetMapping("/sum")
    public Integer sum (@RequestParam int[] a) {
        return FirstUniqueSum.getSum(a);
    }
}
