package spring.async.example.asyncexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.async.example.asyncexample.service.INotifyUserService;

/**
 * *The class AsyncController
 * *Author: Marco Orfei
 */
@RestController
@RequestMapping("/async-example")
@EnableAsync
public class AsyncController {

    @Autowired
    private INotifyUserService notifyUserService;

    @GetMapping("/user")
    public ResponseEntity<String> getUser() throws InterruptedException {
        notifyUserService.getInfoUser();
        return ResponseEntity.status(HttpStatus.OK).body("success");
    }
}
