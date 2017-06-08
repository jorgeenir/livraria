/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ferramentas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import livraria.Exemplar;
import modelo.Livro;

/**
 *
 * @author tads
 */
public class ImportaLivros {

    HashMap<Integer, Livro> importador = new HashMap();
    String IFC = "/local/home/tads/NetBeansProjects/livraria/tabela_livros.csv";

    public ImportaLivros() {
    }

    public HashMap getLivros() throws FileNotFoundException {

        Scanner file = new Scanner(new File(IFC));

        int ok = 0, erro = 0;
        while (file.hasNextLine()) {
            String linha = file.nextLine();

            try {

                Exemplar r = new Exemplar();
                String[] colunas = linha.split("\\|");

                r.setCodigoDeBarras(Integer.parseInt(colunas[0]));
                r.setExemplar(colunas[2]);
                r.setDataAquisicao(colunas[3]);
                r.setClassificacao(colunas[5]);
                r.setAreaConhecimento(colunas[6]);
                r.setAutores(colunas[7]);
                r.setTitulo(colunas[8]);
                r.setAno(colunas[9]);
                r.setIsbn(colunas[10]);
                r.setEditora(colunas[11]);
                r.setPaginas(colunas[12]);

                /* codigoDeBarras|idLivro|exemplar|dataAqxuisicaoExemplar|dataCadastroSistema|classificacao|
               areaConhecimento|autores|titulo|ano|isbn|editora|paginas
            
                 */
                importador.put(r.getCodigoDeBarras(), r);

                //System.out.print("["+r.getCodigoDeBarras()+" ok] ");
                ok++;
            } catch (Exception e) {
                System.out.println("Deu problema!" + e.getLocalizedMessage());
                erro++;
            }

        }
        System.out.println("ok="+ok+", errados="+erro);
        return importador;
    }

}
