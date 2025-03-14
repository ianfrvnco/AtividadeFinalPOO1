/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.DAO;

import br.ulbra.entity.Pet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PetDAO {

    Connection con;

    public PetDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public void salvarPet() {

        java.sql.PreparedStatement stmt = null;

        boolean check = false;

        try {
            Pet p = new Pet();

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
}
