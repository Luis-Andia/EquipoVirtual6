package pe.edu.upc.equipovirtual6.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class VeterinaryAttentionDTO {

    private String petName;
    private String ownerName;
    private String description;
    private String veterinarian;
    private LocalDate attentionDate;
    private String diagnosis;
    private Double cost;
    private String status;
}
