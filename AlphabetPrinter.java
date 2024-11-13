import java.util.Random;

public class AlphabetPrinter extends Thread {
    public void run() {
        Random random = new Random();
        
        // Loop to print 26 alphabets from 'A' to 'Z' in sequence
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
            
            try {
                // Pause briefly for consistent output pacing
                Thread.sleep(200);  // Delay of 200 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
        
        System.out.println("\nAlphabet sequence completed.");
    }
    
    public static void main(String[] args) {
        AlphabetPrinter printer = new AlphabetPrinter();
        
        // Start the thread
        printer.start();
        
        try {
            // Wait for the thread to complete
            printer.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }
        
        System.out.println("Printing completed successfully.");
    }
}
