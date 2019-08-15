package pl.al.zadanie_aplickaja_ksiazka_kucharska;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
