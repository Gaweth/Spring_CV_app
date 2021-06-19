package com.example.service;

import com.example.model.About;
import com.example.repository.AboutRepository;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    private final AboutRepository aboutRepository;

    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public About getAbout(Long id){
        return aboutRepository.findById(id);
    }


    }

