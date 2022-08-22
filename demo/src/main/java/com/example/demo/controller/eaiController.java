package com.example.demo.controller;

import com.example.demo.model.eai.AgreementCreate;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.Future;

//@Configuration
//@EnableAsync
@RequestMapping("/api/arda")
@RestController
public  class eaiController{

    private String arda="";


    @GetMapping({"/{id}"})
    public ResponseEntity <String> getArda(@PathVariable("id") String id) {
        return new ResponseEntity<>("arda", HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity handlePost(@RequestBody @NotNull AgreementCreate agreementCreate) {
        System.out.println("Welcome");

        System.out.println(agreementCreate.toString());
        return new ResponseEntity(HttpStatus.OK);
    }
/*
    @Async
    public void asyncRestStarterNoReturn() {
        System.out.println("Execute method asynchronously. "
                + Thread.currentThread().getName());
    }

    @Async
    public Future<String> asyncRestStarter() {
        System.out.println("Execute method asynchronously - "
                + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
            return new AsyncResult<String>("hello world !!!!");
        } catch (InterruptedException e) {
            //
        }

        return null;
    }


     */
}
