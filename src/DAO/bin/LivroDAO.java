/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.bin;

import Ferramentas.ImportaLivros;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author tads
 */
public class LivroDAO {

    public DAOLivroGenerico migraCSVparaBinario() throws FileNotFoundException, IOException {
        ImportaLivros importa = new ImportaLivros();
        String tipo = "livro.bin";
        DAOLivroGenerico b = new DAOLivroGenerico();
        b.gravar(importa.getLivros(), tipo);
        return b;
    }

    public <E> HashMap<Integer, E> ler() throws IOException, FileNotFoundException, ClassNotFoundException {
        DAOLivroGenerico d = new DAOLivroGenerico();
        return d.ler();
    }

}
