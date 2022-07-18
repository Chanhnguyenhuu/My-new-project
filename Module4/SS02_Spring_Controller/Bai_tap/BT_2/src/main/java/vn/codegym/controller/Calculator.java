package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Calculator {

    @GetMapping
    public String view() {
        return "index";
    }

}