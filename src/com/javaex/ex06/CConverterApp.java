package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        dollar = CConverter.toDoller(1000000);  // 100만원 = 1,000,000원
        System.out.println("백만원은 " + dollar + " 달러입니다.");

        
        //100달러를 원으로 출력하기
        won =  CConverter.toKRW(100);
        System.out.println("백달러는 " + won + " 원입니다.");
        
        
    }

}
