public class Exercise9 {
    public static void main(String[] args) {
        char A = 'a';
        char B = '/';
        String sequenceTreat =  "( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \\ ] ^ _ ` a b c d e f g h i j k l m n o p q r s t u v w x y z";
        test(A, B, sequenceTreat);
    }

    public static char[] test(char A,char B, String sequence) {
        char[] c = sequence.replace(" ", "").toCharArray();
        boolean trigger = false;


        for (int i = 0; i < c.length; i++) {
            if (c[i] >= A && c[i] <= B) {
                System.out.print(c[i]);
                continue;
            }
            if (c[i] >= A) {
                System.out.print(c[i]);
                if (i >= c.length -1 && c[i] != B) {
                    i = 0;
                    trigger = true;
                }
            }
            if (trigger && c[i] <= B) {
                System.out.print(c[i]);
                if (c[i] == B){
                    break;
                }
            }
        }
        return c;
    }
}

//    Write a Java method to print characters between two characters (i.e. A to P).
//    Note: Prints 20 characters per line
//
//    Expected Output:
//
//    ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
//    < = > ? @ A B C D E F G H I J K L M N O
//    P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
//    d e f g h i j k l m n o p q r s t u v w
//    x y z