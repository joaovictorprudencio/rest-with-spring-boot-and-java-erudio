package br.com.curso.demo.hellou;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class helloucontroler {
    
private static final String template = "hello, %s";
private  final  AtomicLong couter = new AtomicLong();



@RequestMapping("/demo")
public Hellou hellou(@RequestParam(value = "name", defaultValue = "world") String name){

    
    return new Hellou(couter.incrementAndGet(), String.format(template,name));
}





}
