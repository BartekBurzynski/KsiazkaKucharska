package pl.al.zadanie_aplickaja_ksiazka_kucharska;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AllRecipesController {

    private RecipeRepository recipeRepository;
    private CategoryRepository categoryRepository;

    public AllRecipesController(RecipeRepository recipeRepository, CategoryRepository categoryRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/recipes")
    public String home(Model model) {


        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipes";
    }

}
