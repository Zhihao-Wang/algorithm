/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/18
 */


public class MultiThread {

    private static class MyThread extends Thread {
        @Override
        public void run() {
            synchronized (MyThread.class) {
                System.out.println(getName()+"helloworld");
            }
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyThread t=new MyThread();
            t.start();
        }
    }
}