package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    // 웹앱에서 /hello가 들어오면 이 메소드 호출 html의 GET
    @GetMapping("hello")
    public String hello(Model model){ // MVC의 그 model
        model.addAttribute("data", "hello!!");
        return "hello"; //template 리턴
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // 응답 http의 body부에 이 데이터를 넣어주겠다.
    public String helloString(@RequestParam("name") String name) {
        return "hello" + name; // view없이 문자가 바로 내려감
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello { // static class라 class안에 class 가능
        private String name;
        private int age = 10;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
