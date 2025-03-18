package com.turutinapp.rutinasapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "rutinas")
public class Rutina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreUsuario;
    private int edad;
    private double peso;
    private String nombreEjercicio;
    private int numeroRepeticiones;
    private int numeroSeries;

    public Rutina() {}

    public Rutina(String nombreUsuario, int edad, double peso, String nombreEjercicio, int numeroRepeticiones, int numeroSeries) {
        this.nombreUsuario = nombreUsuario;
        this.edad = edad;
        this.peso = peso;
        this.nombreEjercicio = nombreEjercicio;
        this.numeroRepeticiones = numeroRepeticiones;
        this.numeroSeries = numeroSeries;
    }

    public Long getId() { return id; }
    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public String getNombreEjercicio() { return nombreEjercicio; }
    public void setNombreEjercicio(String nombreEjercicio) { this.nombreEjercicio = nombreEjercicio; }
    public int getNumeroRepeticiones() { return numeroRepeticiones; }
    public void setNumeroRepeticiones(int numeroRepeticiones) { this.numeroRepeticiones = numeroRepeticiones; }
    public int getNumeroSeries() { return numeroSeries; }
    public void setNumeroSeries(int numeroSeries) { this.numeroSeries = numeroSeries; }
}
