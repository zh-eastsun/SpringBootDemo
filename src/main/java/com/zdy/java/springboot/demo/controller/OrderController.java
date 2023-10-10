package com.zdy.java.springboot.demo.controller;

import com.zdy.java.springboot.demo.bean.TacoOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("tacoOrder", new TacoOrder());
        return "order";
    }

    @PostMapping("/current")
    public String processOrder(TacoOrder tacoOrder) {
        log.info("Order submitted: " + tacoOrder);
        return "redirect:/orders/current";
    }
}
