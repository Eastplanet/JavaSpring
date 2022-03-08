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
        @ResponseBody로 http통신 프로토콜의 body부에 데이터를 직접 넣어주겠다는걸 명시
        MVC와 달리 API 방식은 viewResolver가 아니라 String은 StringConverter가 객체는 JsonConverter가 변환한다.

        MVC에서 return "hello";를 통해 hello.html으로 전달?되었지만
        API에서는 return "hello";은 hello 라는 문자가 전달된다.
        또한 객체를 리턴할 경우 json 형식으로 전달된다.


     */
    
    //문자열 리턴

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name")String name){
        return "hello " + name;
    }

    //객체 리턴

    @GetMapping("hello-api")
    @ResponseBody
    public hello.hellospring.controller.HelloController.Hello helloApi(@RequestParam("name") String name){
        hello.hellospring.controller.HelloController.Hello hello = new hello.hellospring.controller.HelloController.Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }


    }



}
