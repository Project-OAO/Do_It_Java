package exercise;

public class q1_1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '+';
        int sum=0;
        switch(operator){
            case '+':
                sum = num1 + num2;
                break;
            case '-':
                sum = num1 - num2;
                break;
            case '*':
                sum = num1 * num2;
                break;
            case '/':
                sum = num1 / num2;
                break;
            default:
                break;
        }
        System.out.println("resulut : " + sum);
    }
}
