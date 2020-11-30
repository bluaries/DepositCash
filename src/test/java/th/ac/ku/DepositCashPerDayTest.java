package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerDayTest {
    private float getDepositCash(float depositCash1, float depositCash2) {
        return depositCash1+depositCash2;
    }

    @Test
    void Deposit_Less_Than_50000_Per_Day_Result_Should_Be_True() {
        boolean expectedResult = true;
        float depositCash1 = 45000.00f;
        float depositCash2 = 400.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerDay(getDepositCash(depositCash1, depositCash2));

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Deposit_Equal_50000_Per_Day_Result_Should_Be_True() {
        boolean expectedResult = true;
        float depositCash = 50000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerDay(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Deposit_Grater_Than_50000_Day_Time_Result_Should_Be_False() {
        boolean expectedResult = false;
        float depositCash1 = 34000.00f;
        float depositCash2 = 20000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerDay(getDepositCash(depositCash1, depositCash2));

        assertEquals(expectedResult, actualResult);
    }
}
