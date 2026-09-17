package pe.edu.upc.equipovirtual6.controllers;

import org.hibernate.mapping.List;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.equipovirtual6.entitites.MedicalCategory;
import pe.edu.upc.equipovirtual6.servicesinterfaces.VeterinaryAttentionService;

@RestController
@RequestMapping("/api/pets")
public class TreatmentController {
    private final VeterinaryAttentionService vaS;
    private final MedicalCategoryService medicalCategoryService mcS;
    private final ModelMapper modelMapper;

    public TreatmentController(VeterinaryAttentionService vaS, ModelMapper modelMapper) {
        this.vaS = vaS;
        this.modelMapper = modelMapper;
    }

    // HU2
    @GetMapping("/totals")
    public ResponseEntity<List>
}
