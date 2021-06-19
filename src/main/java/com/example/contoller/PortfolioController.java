package com.example.contoller;

import com.example.model.Portfolio;
import com.example.repository.PortfolioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class PortfolioController {

   private final PortfolioRepository portfolioRepository;

    public PortfolioController(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

//    @RequestMapping(value = "/portfolio", method = RequestMethod.GET)
//    public String getPortfolio() {
//        return "portfolio/portfolio";
//    }

    //get about page
    @RequestMapping(value = {"/portfolio"}, method = RequestMethod.GET)
    public String getPortfolio(Model model) {
        List<Portfolio> list = portfolioRepository.findAll();
        model.addAttribute("portfolios", list);
        return "portfolio/portfolio";
    }


    //get edit view about by id
    @RequestMapping(value = {"/portfolio_edit/{id}"}, method = RequestMethod.GET)
    public String getEditPortfolio(Model model, @PathVariable("id") Long id) {
        Portfolio portfolio = portfolioRepository.findById(id);
        model.addAttribute("portfolio", portfolio);
        return "portfolio/portfolio_edit";
    }

    // save edit about
    @RequestMapping(value = {"/portfolio-details/{id}"}, method = RequestMethod.POST)
    public RedirectView postEditPortfolio(@ModelAttribute Portfolio newPortfolio, @PathVariable("id") Long id) {
        portfolioRepository.save(newPortfolio);
        return new RedirectView("portfolio/portfolio");
    }


}



//package com.example.contoller;
//
//        import com.example.model.Portfolio;
//        import com.example.repository.PortfolioRepository;
//        import org.springframework.stereotype.Controller;
//        import org.springframework.ui.Model;
//        import org.springframework.web.bind.annotation.ModelAttribute;
//        import org.springframework.web.bind.annotation.PathVariable;
//        import org.springframework.web.bind.annotation.RequestMapping;
//        import org.springframework.web.bind.annotation.RequestMethod;
//        import org.springframework.web.servlet.view.RedirectView;
//
//        import java.util.List;
//
//@Controller
//public class PortfolioController {
//
//    private final PortfolioRepository portfolioRepository;
//
//    public PortfolioController(PortfolioRepository portfolioRepository) {
//        this.portfolioRepository = portfolioRepository;
//    }
//
////    @RequestMapping(value = "/portfolio", method = RequestMethod.GET)
////    public String getPortfolio() {
////        return "portfolio/portfolio";
////    }
//
//    //get about page
//    @RequestMapping(value = {"/portfolio"}, method = RequestMethod.GET)
//    public String getPortfolio(Model model) {
//        List<Portfolio> list = portfolioRepository.findAll();
//        model.addAttribute("portfolios", list);
//        return "portfolio/portfolio";
//    }
//
//
//    //get edit view about by id
//    @RequestMapping(value = {"/portfolio_edit/{id}"}, method = RequestMethod.GET)
//    public String getEditPortfolio(Model model, @PathVariable("id") Long id) {
//        Portfolio portfolio = portfolioRepository.findById(id).orElse(null);
//        model.addAttribute("portfolio", portfolio);
//        return "portfolio/portfolio_edit";
//    }
//
//    // save edit about
//    @RequestMapping(value = {"/portfolio-details/{id}"}, method = RequestMethod.POST)
//    public RedirectView postEditPortfolio(@ModelAttribute Portfolio newPortfolio, @PathVariable("id") Long id) {
//        portfolioRepository.save(newPortfolio);
//        return new RedirectView("portfolio/portfolio");
//    }
//
//
//}
