package pe.edu.upc.equipovirtual6.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.equipovirtual6.servicesinterfaces.VeterinaryAttentionService;

@RestController
@RequestMapping("/api/pets")
public class VeterinaryAttentionController {
    private final VeterinaryAttentionService vaS;
    private final ModelMapper modelMapper;

    public VeterinaryAttentionController(VeterinaryAttentionService vaS, ModelMapper modelMapper) {
        this.vaS = vaS;
        this.modelMapper = modelMapper;
    }

}
