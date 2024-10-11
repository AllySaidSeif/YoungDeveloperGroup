package com.registration.library.controller;


import com.registration.library.model.Library;
import com.registration.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
@CrossOrigin
public class LibraryController {

    @Autowired
    private LibraryService service;


    @PostMapping("/registerUser")
    public String saveUser(@RequestBody Library library){
        service.saveUser(library);
        return "User registered";
    }

    @GetMapping("/getAll")
    public List<Library> getAll(){
        return service.getAll();
    }

    @PutMapping("/update/{id}")
    public Library updateLibrary(@PathVariable Long id, @RequestBody Library library){
        library.setId(id);
        return service.updateLibrary(library);
    }

    @DeleteMapping("/delete")
    public void deleteLibrary(@RequestParam Long id){
        service.deleteCourse(id);
    }
}
