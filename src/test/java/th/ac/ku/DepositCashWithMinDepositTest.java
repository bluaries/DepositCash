package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashWithMinDepositTest {

    @Test
    void Deposit_Less_Than_Minimum_Deposit_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 50.00f;
        Agent agent = new Agent();

        Boolean actualResult =  agent.isWithinMinDeposit(depositCash);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void Deposit_Equal_Minimum_Deposit_Result_Should_Be_True(){
        Boolean expectedResult = true;
        float depositCash = 100.00f;
        Agent agent = new Agent();

        Boolean actualResult =  agent.isWithinMinDeposit(depositCash);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void Deposit_Grater_Than_Minimum_Deposit_Result_Should_Be_False(){
        Boolean expectedResult = false;
        float depositCash = 300.00f;
        Agent agent = new Agent();

        Boolean actualResult =  agent.isWithinMinDeposit(depositCash);
        assertEquals(expectedResult,actualResult);
    }

}