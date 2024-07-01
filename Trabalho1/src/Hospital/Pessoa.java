/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.time.LocalDate;
/**
 *
 * @author MatheusConsoni
 */
public class Pessoa {
    //Atributos
    private String Nome;
    private LocalDate dataNascimento;
    private String Endereco;
    private String telefone;
    private String email;
    
    //Construtor
    public Pessoa(String Nome, LocalDate dataNascimento, String Endereco, String telefone, String email) {
        this.Nome = Nome;
        this.dataNascimento = dataNascimento;
        this.Endereco = Endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    //Gets e Sets
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
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
    
    
}
