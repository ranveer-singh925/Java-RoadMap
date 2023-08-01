package thread;
//public class ThreadIntro extends Thread{
//    @Override
//    public void run(){
//        System.out.println("thread is running...");
//    }
//public static void main(String[] args){
//    ThreadIntro threadIntro = new ThreadIntro();
//    threadIntro.start();
// }
//}


public class ThreadIntro implements Runnable{

    @Override
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String[] args){
        ThreadIntro threadIntro = new ThreadIntro();
        Thread thread = new Thread(threadIntro);
        thread.start();
    }
}
