/**
 * PrefixCalculator
 * Makes a prefix calculator
 * Author: August Penny and Mareks Zeile
 * Collaborator(s):
 * Collaboration:
 * Date: 11/16/21
 **/
public class PostfixCalculator {

    //instance data
    Stack s;
    String input;
    int counter;

    //default constructor

    public PostfixCalculator(String input){
        s = new Stack();
        this.input = input;
    }


    public void setInput(String Input){
        input=Input;
    }
    public void toStack(){
        String str = input;
        Stack ret = new Stack();
        for (int i=str.length()-1;i>=0;i=i-2){
            System.out.print(str.charAt(i));
            ret.push(str.charAt(i));
        }
        System.out.println();
        s=ret;
    }


}
