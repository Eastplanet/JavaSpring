# JavaSpring 입문

#View 환경설정

resources/static/index.html
  <!DOCTYPE HTML>
  
  <html>
  
  <head>
    
   <title>Hello</title>
    
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    
  </head>
  
  <body>
    
  Hello
    
  <a href="/hello">hello</a>
    
  </body>
  
  </html>
  
  
스프링 부트가 제공하는 Welcome Page기능을 이용하기 위해서는 static/index.html을 만들어야 한다.
위의 href로 /hello로 가게된다.

  @Controller
  public class HelloController {
   @GetMapping("hello")
   public String hello(Model model) {
   model.addAttribute("data", "hello!!");
   return "hello";
   }
  }
~/hello 와같이 get방식으로 들어왔다면 위의 코드를 실행한다. (Model ??) model에 data라는 키에 hello!!데이터를 추가한뒤 리턴을 통해 hello.html로 가게된다.


  resources/templates/hello.html
  <!DOCTYPE HTML>
  <html xmlns:th="http://www.thymeleaf.org">
  <head>
   <title>Hello</title>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>
  <p th:text="'안녕하세요. ' + ${data}" >안녕하세요. 손님</p>
  </body>
  </html>
타임리프 템플릿을 이용하여 ${key}를 이용하여 값을 꺼낼수 있다.
