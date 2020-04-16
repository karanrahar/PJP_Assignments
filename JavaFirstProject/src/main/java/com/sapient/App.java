package com.sapient;

public class App 
{
    public static void main( String[] args )
    {
//        CheckEven obj=new CheckEven();
//        System.out.println( "Check if 4 is even : " + obj.check(4));
//        System.out.println( "Check if 15 is even : " + obj.check(15));
//        System.out.println( "Check if 210 is even : " + obj.check(210));
//        System.out.println( "Check if 221 is even : " + obj.check(221));
    }
}

class CheckEven {
    public Boolean check(int n) {
        return n % 2 == 0;
    }
}