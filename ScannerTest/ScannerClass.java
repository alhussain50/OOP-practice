package ScannerTest;
import java.util.Scanner;

public class ScannerClass{
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        
        String userName = objScanner.nextLine();
        System.out.println(userName);
    }
}
