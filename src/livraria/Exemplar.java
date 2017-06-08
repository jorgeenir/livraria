/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.io.Serializable;
import modelo.Livro;

/**
 *
 * @author tads
 */
public class Exemplar extends Livro implements Serializable{

    private int codigoDeBarras;
 
    public Exemplar() {       
           
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    
}
