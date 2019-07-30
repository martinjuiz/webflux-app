//package com.example.demo.controller;
//
//import com.example.demo.repository.MovieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
//import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
//
//@Controller
//public class MovieController {
//
//    @Autowired
//    private MovieRepository movieRepository;
//
//    @RequestMapping("/")
//    public String index(final Model model) {
//
//        // loads 1 and display 1, stream data, data driven mode.
//        IReactiveDataDriverContextVariable reactiveDataDrivenMode =
//                new ReactiveDataDriverContextVariable(movieRepository.findAll(), 1);
//
//        model.addAttribute("movies", reactiveDataDrivenMode);
//
//        return "index";
//
//    }
//
//    @RequestMapping("/movies")
//    public String findMovieNames(final Model model) {
//
//        // loads 1 and display 1, stream data, data driven mode.
//        IReactiveDataDriverContextVariable reactiveDataDrivenMode =
//                new ReactiveDataDriverContextVariable(movieRepository.findAll(), 1);
//
//        model.addAttribute("movieNames", reactiveDataDrivenMode);
//
//        return "movies";
//    }
//
//}