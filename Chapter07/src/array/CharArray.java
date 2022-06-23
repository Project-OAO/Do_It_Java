package array;

public class CharArray {
    public static void main(String[] args) {
        char[] data = new char[26];
        char ch = 'A';
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(ch + i);
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]+", "+(int)data[i]);
        }
    }
}
