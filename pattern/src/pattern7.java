public class pattern7 {
    public static void main(String[] args) {
        int n=5;

        for (int i = 0; i <n ; i++) {
            for (int z = 0; z <=i; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j <n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
