package strategy;

public class cashContext {

    cashSuper cs = null;

    public cashContext (String type){
        switch (type){
            case "打八折":
                this.cs = new cashRebate(0.8F); break;
            case "满300减少50":
                this.cs = new cashMoneyOff("300","50");break;
        }
    }

    public double getResult(double cash){
        return cs.getFinalCash(cash);
    }
}
