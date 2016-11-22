package Binary_Search;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/10/27.
 */
public class Binary_Search {
    public static void Input(int [] nums){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入" + nums.length + "个元素:");
        for (int i = 0; i < nums.length; ++i){
            nums[i] = in.nextInt();
        }
    }

    public static void Sort(int []nums){
        System.out.print("您输入的数组为:");
        for (int i = 0; i < nums.length; ++i){
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < nums.length; ++i){
            for (int j = i + 1; j < nums.length; ++j){
                if(nums[i] > nums[j]){
                    nums[j] = nums[j] + nums[i];
                    nums[i] = nums[j] - nums[i];
                    nums[j] = nums[j] - nums[i];
                }
            }
        }

        System.out.print("排序后的数组为:");
        for (int i = 0; i < nums.length; ++i){
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");
    }

    public static int Binary_Search_A(int []nums,int left,int right,int num){
        int mid = (left + right) / 2;
        if(nums[mid] == num)return mid;
        else{
            if(nums[mid] > num){
                return Binary_Search_A(nums,left,mid,num);
            }
            else{
                return Binary_Search_A(nums,mid,right,num);
            }
        }
    }

    public static int Binary_Search_B(int []nums,int num){
        int left = 0,right = nums.length - 1,mid = (left + right) / 2;
        while(nums[mid] != num){
            if(nums[mid] > num){
                right = mid;
            }
            else{
                left = mid;
            }
            mid = (right + left) / 2;
        }
        return mid;
    }

    public static void Binary_Search(int []nums){
        while(true) {
            System.out.println("请输入一个要查找的数,输入EXIT退出:");
            Scanner in = new Scanner(System.in);
            String ipt = in.nextLine();
            if(ipt.equals("EXIT"))
                break;
            int num = Integer.parseInt(ipt);
            System.out.println("请选择使用递归或者非递归的方式进行折半查找，递归方式请输入1，非递归方式请输入2:");
            int methods = in.nextInt();
            if (methods == 1) {
                System.out.println("使用递归方式查询");
                System.out.println("要查找的值为" + num + "，在第" + (Binary_Search_A(nums, 1, nums.length - 1, num) + 1) + "位");
            } else {
                System.out.println("使用递归方式查询");
                System.out.println("要查找的值为" + num + "，在第" + (Binary_Search_B(nums, num) + 1) + "位");
            }
        }
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数组长度:");
        int length = in.nextInt();
        int []nums = new int [length];
        Input(nums);
        Sort(nums);
        Binary_Search(nums);
    }
}
