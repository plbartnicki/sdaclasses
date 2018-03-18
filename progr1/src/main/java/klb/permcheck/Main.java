package klb.permcheck;

/**
 * Created by klb on 17.03.18.
 */
public class Main {

    public static int solution(int[] A) {
        int size = A.length;

        //i: 0, 1, 2,... size-1
        //   1, 2, 3 ....size
        int []temp = new int[size]; //ta tablica domyslnie jest wyzerowana
        //jesli temp[i] == 1 to oznacza ze natrafilismy na liczbe i+1

        for(int i = 0; i < size; i++) {
            if(A[i] > size || A[i] < 1) {
                return 0;
            }

            //czy kolejny element z tablicy A nie wystapil juz wczesniej
            if(temp[A[i] - 1] == 1) {
                return 0;
            } else {
                temp[A[i]-1] = 1;
            }
        }

        return 1;
    }

    public static void main(String[] args) {

    }


}
