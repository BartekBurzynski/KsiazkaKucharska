package pl.bb.ksiazka_kucharska.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.bb.ksiazka_kucharska.model.Category;
import pl.bb.ksiazka_kucharska.Repository.CategoryRepository;

import java.util.Optional;

@Controller
public class CategoryDataController {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryDataController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/category/{id}")
    public String home(@PathVariable Integer id, Model model) {
        Optional<Category> optional = categoryRepository.findById(id);

        if (optional.isPresent()) {
            Category category = optional.orElse(null);
            model.addAttribute("category", category);
            return "category";
        } else {
            return "notFound";
        }

    }
}
