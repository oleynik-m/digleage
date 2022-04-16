package com.example.digleage.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public Map<String,Object> ok() {
        Map<String,Object> response = new HashMap();
        response.put("responseCode",HttpStatus.OK.value());
        response.put("responseValue", "The HTTP Status will be OK");
        return response;
    }
}
