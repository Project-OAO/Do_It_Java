package exercise;

public class q1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '+';
        int result;
        if (operator == '+'){
            result = 10 + 2;
        } else if (operator == '-') {
            result = 10-2;
        } else if (operator == '*') {
            result = 10*2;
        } else if (operator == '/') {
            result = 10/2;
        } else{
            result = 0;
        }
        System.out.println("Result : " + result);
    }
}
