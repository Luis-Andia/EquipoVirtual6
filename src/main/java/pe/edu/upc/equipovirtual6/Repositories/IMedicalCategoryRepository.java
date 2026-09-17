package pe.edu.upc.equipovirtual6.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.equipovirtual6.entitites.MedicalCategory;

@Repository
public interface IMedicalCategoryRepository extends JpaRepository<MedicalCategory,Long> {
}
