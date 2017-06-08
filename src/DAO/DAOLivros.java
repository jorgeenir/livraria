/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.bin.DAOLivroGenerico;
import DAO.xml.DAOGenérico;
import Ferramentas.ImportaLivros;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author tads
 */
public class DAOLivros {

    public DAOLivros() {

    }

    public DAOGenérico livro_xml() {
        DAOGenérico xml = new DAOGenérico();
        return xml;

    }

    public DAOLivroGenerico grava_bin() throws FileNotFoundException, IOException {
        ImportaLivros importa = new ImportaLivros();
        String tipo = "livro.bin";
        DAOLivroGenerico b = new DAOLivroGenerico();
        b.gravar(importa.getLivros(), tipo);
        return b;
    }
    

}
