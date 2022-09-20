/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismos;

/**
 *
 * @author christhofer.vieira
 */
public class Polimorfismos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  calculadora calc = new calculadora();
        System.out.println(calc.somar(2.6, 3.1));*/
      
      Gato gato = new Gato();
      Cachorro cachorro = new Cachorro();
      Pato pato = new Pato();
      
      gato.comicar();
      cachorro.comicar();
      pato.comicar();
      
    }

}
