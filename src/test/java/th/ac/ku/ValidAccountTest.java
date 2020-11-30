package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidAccountTest {
    @Test
    void Is_Valid_Account_Result_Should_Be_True(){
        boolean expectedResult = true;
        Agent agent = new Agent();

        boolean actualResult = agent.checkValidAccount("8254638461");
        assertEquals(expectedResult , actualResult);
    }
    @Test
    void Is_Invalid_Account_Result_Should_Be_False(){
        boolean expectedResult = false;
        Agent agent = new Agent();

        boolean actualResult = agent.checkValidAccount("1234567890");
        assertEquals(expectedResult , actualResult);
    }
}
