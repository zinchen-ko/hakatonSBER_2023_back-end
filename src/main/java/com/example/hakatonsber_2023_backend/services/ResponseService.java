package com.example.hakatonsber_2023_backend.services;

import com.example.hakatonsber_2023_backend.entity.*;
import com.example.hakatonsber_2023_backend.repositories.ResponseRepository;
import com.example.hakatonsber_2023_backend.repositories.SettingsRepository;
import com.example.hakatonsber_2023_backend.repositories.StatusRepository;
import com.example.hakatonsber_2023_backend.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ResponseService {

    @Autowired
    private StatusRepository statusRepository;

    @Autowired
    private ResponseRepository responseRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private SettingsRepository settingsRepository;


    public List<Status> getStatus() {
        return statusRepository.findAll();
    }

    public List<Response> getResponse() {
        return responseRepository.findAll();
    }

    public void init() {
        Status status = new Status("Отклик прошёл собеседование");
        Status status1 = new Status("Не прошёл собеседование");
        Status status2 = new Status("В ожидании");
        Status status3 = new Status("Отклик не прошёл");

        statusRepository.save(status);
        statusRepository.save(status1);
        statusRepository.save(status2);
        statusRepository.save(status3);

        Account account1 = new Account("Saint-Petersburg");
        Account account2 = new Account("London");
        Account account3 = new Account("Samara");
        Account account4 = new Account("Moscow");


        Department department1 = new Department("Moscowskiy", account1, 7, 9);
        Department department2 = new Department("Londonskiy", account2, 4, 6);
        Department department3 = new Department("Samarkiy", account3, 5, 5);
        Department department4 = new Department("Moscowskiy", account4, 9, 10);

        Employee employee1 = new Employee("Kostya","Zinchenko","Sergeevich", "",account1);
        Employee employee2 = new Employee("Maxim","Zinchenko","Sergeevich", "",account2);
        Employee employee3 = new Employee("Maxim","Zinchenko","Sergeevich", "",account3);
        Employee employee4 =new Employee("Kostya","Zinchenko","Nikolaevich", "",account4);

        Response response1 = new Response("YEAP", employee1, department1, status,"");
        Response response2 = new Response("Yessss", employee2, department2, status1, "");
        Response response3 =new Response("NoOo", employee3, department3, status,"");
        Response response4 =new Response("oOOOOyeee", employee4, department4, status,"");

        responseRepository.save(response1);
        responseRepository.save(response2);
        responseRepository.save(response3);
        responseRepository.save(response4);

        taskRepository.save(new Task("Подрочить сидящему слева", new Date(), new Date(), employee1,response1));
        taskRepository.save(new Task("Подрочить сидящему справа", new Date(), new Date(), employee2,response2));
        taskRepository.save(new Task("Подрочить сидящему сзади", new Date(), new Date(), employee3, response3));
        taskRepository.save(new Task("Подрочить сидящему спереди", new Date(), new Date(), employee4, response4));
    }
}
