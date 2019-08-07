package com.example.demo.controllers;

import com.example.demo.Services.DeployService;
import com.example.demo.models.Deploy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class DeployController {

    private DeployService deployService;

    @Autowired
    public DeployController(DeployService deployService) {
        this.deployService = deployService;
    }

    @GetMapping
    public ModelAndView form() {
        ModelAndView mv = new ModelAndView("deploy");
        mv.addObject("deploy", new Deploy());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Validated Deploy deploy) {
        ModelAndView mv = new ModelAndView("deploy-success");
        deploy = deployService.save(deploy);
        mv.addObject("deploy", deploy);
        return mv;
    }

}
