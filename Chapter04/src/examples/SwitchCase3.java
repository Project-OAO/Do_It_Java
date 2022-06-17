package examples;

public class SwitchCase3 {
    public static void main(String[] args) {
        int floor = 3;
        switch (floor){
            case 1 :
                System.out.println("Pharmacy");
                break;
            case 2 :
                System.out.println("Orthopedics");
                break;
            case 3 :
                System.out.println("Dermatology");
                break;
            case 4 :
                System.out.println("Dentist");
                break;
            case 5 :
                System.out.println("Gym");
                break;
            default :
                System.out.println("wrong");
        }
    }
}
