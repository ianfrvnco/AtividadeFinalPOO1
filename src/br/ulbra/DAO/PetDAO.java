/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.DAO;

import br.ulbra.entity.Pet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PetDAO {

    Pet p = new Pet();
    Connection con;

    public PetDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public void salvarPet() {

        java.sql.PreparedStatement stmt = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("INSERT INTO pet (nome, raca, anoNasc, sexo, corPelo) VALUES (?,?,?,?,?)");

            stmt.setString(1, p.getNomePet());
            stmt.setString(2, p.getRaca());
            stmt.setInt(3, p.getAnoNasc());
            stmt.setString(4, p.getSexo());
            stmt.setString(5, p.getCorPelo());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public void signUp(Pet p) {

        java.sql.PreparedStatement stmt = null;
       

        boolean check = false;

        try {
            
            stmt = con.prepareStatement("INSERT INTO pet (nomePet, raca, anoNasc, sexo, corPelo) VALUES (?,?,?,?,?)");
            
            stmt.setString(1, p.getNomePet());
            stmt.setString(2, p.getRaca());
            stmt.setInt(3, p.getAnoNasc()); 
            stmt.setString(4, p.getSexo());
            stmt.setString(5, p.getCorPelo());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pet salvo com sucesso!");
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public ArrayList<Pet> read() {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pet> pet = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM pet");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Pet pets = new Pet();
                pets.setId(rs.getInt("id"));
                pets.setNomePet(rs.getString("nomepet"));
                pets.setRaca(rs.getString("raca"));
                pets.setAnoNasc(rs.getInt("anoNasc"));
                pets.setSexo(rs.getString("sexo"));
                pets.setCorPelo(rs.getString("corPelo"));
                pet.add(pets);
            }
        } catch (SQLException ex) {
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Pet>) pet;
    }

}
