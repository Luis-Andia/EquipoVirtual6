package pe.edu.upc.equipovirtual6.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.equipovirtual6.entitites.Treatment;

@Repository
public interface ITreatmentRepository extends JpaRepository<Treatment,Long> {
}
