/*
Vector
Backing: dynamically-resized array
Strength: methods are synchronized (thread-safe)
*/

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.plaf.synth.SynthStyle;

public class VectorClass {   
    public static void main(String[] args){
        Vector<String> v = new Vector<>(2,2);

        //Add elements
        v.add("Red");
        v.add("Green");
        v.addElement("Blue");
        System.out.println("v elements : "+v);

        //Access
        String c = v.elementAt(1);
        System.out.println("element at 1 : "+c);       
        int cap = v.capacity();
        System.out.println("capacity : "+cap);
        int size = v.size();
        System.out.println("v size : "+size);

        //remove
        v.remove("Green");
        System.out.println("v elements after removing green : "+v);
        v.remove(0);
        System.out.println("v after removing 0 element : "+v);

        //Iterate via Enumeration (legacy)
        Enumeration<String> en = v.elements();
        System.out.println("v elements");
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}