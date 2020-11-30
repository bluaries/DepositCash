package th.ac.ku;

public class Agent {
    final float limitDepositPerTime = 30000.00f;
    final float limitDepositPerDay = 50000.00f;
     final float minDeposit = 100.00f;

    public boolean checkDepositPerTransaction(float depositCash) {
        return depositCash <= limitDepositPerTime;

    }

    public boolean checkDepositPerDay(float depositCash) {
        return depositCash <= limitDepositPerDay;

    }

    public boolean checkValidAccount(String accountNumber) {
        String suspendedAccount = "1234567890";
        return !accountNumber.equals(suspendedAccount);
    }

    public boolean isWithinMinDeposit(float depositCash){
        return depositCash <= minDeposit;
    }
}
