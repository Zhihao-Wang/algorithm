 class MysThread extends Thread  {

public static int index;
public  static Object obj=new Object();
 public void run(){
    synchronized (obj){
        for(int i=0;i<10;i++){
            System.out.println(getName()+":"+index++);
        }
    }
}


}


     public class    ThreadTest{
         public static void main(String[] args) {
             new MysThread().start();
             new MysThread().start();
         }
     }