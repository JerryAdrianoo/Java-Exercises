import java.util.ArrayList;
public class Exercise4 {
    public static void main(String[] args) {
        String texto = "w3schools";
        ArrayList<Character> letras = new ArrayList<>();

        for (int i = 0; i < texto.length(); i++) {
            char character = texto.charAt(i);

            if ("aeiouAEIOU".contains(String.valueOf(character))) {
                letras.add(character);
            }
        }
        int contagem = letras.size();

        System.out.println(contagem);
    }

}

//4. Write a Java method to count all vowels in a string.
//Test Data:
//Input the string: w3resource
//Expected Output:
//
//Number of  Vowels in the string: 4