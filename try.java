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