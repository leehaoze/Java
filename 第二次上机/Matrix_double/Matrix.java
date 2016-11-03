package Matrix_double;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/10/28.
 */
public class Matrix {
    private double [][] data;
    private int row,col;

    public Matrix(){
    }

    public void Creat_Matrix(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入矩阵的行数,回车结束:");
        row = in.nextInt();
        System.out.println("请输入矩阵的列数,回车结束:");
        col = in.nextInt();
        data = new double[row+1][col+1];
        System.out.println("请按如下格式＊输入矩阵:");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                String temp;
                temp = in.next();
                data[i][j] = Integer.parseInt(temp);
            }
        }
    }

    public  void Set(int row,int col,double value){
        data[row - 1][col - 1] = value;
    }

    public double Get(int row,int col){
        return data[row][col];
    }

    public int Width(){
        return col;
    }
    public int Height(){
        return row;
    }

    public Matrix Add(Matrix b){
        if(row != b.row || col != b.col){
            System.out.println("该矩阵无法与矩阵B相加");
        }
        else{
            for (int i = 0; i < row; ++i){
                for (int j = 0; j < col; ++j){
                    data[i][j] += b.data[i][j];
                }
            }
        }
        return this;
    }

    public Matrix Multipy(Matrix b){
        if(col != b.row){
         System.out.println("该矩阵无法与矩阵B想成");
        }
        else{
            for (int i = 0; i < row; ++i){
                for (int j = 0; j < col; ++j){
                    data[i][j] *= b.data[j][i];
                }
            }
        }
        return this;
    }

    public Matrix Transpose(){
        for (int i = 0; i < row; ++i){
            for (int j = i + 1; j < col; ++j){
                //交换data[i][j]和data[j][i]
                data[j][i] = data[i][j] + data[j][i];
                data[i][j] = data[j][i] - data[i][j];
                data[j][i] = data[j][i] - data[i][j];
            }
        }
        return this;
    }

    public void Print(){
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j){
                if(j != 0)System.out.print(" ");
                System.out.print(data[i][j]);
            }
            System.out.print("\n");
        }
    }
}
