package org.pklearning.jdbc.connectionPool;

import org.pklearning.jdbc.util.ExceptionHandling;

public class Main implements Runnable{
    public static void main(String[] args) {
        new ConnectionPool();
        System.out.println("Thread Conn");
        System.out.println("-----------");
        for(int i=0;i<5;i++){
            Thread t=new Thread(new Main(),"Main_"+i);
            t.start();
        }
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            try {
                OrderDetails od=new OrderDetails();
                od.tryConnection();
            }
            catch (Exception e){
                ExceptionHandling.ExceptionHandler(e);
            }
        }
    }
}
