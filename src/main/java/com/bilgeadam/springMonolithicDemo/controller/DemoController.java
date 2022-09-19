package com.bilgeadam.springMonolithicDemo.controller;
/*
* bu classı bir rest conttroller haline getirelim
*
* bir getName metodu yazalım bize String olarak ismimizi dönsün
*
* bunuda browser da gözlemleyelim
*
*
* */


/*
*
*
*
* */


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

@GetMapping("/getname")
public ResponseEntity<String> getName(){
return   ResponseEntity.ok( "Mustafa")  ;
}

@GetMapping("/getallname")
public  ResponseEntity<List<String>>  getAllName(){
    List<String> names=new ArrayList<>();
    names.add("Sinem");
    names.add("Kemal");
    names.add("Işıl");
    return  ResponseEntity.ok(names);
}




}
