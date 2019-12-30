package test.JavaProgram;

public class ShuiXianHua {

    public static void main ( String argc[] ) {

        int counter = 0;
        for ( int i = 100; i <= 999; ++i ) {
            if ( Math.pow( i/100, 3) + Math.pow( i/10%10, 3 ) + Math.pow( i%10, 3 ) == i ) {
                counter++;
                System.out.print( i + "\t" );
                if ( counter%5==0 ) System.out.println();
            }
        }
        System.out.println( "\n" + counter );
    }
}
