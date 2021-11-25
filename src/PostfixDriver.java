/**
 * PostfixDriver
 * This is a driver for the postfix calculator class
 * Author: August Penny and Mareks Zeile
 * Collaborator(s):
 * Collaboration:
 * Date: 11/25/21
 **/
public class PostfixDriver {
    public static void main(String[]args) {
        PostfixCalculator p = new PostfixCalculator("10 2 +");
        System.out.println(p.evaluate());
    }

}
