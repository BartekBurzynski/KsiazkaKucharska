package pl.al.zadanie_aplickaja_ksiazka_kucharska;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/recipe")
@Controller
public class RecipeController {
private RecipeRepository recipeRepository;
private CategoryRepository categoryRepository;

    public RecipeController(RecipeRepository recipeRepository, CategoryRepository categoryRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
    }


    @GetMapping("/dodaj")
    public String addForm(Model model, @RequestParam int categoryId) {
        Recipe recipe = new Recipe();
        recipe.setCategory(categoryRepository.findById(categoryId).orElse(null));

        model.addAttribute("recipe", recipe);
        model.addAttribute("category", categoryRepository.findAll());
        return "categoryDodaj";

    }
}
