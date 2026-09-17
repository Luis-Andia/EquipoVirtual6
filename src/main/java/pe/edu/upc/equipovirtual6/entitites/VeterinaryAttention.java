package pe.edu.upc.equipovirtual6.entitites;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "VeterinaryAttention")
public class VeterinaryAttention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attentionId;
    @Column(name = "petName",length = 30,nullable = false)
    private String petName;

    @Column(name = "ownerName",nullable = false,length = 150)
    private String ownerName;

   @Column(name = "description",length = 30,nullable = false)
    private String description;

   @Column(name = "veterinarian",length = 30,nullable = false)
    private String veterinarian;

    @Column(name = "attentionDate", nullable = false)
    private LocalDate attentionDate;

    @Column(name = "diagnosis",length = 30,nullable = false)
    private String diagnosis;

    @Column(name = "cost", nullable = false)
    private Double cost;

    @Column(name = "status",length = 30,nullable = false)
    private String status;

    // Constructores
    public VeterinaryAttention() {
    }

    public VeterinaryAttention(Long id, String petName, String ownerName, String description, String veterinarian, LocalDate attentionDate, String diagnosis, Double cost, String status) {
        this.attentionId = attentionId;
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

    public Long getattentionId() {
        return attentionId;
    }

    public void setattentionId(Long id) {
        this.attentionId = id;
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
