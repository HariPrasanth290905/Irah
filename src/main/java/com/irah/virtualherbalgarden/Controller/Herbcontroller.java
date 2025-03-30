package com.irah.virtualherbalgarden.Controller;

import java.util.List;

import com.irah.virtualherbalgarden.Model.Herbdata;
import com.irah.virtualherbalgarden.Repository.HerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Herbcontroller {

    @Autowired
    HerbRepository hr;

    //comment added
    @GetMapping("/")
    public String welcome() {
        System.out.println("Welcome to Herbcontroller");
        return "index";
    }

    @ResponseBody
    @GetMapping(value = "/api/herbs", produces = "application/json")
    public List<Herbdata> displayall() {
        return hr.findAll();
    }

    @ResponseBody
    @GetMapping(value = "/api/herbs/{id}", produces = "application/json")
    public Herbdata displayone(Model m, @PathVariable int id) {

        return hr.findById(id);
    }
}
