package crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrudController {

    @GetMapping("/page1")
    public String hello(){
        return "page-one";
    }
    @GetMapping("/page2")
    public String bb(){
        return "page-two";
    }
}
