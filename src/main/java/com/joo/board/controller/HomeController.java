package com.joo.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") // 루트 URL로 매핑
    public String index() {
        System.out.println("HomeController.index");
        return "index";
    }
}
