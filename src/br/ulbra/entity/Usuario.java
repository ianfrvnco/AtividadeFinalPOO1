package br.ulbra.entity;

import javax.swing.JOptionPane;
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

    public boolean validarCpf(String cpfUsu) {


            if (cpfUsu.length() == 11) {
                char[] arrayValores = cpfUsu.toCharArray();
                int[] cpfInteiros = new int[arrayValores.length];
                int somaCpfInt = 0;

                for (int i = 0; i < arrayValores.length; i++) {
                    cpfInteiros[i] = Integer
                            .parseInt(String.valueOf(arrayValores[i]));
                }

                cpfInteiros[0] *= 10;
                cpfInteiros[1] *= 9;
                cpfInteiros[2] *= 8;
                cpfInteiros[3] *= 7;
                cpfInteiros[4] *= 6;
                cpfInteiros[5] *= 5;
                cpfInteiros[6] *= 4;
                cpfInteiros[7] *= 3;
                cpfInteiros[8] *= 2;

                for (int s = 0; s < 8; s++) {
                    somaCpfInt += cpfInteiros[s];
                }
                int restoCpf = somaCpfInt % 11;

                
                if (11 - restoCpf == cpfInteiros[9]) {
                    cpfInteiros[0] *= 11;
                    cpfInteiros[1] *= 10;
                    cpfInteiros[2] *= 9;
                    cpfInteiros[3] *= 8;
                    cpfInteiros[4] *= 7;
                    cpfInteiros[5] *= 6;
                    cpfInteiros[6] *= 5;
                    cpfInteiros[7] *= 4;
                    cpfInteiros[8] *= 3;
                    cpfInteiros[9] *= 2;

                    for (int s = 0; s < 9; s++) {
                        somaCpfInt += cpfInteiros[s];
                    }
                    restoCpf = somaCpfInt % 11;
                    
                    if (11 - restoCpf >= 9 && cpfInteiros[10] == 0) {
                        return true;
                    } else if (11 - restoCpf == cpfInteiros[10]) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }

    }
}
