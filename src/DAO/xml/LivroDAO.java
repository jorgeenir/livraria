/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.xml;

import Ferramentas.ImportaLivros;
import java.io.FileNotFoundException;
import java.util.HashMap;
import modelo.Livro;

/**
 *
 * @author tads
 */
public class LivroDAO {

    DAOGenérico dao = new DAOGenérico();
    ImportaLivros importa = new ImportaLivros();

    public void gravar() throws FileNotFoundException {
        HashMap<Integer, Livro> lista = importa.getLivros();
        String tipo = "livro.xml";
        dao.gravar(lista, tipo);
    }

    public HashMap<Integer, Livro> ler() throws FileNotFoundException,ClassNotFoundException {
        return dao.ler_livro();
    }
}
