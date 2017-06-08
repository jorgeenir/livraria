/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ferramentas;

import DAO.DAOLivros;
import DAO.DAOPessoa;
import DAO.bin.DAOLivroGenerico;
import DAO.xml.DAOGenérico;
import Ferramentas.ImportaLivros;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import livraria.Exemplar;
import modelo.Alunos;
import modelo.Livro;

/**
 *
 * @author tads
 */
public class TestaImportaLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       DAOLivros d = new DAOLivros();
        try {
            d.grava_bin();
        } catch (IOException ex) {
            Logger.getLogger(TestaImportaLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

}
