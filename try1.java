class A extends Thread {
  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println("Hey Hello: ");
    }
  }
}

class B extends Thread {
  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println("okay Bye ");
    }
  }
}

class try1 {
    public static void main(String[] args) {
    A threadA = new A();

    for(int i=0; i<50; i++){
    System.out.println("hello world");
    }
    threadA.start();

}
    }

    class try2{
        public static void main(String[] args) {
            Runnable r1 = new Runnable() {
                public void run() {
                    System.out.println("Hello");
                }
            };
            Thread t1 = new Thread(r1);
            t1.start();
        }
    }

    class try3{
        public static void main(String[] args) {
            Runnable r1 = () -> {
                System.out.println("Hello");
            };
            Thread t1 = new Thread(r1);
            t1.start();
        }
    }

    class try4{
        int count = 0;
        public void increment(){
            count++;
        }
        
    }
    
    class try5 {
    public static void main(String[] args) throws InterruptedException {
        try4 t = new try4();
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    t.increment();
                }
            }
        };
    Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    t.increment();
                }

        }

    };
    t1.start();
    t2.start();

    t1.join();
    t2.join();
    System.out.println(t.count);

    }

}
    