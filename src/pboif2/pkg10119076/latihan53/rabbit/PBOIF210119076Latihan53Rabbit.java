/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan53.rabbit;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Rabbit
 */
public class PBOIF210119076Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter",false,"grass",4,"grey");
        
       System.out.println("Hello, his name is " + rabbit.getName());
       System.out.println(rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian());
       System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
       System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs.");
       System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    }
}
