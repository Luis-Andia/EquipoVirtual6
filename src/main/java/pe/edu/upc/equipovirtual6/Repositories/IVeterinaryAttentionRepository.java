package pe.edu.upc.equipovirtual6.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.equipovirtual6.entitites.VeterinaryAttention;

@Repository
public interface IVeterinaryAttentionRepository extends JpaRepository<VeterinaryAttention,Long> {
}
