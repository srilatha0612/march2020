public class OverRiding extends Thread {

    public void start(){
        for(int i=0;i<5;i++){

            System.out.println("strat class");
        }
    }

    public void run() {
        for (int i=0;i<5;i++){

            System.out.println("run class");
        }
    }

}
class ThreadDemon{
    public static void main(String[] args) {
        OverRiding o=new OverRiding();
        o.start();
        for (int i=0;i<5;i++){
            System.out.println("main method");
        }
    }
}
