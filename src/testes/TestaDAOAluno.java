/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAO.DAOPessoa;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Alunos;
import modelo.Livro;

/**
 *
 * @author tads
 */
public class TestaDAOAluno {

    public static void main(String[] args) {
        String tipo = "aluno.xml";

        DAO.DAOPessoa d = new DAOPessoa();
        HashMap<Integer, Alunos> lista = new HashMap<Integer, Alunos>();

        Alunos a = new Alunos();
        Alunos b = new Alunos();
        a.setNome("joão");
        a.setMatricula(156574863);

        b.setNome("joão");
        b.setMatricula(156574863);

        lista.put(a.getMatricula(), a);
        lista.put(b.getMatricula(), b);

        try {
            d.Gravar_aluno(lista, tipo);

            HashMap<Integer, Alunos> alunos = d.Ler_Aluno(tipo);

            Set<Integer> chaves = alunos.keySet();

            for (Iterator<Integer> iterator = chaves.iterator(); iterator.hasNext();) {
                Integer chave = iterator.next();
                if (chave != null) {
                    System.out.println(chave);

                } else {
                    System.out.println("Deu problema");
                }
            }
            System.out.println("tamanho do hashmap: " + alunos.size());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestaDAOAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
