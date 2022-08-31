package spring.async.example.asyncexample.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import spring.async.example.asyncexample.dto.User;

/**
 * *The class NotifyUserService
 * *Author: Marco Orfei
 */
@Service
public class NotifyUserService implements INotifyUserService {

    @Async
    @Override
    public void getInfoUser() throws InterruptedException {
        User u = new User();
        u.setName("Marco");
        u.setSurname("The Mark");
        u.setAge(35);
        Thread.sleep(10000L);
        System.out.println(String.format("Hello %s %s. Your age is %d", u.getName(), u.getSurname(), u.getAge()));
    }

}
