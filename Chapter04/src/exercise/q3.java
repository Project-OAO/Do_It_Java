package exercise;

public class q3 {
    public static void main(String[] args) {
        int dan;
        int column;
        int result;
        for(dan = 2, column = 1; dan<10; dan++, column = 1){
            for(; column<10; column++){
                if(column>dan)
                    break;
                System.out.println(dan + "*" + column + "=" + dan*column);
            }
        }
    }
}
