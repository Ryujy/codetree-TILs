import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int m;
    public static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][n];

        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        } // map end
        
        int cnt = 0;

        // 가로 확인
        L : for (int i=0; i<n; i++){
            int happyCnt = 0;
            for (int j=0; j<n; j++){
                if (happyCnt >= m-1){
                    cnt++;
                    continue L;
                }
                if (j-1 < 0) continue;
                if (map[i][j-1] == map[i][j]){
                    happyCnt++;
                } else {
                    happyCnt = 0;
                }
            }
        }

        // 세로 확인
        L : for (int j=0; j<n; j++){
            int happyCnt = 0;
            for (int i=0; i<n; i++){
                if (happyCnt >= m-1){
                    cnt++;
                    continue L;
                }
                if (i-1 < 0) continue;
                if (map[i-1][j] == map[i][j]){
                    happyCnt++;
                } else {
                    happyCnt = 0;
                }
            }
        }

        System.out.println(cnt);
    }
}