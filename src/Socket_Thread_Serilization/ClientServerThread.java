package Socket_Thread_Serilization;

public class ClientServerThread extends Thread {

    public void run() {
        new Server();
        try {
            Thread.sleep(5000); // Sleep for 5 seconds (5000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Client();
    }
}
