package strategy;

import java.util.Scanner;

/**
 *
 */
public class cashierMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("收取多少现金");
        double cash = input.nextFloat();
        System.out.println("请输入一个字符串(中间不能加空格或符号)");
        String saleType = input.next();

        cashContext cashContext = new cashContext(saleType);
        double result = cashContext.getResult(cash);
        System.out.println(result);

    }
}
