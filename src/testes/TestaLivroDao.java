///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package testes;
//
//import DAO.xml.LivroDAO;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import modelo.Livro;
//
///**
// *
// * @author tads
// */
//public class TestaLivroDao {
//
//
//        LivroDAO dao = new LivroDAO();
//      
//        try {
//              dao.migraCSVparaBinario();
//            HashMap<Integer, Livro> livros = dao.ler();
//            
//            Set<Integer> chaves = livros.keySet();
//
//            for (Iterator<Integer> iterator = chaves.iterator(); iterator.hasNext();) {
//                Integer chave = iterator.next();
//                if (chave != null) {
//                    System.out.println(chave);
//                    
//                } else {
//                    System.out.println("Deu problema");
//                }
//            }
//            System.out.println("tamanho do hashmap: "+livros.size());
//        } catch (IOException ex) {
//            Logger.getLogger(TestaLivroDao.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(TestaLivroDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//}
