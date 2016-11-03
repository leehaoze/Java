package figure;

/**
 * Created by leehaoze on 16/10/20.
 */
public class Circle implements Graph{
    private int radius_;

    public Circle(int radius){
        radius_ = radius;
    }
    public Circle(){
        radius_ = 0;
    }

    public int Get_Radius(){return radius_;}
    public void Set_Radius(int R){radius_ = R;}

    public double Get_Perimeter(){ return 2 * Math.PI * Get_Radius();}
    public double Get_area(){return Math.PI * Get_Radius() * Get_Radius();}
}