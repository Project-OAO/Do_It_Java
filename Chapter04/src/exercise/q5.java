package exercise;

public class q5 {
    public static void main(String[] args) {
        int low=4;
        int star = 1;
        int blank = 3;

        for(int line = 0; line<low; line++){
            for(int i = 0; i< blank;i++ ){
                System.out.print(" ");
            }
            blank--;
            for(int i = 0; i < star; i++){
                System.out.print("*");;
            }
            star += 2;
            System.out.println();

        }
        blank++;
        star -=2;
        for(int line = low-2; line>=0; line--){
            blank++;
            for(int i = 0; i< blank;i++ ){
                System.out.print(" ");
            }
            star -=2;
            for(int i = 0; i < star; i++){
                System.out.print("*");;
            }
            System.out.println();

        }

    }
}
