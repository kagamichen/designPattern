package OperationFactory;

import com.sun.corba.se.spi.orb.OperationFactory;

import java.util.Scanner;

public class operationFactoryMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        double num1 = input.nextFloat();
        System.out.println("请输入一个字符串(中间不能加空格或符号)");
        String operate = input.next();
        System.out.println("请输入一个数字");
        double num2 = input.nextFloat();

        calculate calculate = calculateFactory.createCalculate(operate);
        calculate.setNum1(num1);
        calculate.setNum2(num2);
        double result = calculate.getResult();
        System.out.println(result);
    }
}
