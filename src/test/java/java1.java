import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/14.
 */
public class java1 {
    public static void main(String[] args){
        int[][] arr={{1,2,3},{2,3},{4,5,6}};
        for (int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
