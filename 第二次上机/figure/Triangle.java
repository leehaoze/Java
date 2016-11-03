package figure;

/**
 * Created by leehaoze on 16/10/20.
 */
public class Triangle implements Graph{
    private int edgeA_,edgeB_,edgeC_;

    public Triangle(int a,int b,int c){
        edgeA_ = a;
        edgeB_ = b;
        edgeC_ = c;
    }
    public Triangle(){
        edgeA_ = 0;
        edgeB_ = 0;
        edgeC_ = 0;
    }

    public int Get_edgeA(){return edgeA_;}
    public int Get_edgeB(){return edgeB_;}
    public int Get_edgeC(){return edgeB_;}

    public void Set_edgeA(int edgeA){edgeA_ = edgeA;}
    public void Set_edgeB(int edgeB){edgeB_ = edgeB;}
    public void Set_edgeC(int edgeC){edgeC_ = edgeC;}

    public double Get_Perimeter(){return Get_edgeA() + Get_edgeB() + Get_edgeC();}
    public double Get_area(){
        double p = (Get_edgeA() + Get_edgeB() + Get_edgeC()) / 2.0;
        return Math.sqrt(p * (p - Get_edgeA()) * (p - Get_edgeB()) * (p - Get_edgeC()));
    }
}