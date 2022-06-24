package strategy;

//打折实现
public class cashRebate extends cashSuper {

    private double rebateNum;

    public cashRebate(float rebateNum) {
        this.rebateNum = rebateNum;
    }

    public double getFinalCash(double cash){
        return cash * this.rebateNum;
    }
}
