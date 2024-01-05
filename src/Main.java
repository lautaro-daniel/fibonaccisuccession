public class Main {
    public static void main(String[] args) {

        int n0=0;
        int n1=1;

        for (int i=0; i <= 50; i++){

            System.out.println(n0);
            int fibSum = n0+n1;
            n0 = n1;
            n1 = fibSum;
        }
    }
}