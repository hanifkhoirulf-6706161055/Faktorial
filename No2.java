/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;
import java.util.Scanner;
/**
 *
 * @author Praktikan
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               int l = 1;
    int tingkat = 10;
    int n = 12/2;
    for(int i=1;i<=n;i++){
    for(int k=n;k>i;k--){
    System.out.print("0");
    }
    for(int j=1;j<=l;j++){
    System.out.print("+");
    }
    l+=2;

    System.out.println("");
    }
    l -= 4;

    for(int i=(n-1);i>=1;i--){
    for(int k=i;k<=(n-1);k++){
    System.out.print("0");
    }
    for(int j=l;j>=1;j--){
    System.out.print("+");
    }
    l-=2;

    System.out.println("");
    }
    }
    }
    
}
