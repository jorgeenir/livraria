/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAO.bin.LivroDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tads
 */
public class MigraCsvParaBinario {

    public static void main(String[] args) {

        LivroDAO d = new LivroDAO();
        try {
            d.migraCSVparaBinario();
        } catch (IOException ex) {
            Logger.getLogger(MigraCsvParaBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
