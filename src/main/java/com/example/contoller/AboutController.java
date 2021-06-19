//package com.example.cv.controller;
package com.example.contoller;


import com.example.model.About;
import com.example.repository.AboutRepository;
import com.example.service.AboutService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AboutController {

    private final AboutRepository aboutRepository;
    private final AboutService aboutService;

    public AboutController(AboutRepository aboutRepository, AboutService aboutService) {
        this.aboutRepository = aboutRepository;
        this.aboutService = aboutService;
    }



    @RequestMapping(value = "/abouts", method = RequestMethod.GET)
    public String getAbout(){
        return "about/about";
    }



    //get about page
@RequestMapping(value = {"/about"}, method = RequestMethod.GET)
public String getAbout(Model model) {
    List<About> list = aboutRepository.findAll();
    model.addAttribute("abouts", list);
    return "about/about";
}


    //get edit view about by id
    @RequestMapping(value = {"/about_edit/{id}"}, method = RequestMethod.GET)
    public String getEditAbout(Model model, @PathVariable("id") Long id) {
        About about = aboutRepository.findById(id);
        model.addAttribute("about", about);
        return "about/about_edit";
    }

    // save edit about
    @RequestMapping(value = {"/about_edit/{id}"}, method = RequestMethod.POST)
    public RedirectView postEditAbout(@ModelAttribute About newAbout, @PathVariable("id") Long id) {
        aboutRepository.save(newAbout);
        return new RedirectView("/about");
    }




}

////package com.example.cv.controller;
//package com.example.contoller;
//
//
//        import com.example.model.About;
//        import com.example.repository.AboutRepository;
//        import com.example.service.AboutService;
//        import org.springframework.stereotype.Controller;
//        import org.springframework.ui.Model;
//        import org.springframework.web.bind.annotation.*;
//        import org.springframework.web.servlet.view.RedirectView;
//
//        import java.util.List;
//
//@Controller
//public class AboutController {
//
//    private final AboutRepository aboutRepository;
//    private final AboutService aboutService;
//
//    public AboutController(AboutRepository aboutRepository, AboutService aboutService) {
//        this.aboutRepository = aboutRepository;
//        this.aboutService = aboutService;
//    }
//
//
//
//    @RequestMapping(value = "/abouts", method = RequestMethod.GET)
//    public String getAbout(){
//        return "about/about";
//    }
//
//
//
//    //get about page
//    @RequestMapping(value = {"/about"}, method = RequestMethod.GET)
//    public String getAbout(Model model) {
//        List<About> list = aboutRepository.findAll();
//        model.addAttribute("abouts", list);
//        return "about/about";
//    }
//
//
//    //get edit view about by id
//    @RequestMapping(value = {"/about_edit/{id}"}, method = RequestMethod.GET)
//    public String getEditAbout(Model model, @PathVariable("id") Long id) {
//        About about = aboutRepository.findById(id).orElse(null);
//        model.addAttribute("about", about);
//        return "about/about_edit";
//    }
//
//    // save edit about
//    @RequestMapping(value = {"/about_edit/{id}"}, method = RequestMethod.POST)
//    public RedirectView postEditAbout(@ModelAttribute About newAbout, @PathVariable("id") Long id) {
//        aboutRepository.save(newAbout);
//        return new RedirectView("/about");
//    }
//
//
//
//
//}
//
