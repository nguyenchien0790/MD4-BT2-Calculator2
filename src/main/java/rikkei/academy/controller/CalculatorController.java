package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping()
    public String index() {
        return "index";
    }

    @PostMapping("/result")
    public String calculate(@RequestParam Long n1, Long n2, String cal, Model model) {
        if (cal.equals("Add")) {
            Long rs = n1 + n2;
            model.addAttribute("cal", cal);
            model.addAttribute("rs", rs);
        } else if (cal.equals("Sub")) {
            Long rs = n1 - n2;
            model.addAttribute("cal", cal);
            model.addAttribute("rs", rs);
        } else if (cal.equals("Mult")) {
            Long rs = n1 * n2;
            model.addAttribute("cal", cal);
            model.addAttribute("rs", rs);
        }else {
            Long rs = n1 / n2;
            model.addAttribute("cal", cal);
            model.addAttribute("rs", rs);
        }
        return "index";
    }
}
