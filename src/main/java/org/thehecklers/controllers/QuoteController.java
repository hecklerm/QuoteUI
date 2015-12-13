package org.thehecklers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thehecklers.services.QuoteService;

/**
 * Created by markheckler on 12/13/15.
 */
//@RestController
@Controller
public class QuoteController {
    @Autowired
    QuoteService service;

    @RequestMapping("/random")
    public String randomQuote(Model model) {
        model.addAttribute("quote", service.randomQuote());
        return "quote";
    }
//    public Quote randomQuote() {
//        return service.randomQuote();
//    }
}
