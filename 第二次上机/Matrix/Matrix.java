package Matrix;

/**
 * Created by leehaoze on 16/10/28.
 */
public class Matrix {
    public static void solve(){
        int [][] matrix = new int[5][];
        for (int i = 0; i < matrix.length; ++i){
            matrix[i] = new int[i];
            for (int j = 0; j < i; ++j){
                matrix[i][j] = i * j;
            }
        }

        for (int i = 0; i < matrix.length; ++i){
            System.out.print('<');
            for (int j = 0; j < i; ++j){
                if(j != 0)System.out.print(" ");
                System.out.print(matrix[i][j]);
            }
            System.out.print(">\n");
        }

    }
    public static void main(String []args){
        solve();
    }
}
