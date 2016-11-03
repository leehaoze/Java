package Employee;

/**
 * Created by leehaoze on 16/10/27.
 */
public class EmployeeABC implements Employee {
    private int money;
    private int time;

    EmployeeABC(int money,int time){
        this.money = money;
        this.time = time;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int Get_Earnings() {
        return money * time;
    }
}
