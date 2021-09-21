package com.rudyah;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int t1, @RequestParam("t2") int t2){
        System.out.println(t1+t2);
        ModelAndView modelAndView = new ModelAndView("display.jsp");
        modelAndView.addObject("sum", t1 + t2);
        return modelAndView;
    }
}
