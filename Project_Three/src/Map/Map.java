package Map;

/**
 * Created by leehaoze on 16/11/16.
 */
public class Map {
    String name_;
    int price_;

    public Map(){
        name_ = "NULL";
        price_ = 0;
    }

    public Map(String n,int p){
        name_ = n;
        price_ = p;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public int getPrice_() {
        return price_;
    }

    public void setPrice_(int price_) {
        this.price_ = price_;
    }

}
