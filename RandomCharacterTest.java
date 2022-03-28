import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomCharacterTest {
    private String randomCharacter;
    RandomCharacter ranChar = new RandomCharacter();

    @Test
    public void testLowerCaseLetter(){
        randomCharacter = ranChar.getRandomLowerCaseLetter();
        assertTrue(randomCharacter == randomCharacter.toLowerCase()); //If both variables are the same, that means the test case is a success
    }

    @Test
    public void testUpperCaseLetter(){
        randomCharacter = ranChar.getRandomUpperCaseLetter();
        assertTrue(randomCharacter == randomCharacter.toUpperCase()); //If both variables are the same, that means the test case is a success
    }

    @Test
    void testDigitCharacter() {
        randomCharacter = ranChar.getRandomDigitCharacter();
        int intRandomCharacter = Integer.parseInt(randomCharacter);
        assertTrue(0 <= intRandomCharacter && intRandomCharacter <= 9);//Checks if the value generated is between 0 and 9
       

    }

    @Test
    void testPrime() {
        randomCharacter = ranChar.getRandomDigitCharacter();
        boolean isPrime = true;
        int intRandomCharacter = Integer.parseInt(randomCharacter);
        System.out.println("The number generated to test for Prime is " + intRandomCharacter);
        if (intRandomCharacter <= 1){ //If value is less than or equals to 1, it is not a prime number
            isPrime = false;
        } else if (intRandomCharacter % 2 == 0 && intRandomCharacter != 2){
            //If the value is divisible by 2 and it is not 2
            isPrime = false;
        } else {
            isPrime = true;
        }
        assertTrue(isPrime); //If isPrime is false, then that would mean that the number is not prime hence the test case would not pass

    }
  }

