package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    // 웹앱에서 /hello가 들어오면 이 메소드 호출 html의 GET
    @GetMapping("hello")
    public String hello(Model model){ // MVC의 그 model
        model.addAttribute("data", "abbb!!");
        return "hello"; //template 리턴
    }
}
