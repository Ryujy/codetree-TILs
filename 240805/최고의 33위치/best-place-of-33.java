import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] map;
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        } //end map

        int maxGold = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                // 범위를 벗어나는 경우 제외
                if(i + 2 >= n || j + 2 >= n) continue;
                int cur = getGold(i, j);
                maxGold = cur > maxGold ? cur : maxGold;
            }
        }
        System.out.println(maxGold);
    }

    public static int getGold(int row, int col){
        int gold = 0;
        for (int i=row; i<row+3; i++){
            for (int j=col; j<col+3; j++){
                if (map[i][j] == 1) {
                    gold++;
                }
            }
        }
        return gold;
    }
}