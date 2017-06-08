/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.bin;

import Ferramentas.ImportaLivros;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import modelo.Alunos;
import modelo.Livro;

/**
 *
 * @author tads
 */
public class DAOLivroGenerico {

    public <E> void gravar(HashMap<Integer, E> lista, String tipo) throws FileNotFoundException, IOException {

        String IFC = "/local/home/tads/NetBeansProjects/livraria/" + tipo;
        File arquivo = new File(IFC);
        FileOutputStream findFile = new FileOutputStream(arquivo);
        ObjectOutputStream acessFile = new ObjectOutputStream(findFile);
        acessFile.writeObject(lista);
        findFile.close();
        acessFile.close();
        System.out.println("Gravou: ");

    }

    public <E> HashMap ler() throws FileNotFoundException, IOException, ClassNotFoundException {

        HashMap<Integer, E> Ler = new HashMap<>();
        String IFC = "/local/home/tads/NetBeansProjects/livraria/livro.bin";
        File file = new File(IFC);
        FileInputStream acess_file = new FileInputStream(file);
        ObjectInputStream read_a_file = new ObjectInputStream(acess_file);
        Ler = (HashMap<Integer, E>) read_a_file.readObject();
        acess_file.close();
        read_a_file.close();

        return Ler;
    }

}
