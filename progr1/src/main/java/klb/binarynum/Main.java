package klb.binarynum;

/**
 * Created by klb on 18.03.18.
 */
public class Main {

    //100101 = 37=n
    /*max = 1    curr = 1     q = true  bit = 1  n = 9

     */
    private static int maxZeroSequence(int n) {
        int max = 0;   //kandydat na maksimum - dlugosc aktualnie najdluzszego podciagu zer pomiedzy jedynkami
        int current = 0;  //aktualna liczba zer w badanym podciagu "zerowym"
        boolean q = false;   //jesli true to znaczy ze juz natrafilismy na 1

        while(n > 0) {
            int bit = n % 2;   //ekstrakcja bitu

            if(bit == 0) {
                if (q) {  //jesli wczesniej wystapila 1 to moge zliczyc to zero
                    current++;
                }

            } else {   //znaczy to ze natrafilismy na 1
               q = true;   //natrafilismy na 1

                //ta jedynka konczy pewien zerowy ciad i moge sprawdzic czy
                //dlugosc tego ciagu jest wieksza niz dlugosc najdluzszego
                //dotychczasowego (wczesniejszego) ciagu 0
                if(current > max) {
                    max = current;
                }
                current = 0; //restart licznika zeby od nowa zliczac zera kolejnego podciagu
            }



            n = n / 2;  //zeby miec dostep do kolejnego bitu w
            //kolejnej iteracji
        }

        return max;

    }

    //funkcja zamienia liczbe calkowita na stringa ktory
    //jest jest binarna reprezentaja
    //np 6 -> "110" (bo 6 = 1*2^2 + 1*2^1 + 0*2^0)
    //n = 6/2 = 3
    //n=3/2 = 1
    //n = 1/2 = 0
    private static StringBuilder binConvert(int n) {
        StringBuilder result = new StringBuilder();
        while(n > 0) {
            int bit = n % 2;   //ekstrakcja bitu
            result.append(bit);
            n = n / 2;  //zeby miec dostep do kolejnego bitu w
            //kolejnej iteracji
        }

        return result.reverse();
    }

    public static void main(String[] args) {

        System.out.println(maxZeroSequence(37));

//        StringBuilder res = binConvert(6);
//        System.out.println(res);
    }
}
