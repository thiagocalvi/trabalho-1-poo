/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author MatheusConsoni
 */
public class Consulta {
    //Atributos
    private int id;
    private LocalDate data;
    private LocalTime horario;
    private Medico medico;
    private Paciente paciente;
    private enum tipo{
        normal,
        retorno
    };
    
    //Construtor
    public Consulta(int id, LocalDate data, LocalTime horario, Medico medico, Paciente paciente) {
        this.id = id;
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
    }
    
    //Gets e Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}