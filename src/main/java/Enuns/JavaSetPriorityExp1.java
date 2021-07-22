package Enuns;

public class JavaSetPriorityExp1 extends Thread
{
    public void run()
    {
        System.out.println("Priority of thread is: " +Thread.currentThread().getPriority());
    }

    public static void main(String args[])
    {
        //Site!!
        //https://www.javatpoint.com/java-string-format
        //https://compiler.javatpoint.com/opr/test.jsp?filename=JavaSetPriorityEx

        // creating one thread
        JavaSetPriorityExp1 t1 = new JavaSetPriorityExp1();
        // print the maximum priority of this thread
        t1.setPriority(Thread.MIN_PRIORITY);
        // call the run() method
        t1.start();
    }
}
