import java.util.Random;

public class RandomCharacter {

    private char lcc; //Lower Case Character
    private char ucc; //Upper Case Character
    private int ranNum;

    Random random = new Random();

    public String getRandomLowerCaseLetter(){
        lcc = (char)('a' + random.nextInt(0,26)); 
        //Generate a random integer between 1 and 26
        return Character.toString(lcc);
    }

    public String getRandomUpperCaseLetter(){
        ucc = (char)('A' + random.nextInt(0,26)); 
        return Character.toString(ucc);
    }

    public String getRandomDigitCharacter(){
        ranNum = random.nextInt(0,10); //Obtain an integer between 0 and 10
        return Integer.toString(ranNum);
    }

    public String getRandomCharacter(){
        int ranOpt = random.nextInt(0, 3);

        if (ranOpt == 0){
            return getRandomLowerCaseLetter();
        }else if (ranOpt == 1){
            return getRandomUpperCaseLetter();
        }else if (ranOpt == 2){
            return getRandomDigitCharacter();
        }else{
            return getRandomLowerCaseLetter();
        }

    }

}

