public class pattern5 {
    public static void main(String[] args) {
        int n =4;
        int j=0;
int temp =0;
int c=2;
        for (int i = 0; i < n*2; i++) {
            if(i>n){
             temp = n*2-i;

            }
            else {
               temp=i;
            }

            for ( j = 0; j <temp; j++) {

               System.out.print("* ");
            }
            System.out.println();


        }

    }
}

