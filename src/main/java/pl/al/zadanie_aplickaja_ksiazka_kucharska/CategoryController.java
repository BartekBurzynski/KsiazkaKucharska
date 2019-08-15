package pl.al.zadanie_aplickaja_ksiazka_kucharska;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    @Autowired private CategoryRepository categoryRepository;

    @GetMapping("/")
    public String home(Model model){


        model.addAttribute("kategoria", categoryRepository.findAll());
        return "home";
    }

}
