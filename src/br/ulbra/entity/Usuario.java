package br.ulbra.entity;

import javax.swing.JPasswordField;

public class Usuario {

    private int idUsu;
    private String nomeUsu, emailUsu, senhaUsu, senhaUsuConfirma, foneUsu, cpfUsu, enderecoUsu;

    public Usuario() {
    }

    public Usuario(int idUsu, String nomeUsu, String emailUsu, String senhaUsu, String senhaUsuConfirma, String foneUsu, String cpfUsu, String enderecoUsu) {
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.emailUsu = emailUsu;
        this.senhaUsu = senhaUsu;
        this.senhaUsuConfirma = senhaUsuConfirma;
        this.foneUsu = foneUsu;
        this.cpfUsu = cpfUsu;
        this.enderecoUsu = enderecoUsu;
    }

    public String mostrarDados() {
        return "ID: " + this.idUsu
                + "Nome: " + this.nomeUsu
                + "Email: " + this.emailUsu
                + "Senha: " + this.senhaUsu
                + "Fone: " + this.foneUsu
                + "CPF: " + this.cpfUsu
                + "Endereço: " + this.enderecoUsu;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public String getSenhaUsuConfirma() {
        return senhaUsuConfirma;
    }

    public void setSenhaUsuConfirma(String senhaUsuConfirma) {
        this.senhaUsuConfirma = senhaUsuConfirma;
    }

    public String getFoneUsu() {
        return foneUsu;
    }

    public void setFoneUsu(String foneUsu) {
        this.foneUsu = foneUsu;
    }

    public String getCpfUsu() {
        return cpfUsu;
    }

    public void setCpfUsu(String cpfUsu) {
        this.cpfUsu = cpfUsu;
    }

    public String getEnderecoUsu() {
        return enderecoUsu;
    }

    public void setEnderecoUsu(String enderecoUsu) {
        this.enderecoUsu = enderecoUsu;
    }

    public boolean validarSenhaForte(String senhaUsu) {

        // A expressão regular abaixo exige pelo menos:
        // - Uma letra minúscula
        // - Uma letra maiúscula
        // - Um dígito
        // - Um caractere especial
        // - E um tamanho mínimo de 8 caracteres
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        return senhaUsu.matches(regex);

    }
    
   /* public boolean validarCpf(String cpfUsu){
        
    }*/
}
