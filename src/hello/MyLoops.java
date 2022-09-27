package hello;

public class MyLoops {
    
    public static void main(String[] args) {
        forLoop();
        whileLoop();
    }
    
    private static void forLoop () {
        for (int i=0; i<5; i++) {
        	if (i==3) {
        		continue;
        	}   
        	System.out.println(i + " I am having so much fun!");
        }
    }
    
    private static void whileLoop() {
        int i = 0;
        while (i < 5) {
            i++;
            System.out.println("I am having so much f!");
        }
    }
}