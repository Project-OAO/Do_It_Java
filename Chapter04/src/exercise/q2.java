package exercise;

public class q2 {
    public static void main(String[] args) {
        int dan = 0;
        int column = 0;
        int mul = 0;
        for(dan = 2, column = 1; dan < 9; dan++, column = 1){
            if((dan%2)==1)
                continue;
            for(; column < 10; column++){
                mul = dan*column;
                System.out.println(dan + " * " + column  + " = " + mul);
            }
            System.out.println();
        }
    }
}
