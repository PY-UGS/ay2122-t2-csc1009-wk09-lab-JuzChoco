import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        RandomCharacter randomCharacter = new RandomCharacter();
        ArrayList<String> charArray = new ArrayList<>();
        String ranChar;

        for (int i = 0; i < 15; i++){
            ranChar = randomCharacter.getRandomCharacter();
            System.out.println(i + 1 + ": " + ranChar);
            charArray.add(ranChar);
        }

    }
}