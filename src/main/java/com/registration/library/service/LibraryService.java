package com.registration.library.service;


import com.registration.library.model.Library;
import com.registration.library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository repository;


    public Library saveUser(Library library){
        return repository.save(library);
    }

    public List<Library> getAll(){
        return repository.findAll();
    }

    public Library updateLibrary(Library library){
        return repository.save(library);
    }

    public void deleteCourse(Long id){
        repository.deleteById(id);
    }
}
