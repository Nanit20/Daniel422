/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg1;

import java.util.Date;

public class Kata1 {

    public static void main (String[] args){
        Person pau = new Person("Pau Gasol", new Date(84,1,10));
           System.out.println(pau.getAge());
    }
}
