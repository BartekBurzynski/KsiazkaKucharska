package pl.bb.ksiazka_kucharska.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.bb.ksiazka_kucharska.Repository.CategoryRepository;
import pl.bb.ksiazka_kucharska.model.Recipe;
import pl.bb.ksiazka_kucharska.Repository.RecipeRepository;

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

    @PostMapping("/dodaj")
    public String add(Recipe recipe) {
        recipeRepository.save(recipe);
        return "redirect:/category/" + recipe.getCategory().getId();
    }

    @GetMapping("/usun")
    public String delete(@RequestParam long recipeId) {
        recipeRepository.deleteById(recipeId);
        return "recipes";

    }

}