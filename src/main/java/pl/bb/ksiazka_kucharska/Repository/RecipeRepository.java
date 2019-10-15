package pl.bb.ksiazka_kucharska.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bb.ksiazka_kucharska.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
