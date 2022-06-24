package strategy;

import java.math.BigDecimal;

//打折实现
public class cashMoneyOff extends cashSuper {

    private BigDecimal offMoney;
    private BigDecimal fullMoney;

    public cashMoneyOff(String fullNum,String offNum ) {
        this.offMoney = new BigDecimal(offNum);;
        this.fullMoney = new BigDecimal(fullNum);
    }

    public double getFinalCash(double cash){
        BigDecimal cashBig = BigDecimal.valueOf(cash);
        BigDecimal fullNum = cashBig.divide(this.fullMoney,0,BigDecimal.ROUND_FLOOR);
        BigDecimal finalBig = cashBig.subtract(fullNum.multiply(this.offMoney));
        return finalBig.doubleValue();
    }
}
