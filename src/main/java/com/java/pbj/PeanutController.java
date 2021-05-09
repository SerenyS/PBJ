package com.java.pbj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/peanut")
public class PeanutController {
    @RequestMapping("peanutSteps")
    public String showPeanutSteps(){ return "pages/peanutSteps";}
}

