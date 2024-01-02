package com.Luan.Thymeleaf.Rest;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;


@Controller

public class DemoThymeleafController {

    @GetMapping("/")
    public String HelloForm(){

        return "form";
    }
    @GetMapping("/form")
    public String ShowForm(HttpServletRequest theRequest, Model model){
        // read request param from form html
        String name = theRequest.getParameter("firstName");
        // convert data to up caps
        name = name.toUpperCase();
        // create a message
        String message = "YO KA OA: " + name;
        // add message to model
        model.addAttribute("name",message);

        return "showForm";
    }
}
