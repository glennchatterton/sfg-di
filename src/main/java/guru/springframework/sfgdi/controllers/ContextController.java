package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class ContextController {

    public String printText() {
        System.out.println("println text!");

        return "return text";
    }
}
