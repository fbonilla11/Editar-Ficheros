
	import java.util.*;
	import java.io.FileWriter;
	import java.io.IOException;

public class EscribirFichero {


		static Scanner sc = new java.util.Scanner(System.in);
		
		public void main(String linea) {
			
			
			//Añadir true al final del FileWriter para que se vaya sumando info y o sobreescribiendose
			
					try (FileWriter fw = new FileWriter("fichero.txt" /*Aqu´´i va el nombre del fichero*/, true)){
						
						fw.write(linea + "\n");
						
						fw.close();
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
			
		}
}
