package com.scaler.SampleDemo;

import jdk.jshell.PersistentSnippet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // GET call -> /hello -> Hello World with HTTP status code -> 200 OK
    @GetMapping("/hello")
    public ResponseEntity helloWorld(){
        Person p = new Person("Santhosh", 23, "Hello World");
        return ResponseEntity.ok(p);
    }

}
