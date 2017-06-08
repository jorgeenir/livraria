/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import modelo.Alunos;

/**
 *
 * @author tads
 */
public class DAOPessoa {

    String IFC = "/local/home/tads/NetBeansProjects/livraria/";

    public void Gravar_aluno(HashMap<Integer, Alunos> lista, String tipo) throws FileNotFoundException {
        IFC += tipo;
        System.out.println("IFC: "+IFC);
        FileOutputStream findFile = new FileOutputStream(IFC);
        BufferedOutputStream acessFile = new BufferedOutputStream(findFile);
        XMLEncoder writeFile = new XMLEncoder(acessFile);
        writeFile.writeObject(lista);
        writeFile.close();

    }

    public HashMap<Integer, Alunos> Ler_Aluno(String tipo) throws FileNotFoundException {
        
        HashMap<Integer, Alunos> alunos_map = new HashMap<Integer, Alunos>();
        FileInputStream findFile = new FileInputStream(IFC);
        BufferedInputStream acessFile = new BufferedInputStream(findFile);
        XMLDecoder readXML = new XMLDecoder(acessFile);
        alunos_map = (HashMap<Integer, Alunos>) readXML.readObject();
        return alunos_map;

    }

}
