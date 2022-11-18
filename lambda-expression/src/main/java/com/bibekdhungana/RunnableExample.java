package com.bibekdhungana;

public class RunnableExample {
    public static void main(String[] args) {
        System.out.println("Hello from Runnable Interface");

        //using anonymous innerclass
        Thread myThread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("printed inside anonymous inneer class");
            }
        });

        Thread myThread2 = new Thread(() -> {
            System.out.println("Hello from lambda Expression");
        });


        myThread1.start();
    }
}