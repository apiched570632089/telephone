///////////////ArrayList name of number//////////////////
package telaphon;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;

public class telaphon {

    //public static void main (String[] args)throws IOException {

    String Fname, Lname, Tel;
    ArrayList<NewClass> name = new ArrayList<NewClass>();

    public telaphon() {
        System.out.println("");
    }

    public void add() {
        Fname = JOptionPane.showInputDialog("ชื่อ");
   //     Lname = JOptionPane.showInputDialog("นามกุล");
        Tel = JOptionPane.showInputDialog("เบอร์");
        name.add(new NewClass(Fname, Lname , Tel));
       
    }

    public void show() {
        for (int i = 0; i < name.size(); i++) {
            NewClass op = name.get(0);
            System.out.println( op.name + "  "+name.size()+ "- " + op.tel);
        }
        
    }

     public void delete() {
         
        Fname = JOptionPane.showInputDialog("ลบเบอร์");
        String N = Fname ;
        for(int i=0; i>name.size(); i++) {
            if( N =="name.get(i)"){
              System.out.println( name.get(i));
                Fname = " ";      
                Tel = "";      
        name.add(new NewClass(Fname, Lname , Tel));
        }
    }
     }      
}
