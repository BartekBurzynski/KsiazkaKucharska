package pl.bb.ksiazka_kucharska.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.bb.ksiazka_kucharska.Repository.CategoryRepository;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/")
    public String home(Model model) {


        model.addAttribute("kategoria", categoryRepository.findAll());
        return "home";
    }

}
