package org.example;

//최대 공약수와 최소 공배수 구하기
public class Main {
    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 12;

        /*최대 공약수 호출*/
        int gdc = gdc(num1,num2);

        /*최소 공배수 계산(두 수의 곱 / 최대공약수)*/
        int lcm = (num1 * num2) / gdc;

        System.out.println("최대 공약수: "+gdc);
        System.out.println("최소 공배수: "+lcm);

    }
    /* 최대 공약수 - 유클리드 호제법*/
    public static int gdc(int num1, int num2){
        if(num1 < num2){
            int tmp = num1;
            num1 = num2;
            num2 = num1;
        }
        while(num2 != 0){
            int remain = num1 % num2;
            num1 = num2;
            num2 = remain;
        }
        return num1;
    }
}