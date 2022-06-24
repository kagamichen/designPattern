package OperationFactory;

public class calculateFactory {
    public static calculate createCalculate(String operate){
        calculate calculate = null ;
        switch (operate){
            case "+":
                calculate = new count(); break;
                case "-":
                calculate = new subtract(); break;
            case "*":
                calculate = new multiply(); break;
                case "/":
                calculate = new divide(); break;

        }

        return  calculate;
    }
}
