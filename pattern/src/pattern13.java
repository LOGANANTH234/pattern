
public class pattern13 {
    public static void main(String[] args) {
        int n=10;
        int temp =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <1; k++) {
                System.out.print("*");
            }
            if(n-1==i){

                for (int j = 1; j <n+n-2; j++) {
                    //    System.out.println(j);
                    System.out.print("*");
                }
            }
            if(i>0&&i!=n-1) {
                for (int p = 1; p <= temp; p++) {
                    System.out.print(" ");

                }
                temp =temp+2;

            }
            if(i>0)
            for (int pp = 0; pp <1; pp++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}