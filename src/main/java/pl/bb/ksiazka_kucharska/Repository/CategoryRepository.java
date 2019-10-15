package pl.bb.ksiazka_kucharska.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bb.ksiazka_kucharska.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
