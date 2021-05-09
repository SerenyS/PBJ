package com.java.pbj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/bread")
public class BreadController {
    @RequestMapping("breadSteps")
    public String showBreadSteps(){ return "pages/breadSteps";}
}
