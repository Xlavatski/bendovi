package hr.bj2020.bendovidemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BendControler {

    @RequestMapping("/")
    public String home () {
        return "bendovi.html";
    }

    @RequestMapping("/slider")
    public String slider () {
        return "index.html";
    }
}
