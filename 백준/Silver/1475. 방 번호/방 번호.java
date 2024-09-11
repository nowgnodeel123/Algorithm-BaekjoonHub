import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[9];
        int num = Integer.parseInt(st.nextToken());
        int[] door = Stream.of(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        for(int a : door){
            if(a == 9){
                arr[6] += 1;
            }else{
                arr[a] += 1;
            }
        }
        if (arr[6]%2==1){
            arr[6] = arr[6]/2+1;
        }else{
            arr[6] = arr[6]/2;
        }
        Arrays.sort(arr);
        System.out.println(arr[8]);
    }
}