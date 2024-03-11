/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
    class Myexception extends Exception{
      private String msg;
      public Myexception(String msg){
           this.msg=msg;
      };
      public String getMsg(){
          return msg;
      }
  }
public class TP_1 {
    
    public static void saisircorrect() throws Myexception,InputMismatchException{
        Scanner sc=new Scanner (System.in);
        System.out.println("veuiller entrer votre valeur ");
        int v=sc.nextInt();
        if(v<10)  {    throw new Myexception("the number has to be above 10");  
            }   
          
    }

    public static void main(String[] args) {
        try{
            saisircorrect();
        }catch(Myexception e){
            System.out.println(e.getMsg());
        }catch(InputMismatchException e){
            System.out.println("ceci n'est pas un entier");
        }
        
    }
}
