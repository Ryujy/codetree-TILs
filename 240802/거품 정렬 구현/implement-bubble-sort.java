import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] bb = new int[n];
        for (int i=0; i<n; i++){
            bb[i] = Integer.parseInt(st.nextToken());
        }
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int i=0; i<n-1; i++){
                if (bb[i] > bb[i+1]){
                    sorted = false;
                    int tmp = bb[i];
                    bb[i] = bb[i+1];
                    bb[i+1] = tmp;
                    sorted = false;
                }
            } 
        }

        for (int i : bb){
            System.out.print(i + " ");
        }

    }
}