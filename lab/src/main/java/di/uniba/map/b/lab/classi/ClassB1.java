/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.uniba.map.b.lab.classi;

/**
 *
 * @author pierpaolo
 */
public class ClassB1 extends ClassA1 {
    
    private String msg;
    
    public ClassB1(String msg) {
        super(msg);
        this.msg="";
    }
    
    public ClassB1(String msg1, String msg2) {
        super(msg1);
        this.msg=msg2;
    }
    
    public void printMe() {
        super.printMe();
        System.out.println(msg);
    }
    
}
