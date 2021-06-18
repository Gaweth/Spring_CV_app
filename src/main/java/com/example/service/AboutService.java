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
        return aboutRepository.findById(id).orElse(null);
    }

//    public void editAbout(About about, Long id){
//        About edit = new About(
//            id,
//            about.getAbout(),
//            about.getBirthday(),
//            about.getWebsite(),
//            about.getPhone(),
//            about.getAge(),
//            about.getDegree(),
//            about.getEmail(),
//            about.getFreelancer(),
//            about.getId()
//        );
//
//
//        }
    }

