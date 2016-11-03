package Rand_Matrix;

/**
 * Created by leehaoze on 16/11/3.
 */
public class Matrix {
    int [][]data;

    public Matrix(){}

    public void Creat_Matrix(){
        data = new int[6][6];
        for (int i = 0; i < 6; ++i){
            for(int j = 0; j < 6; ++j){
                data[i][j] = (int)(10+Math.random()*21);
            }
        }
    }

    public void Get_Max_Value(){
        int ans = -1;
        int pos_x = 0,pos_y = 0;
        for (int i = 0; i < 6; ++i){
            for(int j = 0; j < 6; ++j){
                if(data[i][j] > ans){
                    ans = data[i][j];
                    pos_x = i + 1;
                    pos_y = j + 1;
                }
            }
        }
        System.out.println("出现的最大值为:"+ans +",出现在第"+ pos_x + "行,第" +pos_y +"列。");
    }

    public void Print(){
        for (int i = 0; i < 6; ++i){
            for (int j = 0; j < 6; ++j){
                if(j != 0)System.out.print(" ");
                System.out.print(data[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void Transpose() {
        System.out.println("转置前的矩阵为:");
        Print();
        for (int i = 0; i < 6; ++i) {
            for (int j = i + 1; j < 6; ++j) {
                //交换data[i][j]和data[j][i]
                data[j][i] = data[i][j] + data[j][i];
                data[i][j] = data[j][i] - data[i][j];
                data[j][i] = data[j][i] - data[i][j];
            }
        }
        System.out.println("转置后的矩阵为:");
        Print();
    }

}
