package conditions;

public class ConditionalHello {
	
	/** Le programme commence ici
	* @param args arguments envoyé avec la ligne de commande
	*/

		public static void main(String[] args) {

			if (args.length==1) {
				sayHelloTo(args[0]);
			}
			else {
				sayHelloTo("world");
			}
		}

	/** affiche le message hello au destinataire fourni
	* @param recipient
	*/
	   private static void sayHelloTo(String recipient) {
		   System.out.println("Hello " + recipient + "!");
	   }

}
