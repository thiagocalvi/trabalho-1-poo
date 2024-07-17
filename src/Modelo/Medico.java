/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author MatheusConsoni
 */
public class Medico{
    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    private String especialidade;
    private int crm; //usar como identificador
    private int secretariaId = 0; // 0 indica que o medico não tem nenhuma secretaria (cada medico terá somente uma secretaria)
    
    //Construtor
    public Medico(String nome, LocalDate dataNascimento, String telefone, String email, String especialidade, int crm) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }
    
    public int getSecretariaId(){
        return secretariaId;
    }
    
    public void setSecretariaId(Secretaria secretaria){
        this.secretariaId = secretaria.getId();
    }
        
}