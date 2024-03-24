package com.example.demo.controllers;

import com.example.demo.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller


public class MyFirstController {
    private final Calculator calculator;

    public MyFirstController(Calculator calculator) {
        this.calculator = calculator;
    }



    @RequestMapping(method = RequestMethod.GET, value = "hello")
    public @ResponseBody String sayHello(@RequestParam int a, @RequestParam int b) {
        return "The sum is" + this.calculator.add(a, b);
    }

    @RequestMapping(method = RequestMethod.GET, value = "hello1/{a}/{b}")
    public @ResponseBody String sayHi(@PathVariable int a, @PathVariable int b) {
        return "The diff is" + " " + this.calculator.sub(a, b);
    }

    @RequestMapping(method = RequestMethod.POST, value = "hello2")
    public @ResponseBody String sayHi(@RequestBody RequestDto req) {
        return "The Sum is" + this.calculator.add(req.getB(), req.getA());
    }

    @RequestMapping(method = RequestMethod.GET,value="hello3")
    public String sayHi(){
        return "test.html";
        //return "The Sum is" +this.calculator.add(a,b);
    }
}


    class RequestDto{
        private int a;
        private int b;
        public int getA(){return a;}
        public void setA(int A){this.a=a;}
        public int getB(){return b;}
        public void setB(int b){this.b=b;}


}
