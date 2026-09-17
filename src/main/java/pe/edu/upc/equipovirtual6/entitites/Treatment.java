package pe.edu.upc.equipovirtual6.entitites;

import java.sql.Time;
import java.time.LocalDate;

public class Treatment {
    private Long id;
    private String name;
    private int quantity;
    private LocalDate treatmentDate;
    private Time startTime;
    private int duration;
    private double cost;
    private String responsible;

    private VeterinaryAttention veterinaryAttention;

}

