package com.example.test_techincal_code;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Main {
    ModelAndView mavIndex = new ModelAndView("index");


    @RequestMapping(value = "/")
    public ModelAndView index() {
        return mavIndex;
    }

    @RequestMapping(value = "/generateNumber" , method = RequestMethod.GET)
    public ModelAndView generateNumber(@RequestParam String caseNumber, @RequestParam int number)  {
        List<Integer> al = new ArrayList<>();
        switch (caseNumber) {
            case "normal":
                int[] digitsNormal = Integer.toString(number).chars().map(c -> c-'0').toArray();
                for(int d : digitsNormal)

                    al.add(d);
                break;
            case "odd":
                int[] digitsOdd = Integer.toString(number).chars().map(c -> c-'0').toArray();
                for(int d : digitsOdd)
                al.add(d);
                break;
            case "prime":
                int[] digistPrime = Integer.toString(number).chars().map(c -> c-'0').toArray();
                for(int d : digistPrime)
                al.add(d);
                break;
            default:
                break;
        }
        return (ModelAndView) al;
    }

}