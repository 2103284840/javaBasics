package com.zzdx;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Sort {
    /*private Sort(){}
      private static Sort sort = new Sort();
      public static Sort getInstance(){
          return sort;
    }
    
    private Sort(){};
    private static Sort sort = null;
    public static Sort getInstance(){
        if(sort == null){
            sort = new Sort();
        }
        return sort;
    }*/

    public static void BubbleSort(){
        Scanner input = new Scanner(System.in);
        int sort[] = new int[10];
        int temp;
        System.out.println("请输入十个数字:");
        for (int i = 0; i < sort.length; i++) {
            sort[i] = input.nextInt();
        }
        for (int i = 0; i < sort.length-1; i++) {
            for (int j = 0; j < sort.length-i-1; j++) {
                if(sort[j] > sort[j+1]){
                    temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = temp;
                }
            }
        }
        System.out.println("排序后的顺序是:");
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i]+" ");
        }
    }

    public static void fun() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String newDate;
        try {
            newDate = simpleDateFormat
                    .format(new SimpleDateFormat("yyyyMMdd").parse("20220818"));
            System.out.println("newDate = " + newDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BubbleSort();
    }
}
