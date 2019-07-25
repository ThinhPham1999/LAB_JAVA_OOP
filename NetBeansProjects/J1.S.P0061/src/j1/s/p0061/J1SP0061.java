
package j1.s.p0061;


import Entity.*;
import Manager.*;

public class J1SP0061 {
    
    public static void main(String[] args) {
        Rectangle rec = Manager.enterRectangle();
        Circle ci = Manager.enterCircle();
        Triangle tri = Manager.enterTriagle();
        Manager.print(rec, tri, ci);
    }
}
