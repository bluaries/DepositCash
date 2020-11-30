package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerTimeTest {
    @Test
    void Deposit_Less_Than_30000_Per_Time_Result_Should_Be_True() {
        boolean expectedResult = true;
        float depositCash = 5000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Deposit_Equal_30000_Per_Time_Result_Should_Be_True() {
        boolean expectedResult = true;
        float depositCash = 30000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Deposit_Grater_Than_30000_Per_Time_Result_Should_Be_False() {
        boolean expectedResult = false;
        float depositCash = 30010.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }
}
