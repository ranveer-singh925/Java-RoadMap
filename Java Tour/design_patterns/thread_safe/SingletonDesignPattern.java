package design_patterns.thread_safe;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        System.out.println(Test.getInstance().hashCode());
    }
}

class Test {
    private static Test checkOldInstance = null;

    private void test() {
    }

    // if we make this method synchronized at a time only one thread can execute the method but it is not a good pratice of code because may our main concern is to protect the creation of new object may be it possible that the method contais more code which have to be executed by all thread So
//    public synchronized static Test getInstance() {
//        if (checkOldInstance == null) {
//            checkOldInstance = new Test();
//        }
//        return checkOldInstance;
//    }


    public static Test getInstance() {
        if (checkOldInstance == null) {
            synchronized (Test.class) { // best pratice where we requird the synchronized we make it, t is suitable for thread concern
                if (checkOldInstance == null) {
                    checkOldInstance = new Test();
                }
            }
        }
        return checkOldInstance;
    }
}
