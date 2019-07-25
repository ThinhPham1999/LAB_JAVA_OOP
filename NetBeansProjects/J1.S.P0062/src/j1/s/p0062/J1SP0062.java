
package j1.s.p0062;

import java.util.Scanner;


public class J1SP0062 {

    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("===== Analysis Path Program =====");
        System.out.println("Enter path: ");
        String filePath = getPath();
        System.out.println("Disk: " + getDisk(filePath));
        System.out.println("Filename: " + getFileName(filePath));
        System.out.println("Extension: " + getExtension(filePath));
        System.out.println("Folder: " + getFolders(filePath));
    }
    
    public static String getPath(){
        return sc.nextLine().trim();
    }
    
    public static String getFileName(String filename){
        String[] word = filename.split("\\\\");
        String[] word2 = word[word.length - 1].split("\\.");
        return word2[0];
    }
    
    public static String getExtension(String filename){
        String[] word = filename.split("\\.");
        return word[1];
    }
    
    public static String getDisk(String filename){
        String[] word = filename.split("\\\\");
        return word[0] + "\\";
    }
    
    public static String getFolders(String filename){
        String[] word = filename.split("\\\\");
        return word[word.length - 2];
    }
}
