package pe.edu.upc.equipovirtual6.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.equipovirtual6.entitites.VeterinaryAttention;
import pe.edu.upc.equipovirtual6.servicesinterfaces.VeterinaryAttentionService;
import pe.edu.upc.equipovirtual6.Repositories.iVeterinaryAttentionRepository;

@Service
public class VeterinaryAttentionImplements implements VeterinaryAttentionService {
    private final iVeterinaryAttentionRepository vAR;

    public VeterinaryAttentionImplements(iVeterinaryAttentionRepository vAR) {
        this.vAR = vAR;
    }

    @Override
    public void insert(VeterinaryAttention vA) {
        vAR.save(vA);
    }
}
