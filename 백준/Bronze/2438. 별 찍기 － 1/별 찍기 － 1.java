import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        
        for (int i = 0; i < star; i++) {
            String str = "*";
            for (int j = 0; j < i; j++) {
                str += "*";
            }
            System.out.println(str);
        }
    }
}