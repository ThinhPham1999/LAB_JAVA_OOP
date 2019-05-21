
package j1.s.p0050;



public class J1SP0050 {

    
    public static void main(String[] args) {
        Manager ma = new Manager();
        int choice;
        while (true){
            choice = ma.menu();
            switch(choice){
                case 1:
                    ma.superlative();
                    break;
                case 2:
                    ma.quadratic();
                    break;
                case 3:
                    System.out.println("Exit");
                    return;
            }
        }
    }
    
}
