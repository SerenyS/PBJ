package com.java.pbj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jelly")
public class JellyController {
    @RequestMapping("jellySteps")
    public String showJellySteps(){ return "pages/jellySteps";}
}
