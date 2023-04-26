/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner; 
public class Arrays {

   
    public static void main(String[] args) {
       Scanner objread=new Scanner(System.in);
       int n,  con=0, con_elem=0;
       float acum=0,prom;
       
        System.out.print("\n Digite tamano de vector");
        n=objread.nextInt();
        
        int datos[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite un valor para la posicion " + i);
            datos[i]=objread.nextInt();
            if (i % 2 != 0){
            acum+=datos[i];
            con++;
            }
         } //Fin para
        prom=acum / con;
       System.out.println("El promedio es: " + prom);
       
       
        for (int i = 0; i < n; i++) {
            if ( i % 2 == 0 && datos[i] > prom);
            con_elem++;
        
        }
        System.out.println("Cantidad de elementos es: " + con_elem);
    }
    
}


