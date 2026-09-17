package pe.edu.upc.equipovirtual6.entitites;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "Treatment")
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 35,nullable = false)
    private String name;

    @Column(name = "quantity",nullable = false)
    private int quantity;

    @Column(name = "treatmentDate",nullable = false)
    private LocalDate treatmentDate;

    @Column(name = "startTime",nullable = false)
    private Time startTime;

    @Column(name = "duration",nullable = false)
    private int duration;

    @Column(name = "cost",nullable = false)
    private double cost;

    @Column(name = "responsible",length = 35,nullable = false)
    private String responsible;

    @ManyToOne
    @JoinColumn(name = "attentionId")
    private VeterinaryAttention veterinaryAttention;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private MedicalCategory medicalCategory;

    // Constructores

    public Treatment() {
    }

    public Treatment(Long id, String name, int quantity, LocalDate treatmentDate, Time startTime, int duration, double cost, String responsible, VeterinaryAttention veterinaryAttention, MedicalCategory medicalCategory) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.treatmentDate = treatmentDate;
        this.startTime = startTime;
        this.duration = duration;
        this.cost = cost;
        this.responsible = responsible;
        this.veterinaryAttention = veterinaryAttention;
        this.medicalCategory = medicalCategory;
    }

    // GET AND SET

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(LocalDate treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public VeterinaryAttention getVeterinaryAttention() {
        return veterinaryAttention;
    }

    public void setVeterinaryAttention(VeterinaryAttention veterinaryAttention) {
        this.veterinaryAttention = veterinaryAttention;
    }

    public MedicalCategory getMedicalCategory() {
        return medicalCategory;
    }

    public void setMedicalCategory(MedicalCategory medicalCategory) {
        this.medicalCategory = medicalCategory;
    }
}

