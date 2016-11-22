package Double_Array;


import java.util.Scanner;

/**
 * Created by leehaoze on 16/11/16.
 */
public class Double_Array {
    public static String data_;

    public static void Print(String s){
        System.out.println(s);
    }

    public static void Input_String(){
        Print("请按照 1,2;3,4,5;6,7,8;3.3输入");
        Scanner in = new Scanner(System.in);
        data_ = new String();
        data_ = in.nextLine();
    }

    public static int Count_X(){
        int length = data_.length();
        int count = 1;
        for(int i = 0; i < length; ++i){
            if(data_.charAt(i) == ';')
                ++count;
        }
        return count;
    }

    public static double[] Get_data(int no){
        int length = data_.length();
        int count = 1;
        int pos;
        for(pos = 0; pos < length; ++pos){
            if(data_.charAt(pos) == ';')
                ++count;
            if(count == no) {
                break;
            }
        }
        if(no != 1)++pos;
        count = 1;
        int pos_bak = pos;
        while(pos < length && data_.charAt(pos) != ';'){
            if(data_.charAt(pos) == ',')
                ++count;
            ++pos;
        }
        double []data = new double[count];
        count = 0;
        pos = pos_bak;
        String temp = new String();
        while( pos < length && data_.charAt(pos) != ';'){
            if(data_.charAt(pos) == ','){
                data[count++] = Double.parseDouble(temp);
                temp = "";
            }
            else{
                temp = temp + data_.charAt(pos);
            }
            ++pos;
        }
        if(temp.length() >= 1)
            data[count] = Double.parseDouble(temp);
        return data;
    }

    public static double[][] Build_Array(){
        int X = Count_X();
        double [][] data = new double[X][];
        for(int i  = 0; i < X; ++i){
            data[i] = Get_data(i + 1);
        }
        return data;
    }


    public static void main(String []args){
        Input_String();
        double [][] data =  Build_Array();
        for(int i = 0; i < data.length; ++i){
            for(int j = 0; j < data[i].length; ++j){
                System.out.print("d[" + i + "," + j + "] = " + data[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
