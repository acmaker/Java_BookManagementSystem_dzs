package test.thread;

public class TaskThreadDemo {

    public static void theacher_methond ( ) {
        long time_begin = System.currentTimeMillis();
        // 创建任务
        Runnable printA = new _PrintChar( 'a', 100 );
        Runnable printnum = new _PrintNum( 1, 100 );

        // 创建执行任务的线程
        Thread thread1 = new Thread( printA );
        Thread thread2 = new Thread( printnum );

        // 启动线程
        thread1.start();
        thread2.start();
        long time_end = System.currentTimeMillis();
        System.out.println( time_end-time_begin );
    }

    public static void my_methond ( ) {
        Thread thread1 = new Thread(
                new _PrintChar( 'a', 100 ) );
        Thread thread2 = new Thread(
                new _PrintNum( 1, 100 ) );

        thread1.start();
        thread2.start();
    }

    public static void main ( String[] args ) {
        my_methond();
    }
}
class PrintChar implements Runnable {
    private char charToPrint;
    private int times;
    public PrintChar( char c, int n ) {
        charToPrint = c;
        times = n;
    }
    @Override
    public void run ( ) {
        for ( int i = 0; i < times; ++i ) {
            if ( i%10==0 ) System.out.println( );
            System.out.print( charToPrint );
        }
    }
}
class PrintNum implements Runnable {
    private int begin_num, end_num;
    PrintNum ( int a, int b ) {
        this.begin_num = a;
        this.end_num = b;
    }
    @Override
    public void run ( ) {
        for ( int i = begin_num; i <= end_num; ++i ) {
            if ( i%10==0 ) System.out.println( );
            if ( i==50 ) {
                System.out.println( "遇到50, 休眠1秒钟" );
                try {
                    Thread.sleep( 1000 );
                } catch ( InterruptedException e ) {
                    e.printStackTrace( );
                }
            }
            System.out.print( i );
        }
    }
}