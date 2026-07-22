package Day 04.java04;

class Task extends Thread{
    private String task;
    Task(String task){
        this.task = task;
    }

    @Override
    public void run(){
        System.out.println(task + "is being ");
    }
}

class RTask implements Runnable{
    public void run(){
        
    }
}
public class multi {
    public static void main(String[] args) {
        Thread th1 = new Task("Learn Java");
        Thread th1 = new Task(new RTask("Learn Python"));
        Thread th1 = new Task -> ("Learn Java");

    }
}
