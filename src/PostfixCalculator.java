/**
 * PostfixCalculator
 * Makes a postfix calculator
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

    //constructor
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
            counter++;
        }
        System.out.println();
        s=ret;
    }

    public Integer evaluate(){
        //go through the whole string of the string
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '/' || input.charAt(i) == '*'){
                int value1 = (int)s.pop();
                int value2 = (int)s.pop();
                if(input.charAt(i) == '+'){
                    s.push(value2 + value1);
                }if(input.charAt(i) == '-'){
                    s.push(value2 - value1);
                }if(input.charAt(i) == '/'){
                    s.push(value2 / value1);
                }if(input.charAt(i) == '*'){
                    s.push(value2 * value1);
                }

            }else if(input.charAt(i) != ' '){
                int intPush = ((int)input.charAt(i))-48;
                while(input.charAt(i+1) != ' '){
                    i++;
                    intPush *= 10;
                    intPush += ((int)input.charAt(i))-48;
                }
                s.push(intPush);
            }
        }
        return (Integer)s.pop();
    }


}
