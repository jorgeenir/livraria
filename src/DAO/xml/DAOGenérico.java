/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.xml;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import modelo.Livro;

/**
 *
 * @author tads
 */
public class DAOGenérico {

    public <E> HashMap gravar(HashMap<Integer, E> lista, String tipo) throws FileNotFoundException {

        String IFC = "/local/home/tads/NetBeansProjects/livraria/"+tipo;

        FileOutputStream encontraFile = new FileOutputStream(IFC);
        BufferedOutputStream AcessaFile = new BufferedOutputStream(encontraFile);
        XMLEncoder gravaFile = new XMLEncoder(AcessaFile);
        gravaFile.writeObject(lista);
        gravaFile.close();
        System.out.println("Gravou: " + lista);

        return lista;
    }

    public HashMap ler_livro() throws FileNotFoundException, ClassNotFoundException {
        HashMap<Integer, Livro> Ler_LivroMap = new HashMap<>();
        String IFC = "/local/home/tads/NetBeansProjects/livraria/livro.xml";
        FileInputStream acessa_arquivo = new FileInputStream(IFC);
        BufferedInputStream pegar_arquivo = new BufferedInputStream(acessa_arquivo);
        XMLDecoder decodificador = new XMLDecoder(pegar_arquivo);
        Ler_LivroMap = (HashMap<Integer, Livro>) decodificador.readObject();

        return Ler_LivroMap;
    }
}
