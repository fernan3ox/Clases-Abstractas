/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.abstractas;

/**
 *
 * @author Fernandito
 */
public class Guitarra extends InstrumentoMusical implements InstrumentoAfinable {

    @Override
    public void afinar() {
        System.out.println("Afinando");    
    }

    @Override
    public void tocar() {
        System.out.println("Toocando Guitarra");   
    }
    
    
}
