public class Exercise11 {
    public static void main(String[] args) {
        String password = "ncwqd5gd12";

        verifyPassword(password);
    }

    public static String verifyPassword(String password){
        if (password.length() >= 10 && password.matches("^[a-zA-Z0-9]*$") && password.matches(".*\\d.*\\d.*")){
            System.out.println("Success: Senha dentro dos parâmetros requeridos");
        }
        else if (password == null || password.isEmpty()) {
            System.out.println("Error: Senha vazia");
        }
        else {
            System.out.println("Error: Senha errada");
        }

        return password;
    }
}


//11. Write a Java method to check whether a string is a valid password.
//Password rules:
//A password must have at least ten characters.
//A password consists of only letters and digits.
//A password must contain at least two digits.
//
//Expected Output:
//
//        1. A password must have at least eight characters.
//        2. A password consists of only letters and digits.
//        3. A password must contain at least two digits
//Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
//Password is valid: abcd1234
