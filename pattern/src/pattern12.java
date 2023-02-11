public class pattern12 {
    public static void main(String[] args) {
        int n =5;
        int j=0;
        for (int i = 0; i <n*2; i++) {
       if(i>=n){
           j=i-n+1;
       }
       else{
           j=n-i;
       }
            for (int o = 0; o < n-j; o++) {
                System.out.print(" ");
            }

            for (int k = 0; k < j; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
