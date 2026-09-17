package pe.edu.upc.equipovirtual6.entitites;

import jakarta.persistence.*;

@Entity
@Table(name = "medical_categories")
public class MedicalCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idCategoria;
    @Column(name = "nameCategoria", length = 50, nullable = false)
    public String nameCategoria;
    @Column(name = "descriptionCategoria", length = 200)
    public String descriptionCategoria;
    @Column(name = "typeCategoria", length = 100)
    public String typeCategoria;
    @Column(name = "targetSpecies", length = 100)
    public String targetSpecies;
    @Column(name = "activeCategoria")
    public boolean activeCategoria;


    public MedicalCategory() {
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNameCategoria() {
        return nameCategoria;
    }

    public void setNameCategoria(String nameCategoria) {
        this.nameCategoria = nameCategoria;
    }

    public String getDescriptionCategoria() {
        return descriptionCategoria;
    }

    public void setDescriptionCategoria(String descriptionCategoria) {
        this.descriptionCategoria = descriptionCategoria;
    }

    public String getTypeCategoria() {
        return typeCategoria;
    }

    public void setTypeCategoria(String typeCategoria) {
        this.typeCategoria = typeCategoria;
    }

    public String getTargetSpecies() {
        return targetSpecies;
    }

    public void setTargetSpecies(String targetSpecies) {
        this.targetSpecies = targetSpecies;
    }

    public boolean isActiveCategoria() {
        return activeCategoria;
    }

    public void setActiveCategoria(boolean activeCategoria) {
        this.activeCategoria = activeCategoria;
    }
}
