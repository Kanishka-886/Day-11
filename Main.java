/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parent;

/**
 *
 * @author H.PRADEESH
 */
class Parent {
    void job(){System.out.println("doc");}
}
class child extends Parent{
    void hobby(){System.out.println("draw");}
}

    /**
     * @param args the command line arguments
     */
public class Main{
    public static void main(String[] args) {
        child c=new child();
        c.job();
        c.hobby();
        // TODO code application logic here
    }
    
}
