package com.Luan.Thymeleaf.Rest;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.HttpRequestHandlerServlet;


@Controller

public class DemoThymeleafController {

    @GetMapping("/")
    public String HelloForm(){

        return "form";
    }
    @GetMapping("/form")
    public String ShowForm(@RequestParam("studentName") String studentName, Model model){
        // read request param from form html

        // convert data to up caps
        studentName = studentName.toUpperCase();
        // create a message
        String message = "YO KA OA: " + studentName;
        // add message to model
        model.addAttribute("name",message);

        return "showForm";
    }
}
