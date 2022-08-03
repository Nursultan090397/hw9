import java.lang.String;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int res = 6;
        method(nums, res);
    }
    static void method(int[] arr, int res){
        int r = arr.length-1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == res - arr[i])
                    System.out.println(i + " " + j);
                else
                    r--;
            }
        }
            if (r==0)
                System.out.println(-1);
        }
    }











