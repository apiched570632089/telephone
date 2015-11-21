//////////////////////////program Phonbook//////////////////////////////
/////////////////////////////by apiched////////////////////////////////

package telaphon;

import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Phonbook {

       public static void main(String[] args) {
           
loop : while (true) {
        System.out.println("\nphonebook - input your command (h for help)");
        String s = JOptionPane.showInputDialog("เลือก");
        switch (s) {
            case "h":
                System.out.println("  i - insert a phone number ");
                System.out.println("  d - delete a phone number");
                System.out.println("  m - modify a phone number");
                System.out.println("  s - search");
                System.out.println("  x - exit program");
                break;
        }
         String k = JOptionPane.showInputDialog("เลือก");
         switch (k) {
            case "i":
                telaphon xt = new telaphon();
                xt.add();
                xt.show();
                break;
                
            case "d":
                System.out.println(" delete a phone number ");
                telaphon de = new telaphon();
                de.delete();
                break;
            case "m":
                System.out.println(" modify a phone number ");
                break;
            case "s":
                System.out.println(" search ");
             for(int i=0;i<0;i++){   
                String St = JOptionPane.showInputDialog("ค้นหา");
                 HashTable ht = new HashTable(i);
                System.out.println(ht.toString()); 
               
             }
                break;
         
            case "x":
                System.out.println("exit program");
                break loop;
        }
    }
    }
    public void search(int xt){
        HashTable ht = new HashTable(xt);
        System.out.println(ht.toString()); 
    }
}
