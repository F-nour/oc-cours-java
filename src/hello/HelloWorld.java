package hello;

public class HelloWorld {
	
	public static void main(String[] args) {
		sayHelloTo("world");
	}
   
	/** affiche le message "hello" au destinataire fourni
    *
   	* @param recipient
   	*/
	private static void sayHelloTo(String recipient) {
		System.out.println("Hello " + recipient);
	}

}
