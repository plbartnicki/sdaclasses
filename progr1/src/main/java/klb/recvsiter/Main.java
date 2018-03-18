package klb.recvsiter;

/**
 * Created by klb on 17.03.18.
 */
public class Main {

    private static int fibRec(int n) {
        if(n < 3) {
            return 1;
        }

        return fibRec(n-2) + fibRec(n-1);
    }

    private double powRek(double x, int n) {
        //ma zwrocic x do potegi n
        return 0;
    }

    //n: 1 2 3 4  5  6
    //fn 1 1 2 3  5  8
    private static int fibIter(int n) {
        int f1 = 1;
        int f2 = 1;

        while(n > 2) {
            int temp = f2;
            f2 = f1 +f2;
            f1 = temp;
            n--;
        }


        return f2;
    }

    public static void main(String[] args) {
        System.out.println(fibIter(2));
        System.out.println(fibRec(6));
    }
}
