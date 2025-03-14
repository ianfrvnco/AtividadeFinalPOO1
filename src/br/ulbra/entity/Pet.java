
package br.ulbra.entity;


public class Pet {
    
    private int id, anoNasc;
    private String nomePet, raca, sexo, corPelo;

    public Pet() {
    }

    public Pet(int id,  String nomePet, String raca, int anoNasc, String sexo, String corPelo) {
        this.id = id;
        this.nomePet = nomePet;
        this.raca = raca;
        this.anoNasc = anoNasc;
        this.sexo = sexo;
        this.corPelo = corPelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
