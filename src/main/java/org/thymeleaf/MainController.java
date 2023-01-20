package org.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String home() {
        return "/layouts/home";
    }
    @RequestMapping("/products")
    public String products() {
        return "/layouts/products";
    }
    @RequestMapping("/about")
    public String about() {
        return "/layouts/about";
    }
}