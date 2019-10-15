package pl.bb.ksiazka_kucharska.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.bb.ksiazka_kucharska.Repository.CategoryRepository;
import pl.bb.ksiazka_kucharska.Repository.RecipeRepository;


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
