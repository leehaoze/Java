package figure;

/**
 * Created by leehaoze on 16/10/20.
 */
public class Rectangle implements Graph{
    private int length_,weight_;//成员
    //构造函数
    public Rectangle(int length,int weight){
        length_ = length;
        weight_ = weight;
    }
    public Rectangle(){
        length_ = 0;
        weight_ = 0;
    }

    public int Get_Length(){return length_;}
    public int Get_weight(){return weight_;}

    public void Set_Length(int length){length_ = length;}
    public void Set_Weight(int weight){weight_ = weight;}

    public double Get_Perimeter(){return 2 * (Get_Length() + Get_weight());}
    public double Get_area(){return Get_Length() * Get_weight();}

}