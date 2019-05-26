
package candidatesprogram;

import java.util.ArrayList;

public class CandidatesProgram {
    
    public static void main(String[] args) {
        ArrayList<Candidate> newl = new ArrayList<>();
        TuyenSinh tuyensinh = new TuyenSinh();
        while(true){
            int choice  = tuyensinh.menu();
            switch(choice){
                case 5:
                    System.out.println("Exit");
                    return;
                case 1:
                    tuyensinh.EnterInformation(newl);
                    break;
                case 2:
                    tuyensinh.display(newl);
                    break;
                case 3:
                    System.out.println(tuyensinh.search(newl));
                    break;
                case 4:
                    tuyensinh.listForArea(newl);
                    break;
            }
        }
        
    }
    
}
