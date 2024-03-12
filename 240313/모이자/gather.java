import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int sumMin = Integer.MAX_VALUE; //이동 거리의 합이 최소
        int n = Integer.parseInt(br.readLine());
        int[] people = new int[n]; //각 지점에 사는 사람의 수
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            people[i] = Integer.parseInt(st.nextToken());
        }

        for (int j=0; j<n; j++){
            int distSum = 0;
            for (int k=0; k<n; k++){
                if (k==j) continue;
                distSum += Math.abs(j-k)*people[k];
            }
            sumMin = Math.min(distSum, sumMin);
        }
        System.out.println(sumMin);
    }
}