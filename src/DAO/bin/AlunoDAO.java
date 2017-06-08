/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.bin;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import modelo.Alunos;

/**
 *
 * @author tads
 */
public class AlunoDAO {

    String IFC = "/local/home/tads/NetBeansProjects/livraria/aluno.bin";

    public void Gravar_aluno(HashMap<Integer, Alunos> lista) throws FileNotFoundException, IOException {
        
        System.out.println("IFC: " + IFC);
        File arquivo = new File(IFC);
        FileOutputStream findFile = new FileOutputStream(arquivo);
        ObjectOutputStream acessFile = new ObjectOutputStream(findFile);
        acessFile.writeObject(lista);
        findFile.close();
        acessFile.close();

    }

    public HashMap<String, Alunos> Ler_Aluno() throws FileNotFoundException {

        HashMap<String, Alunos> alunos_map = new HashMap<String, Alunos>();
        FileInputStream findFile = new FileInputStream(IFC);
        BufferedInputStream acessFile = new BufferedInputStream(findFile);
        XMLDecoder readXML = new XMLDecoder(acessFile);
        alunos_map = (HashMap<String, Alunos>) readXML.readObject();
        return alunos_map;
    }
}
