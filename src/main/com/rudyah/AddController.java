package com.rudyah;

import com.rudyah.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    AddService addService;

    AddController(AddService addService){
        this.addService = addService;
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int t1, @RequestParam("t2") int t2){
        ModelAndView modelAndView = new ModelAndView("display");

        int sum = addService.add(t1, t2);
        modelAndView.addObject("sum", sum);

        return modelAndView;
    }
}
