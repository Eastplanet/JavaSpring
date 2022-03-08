package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    /*
        MVC
        주소?에 hello-mvc가 있는지 확인한 후 있다면~
        name1이라는 이름으로 파라미터를 받음 ex) localhost:8080/hello-mvc?name1=hi
        name1으로 받은 데이터를 name3 에 저장
        model에 name2키로 name3의 값을 저장
        이후 hello-template.html로 리턴

        타임리프
        hello-template.html에서는 ${name2}으로 값 접근 가능

     */
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name1") String name3,Model model){
        model.addAttribute("name2",name3);
        return "hello-template";
    }




}
