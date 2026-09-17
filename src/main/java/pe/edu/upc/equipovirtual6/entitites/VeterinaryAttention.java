package pe.edu.upc.equipovirtual6.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "activities")
public class VeterinaryAttention {
    private Long id;
    private String petName;
    private String ownerName;
    private String description;
    private String veterinarian;
    private LocalDate attentionDate;
    private String diagnosis;
    private Double cost;
    private String status;

    // Constructores
    public VeterinaryAttention() {
    }

    public VeterinaryAttention(Long id, String petName, String ownerName, String description, String veterinarian, LocalDate attentionDate, String diagnosis, Double cost, String status) {
        this.id = id;
        this.petName = petName;
        this.ownerName = ownerName;
        this.description = description;
        this.veterinarian = veterinarian;
        this.attentionDate = attentionDate;
        this.diagnosis = diagnosis;
        this.cost = cost;
        this.status = status;
    }

    // Get y set

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(String veterinarian) {
        this.veterinarian = veterinarian;
    }

    public LocalDate getAttentionDate() {
        return attentionDate;
    }

    public void setAttentionDate(LocalDate attentionDate) {
        this.attentionDate = attentionDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
