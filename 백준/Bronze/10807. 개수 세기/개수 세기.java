import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int V = sc.nextInt();
        for(int i =0; i<arr.length; i++){
            if(arr[i] == V){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
