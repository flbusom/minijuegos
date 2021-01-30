import java.util.Random;
import java.util.Scanner;

public class minijuegos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				//menu principal
				menup();
				//menu eleccion
				menue();
				
	}
	
	//funcion para printar el titulo del programa
	public static void menup () {
		System.out.println("  __  __ _       _ _                            \r\n"
				+ " |  \\/  (_)     (_|_)                           \r\n"
				+ " | \\  / |_ _ __  _ _ _   _  ___  __ _  ___  ___ \r\n"
				+ " | |\\/| | | '_ \\| | | | | |/ _ \\/ _` |/ _ \\/ __|\r\n"
				+ " | |  | | | | | | | | |_| |  __/ (_| | (_) \\__ \\\r\n"
				+ " |_|  |_|_|_| |_|_| |\\__,_|\\___|\\__, |\\___/|___/\r\n"
				+ "                 _/ |            __/ |          \r\n"
				+ "                |__/            |___/           ");			
	}//cierre menup
	
	//funcion para printar las opciones que contiene el menu
	public static void menue () throws InterruptedException {
		Scanner sc = new Scanner (System.in);//para poder escribir por teclado para introducir un numero
		int eleccion = 0;//para guardar el que introducimos por teclado
		System.out.println("\nIntroduce una de las siguientes opciones:"
				+ "\n----------------------------"
				+ "\n| 1- Jugar                 |"
				+ "\n| 2- Informacion           |"
				+ "\n| 3- Autores               |"
				+ "\n| 4- Version del minijuego |"
				+ "\n| 5- Salir                 |"
				+ "\n----------------------------");
		eleccion = sc.nextInt();
		//diferentes opciones de eleccion y hacer vinculo con otra funcion
		if (eleccion ==1) {
			juegos();
		}
		if (eleccion ==2) {
			info();
		}
		if (eleccion ==3) {
			autores();
		}
		if (eleccion ==4) {
			version();
		}
		if (eleccion ==5) {
			salir();
		}
	}//cierre menu eleccion
	
	// funcion para printar informacion de que trata cada juego
	public static void info () throws InterruptedException {
		Scanner sc = new Scanner (System.in);//scanner para la introduccion de las opciones a elegir
		int eleccion = 0;
		System.out.println("\nBienvenidos a Minijuegos, un sitio donde encontraras varios juegos a los que pdoer juagr. Aqui vereis unos ejemplos:");
		System.out.println("\nInformacion de los juegos: "
				+ "\n\nInvasion Aliens:"
				+ "\nEs un juego de coordenadas."
				+ "\n2 Jugadores compiten por ver quien es el mejor mientras hay una invasión alien. Ellos deberán ir eligiendo "
				+ "\ncajas por orden de juego y enfrentarse a las pruebas que se les interpondrán.");
		
		System.out.println("\nEl Ahorcado: "
				+ "\nJuego de adivinar una palabra, un jugador piensa una palabra (sin espacios) y el jugador o jugadores"
				+ "\ntienen que adivinar diciendo una letra. En caso de no coincidir una letra, se dibuja un hombre a partes,"
				+ "\npor ejemplo primero la estructura, luego la cabeza, el cuerpo y las extremidades.");
		
		
		System.out.println("\nBlack Jack: "
				+ "\nEl juego consiste en que compitan 2 juagdores o mas, intentando llegar con la suma de las cartas a una suma"
				+ "\nde 21 puntos, en caso de que el jugador se pase habra perdido esa ronda. Y lo mismo con el otro/s juagdores.");
		System.out.println("\n\n\n(en caso de volver atras pulse 4)");
		eleccion = sc.nextInt();
		if(eleccion == 4) {//en casos de que queremos volver atras al menu 
			menue();
		}
	}//cierre info
	
	//funcion para ver la informacion de los autores de los minijuegos
	public static void autores () throws InterruptedException {
		Scanner sc = new Scanner (System.in);// scanner para el teclado
		int eleccion = 0;//variable de la eleccion
		System.out.println("\nEn este minijuego los contribuidores han sido: "
				+ "\nGeorge Boran"
				+ "\nJoel Jimenez"
				+ "\nFerran Latorre");
		
		System.out.println("\n\n\n(en caso de volver atras pulse 4)");
		eleccion = sc.nextInt();
		if(eleccion == 4) {//para en casod e que queramos volver atras
			menue();}
	}//cierre autores
	
	//funcion para ver por consola de la verion del minijuego
	public static void version () throws InterruptedException {
		Scanner sc = new Scanner (System.in);
		int eleccion = 0;
		System.out.println("Este minijuego se encuentra en la primera fase de su version. "
				+ "\nVersion 1.0");	
		System.out.println("\n\n\n(en caso de volver atras pulse 4)");
		eleccion = sc.nextInt();
		if(eleccion == 4) {//opcion para volver atras al menu
			menue();}
	}//cierre version
	
	//funcion para printar mensaje cuando escojemos salir
	public static void salir () {
		Scanner sc = new Scanner (System.in);
		int eleccion = 0;
		System.out.println("\nGracias por haber jugado a nuestros minijuegos!!");
	}//cierre opcion salir
	
	//menu de los juegos para escojer en cual queremos entrar
	public static void juegos () throws InterruptedException {
		Scanner sc = new Scanner (System.in);
		int eleccion = 0;//variable para la eleccion del jueugo
		
		System.out.println("\nJUEGOS A ELEGIR"
				+ "\n--------------------------"
				+ "\n| 1. Invasion Alien      |"
				+ "\n| 2. El Ahorcado         |"
				+ "\n| 3. BlackJack           |"
				+ "\n|                        |"
				+ "\n| 4. Volver Atras        |"
				+ "\n--------------------------");
		eleccion = sc.nextInt();
		
		while(eleccion < 1 || eleccion >4) {//correcion de errores si no introduce un numero correcto
			System.out.println("\nJUEGOS A ELEGIR"
				+ "\n--------------------------"
				+ "\n| 1. Invasion Alien      |"
				+ "\n| 2. El Ahorcado         |"
				+ "\n| 3. BlackJack           |"
				+ "\n|                        |"
				+ "\n| 4. Volver Atras        |"
				+ "\n--------------------------");
			eleccion = sc.nextInt();		
		}//cierre while
		
		if (eleccion ==1) {
			Main.main(null); 
		
		}
		if (eleccion ==2) {
			titulo();
		}
		if (eleccion ==3) {
			bjescoger();
		}
		if (eleccion ==4) {
			menue();
		}
	}//cierre menu elegir juego
	
	
	public static void bjescoger () {
		Scanner sc = new Scanner (System.in);
		int eleccion = 0;
		System.out.println("\nJUGAR CONTRA:"//opcion de elegir modo de juego
				+ "\n----------------------"
				+ "\n| 1.     1VS1        |"
				+ "\n| 2. JUGADOR vs IA   |"  
				+ "\n----------------------"  );
		eleccion = sc.nextInt();
		
		while (eleccion <1 || eleccion >2) {//control de errores enc aso de que no sea un numero correcto vovlera a pedir
			System.out.println("\nJUGAR CONTRA:"
					+ "\n----------------------"
					+ "\n| 1.     1VS1        |"
					+ "\n| 2. JUGADOR vs IA   |"  
					+ "\n----------------------"  );
			eleccion = sc.nextInt();
		}
		
		if(eleccion == 1) {
			menubj();
		}
		if(eleccion == 2) {
			 menubjia();
		}
	}//cierre escoger modo bj
	
	//Esta funcion printa el titulo del minijuego
	public static void titulo () {
		System.out.println("\nBienvenido al minijuego del ahorcado! Consiste en adivinar la palabra que introduzca el jugador, pasatelo bien y buena suerte!!!");
		
		System.out.println(" _______  __              ___       __    __    ______   .______        ______     ___       _______   ______   \r\n" + 
				"|   ____||  |            /   \\     |  |  |  |  /  __  \\  |   _  \\      /      |   /   \\     |       \\ /  __  \\  \r\n" + 
				"|  |__   |  |           /  ^  \\    |  |__|  | |  |  |  | |  |_)  |    |  ,----'  /  ^  \\    |  .--.  |  |  |  | \r\n" + 
				"|   __|  |  |          /  /_\\  \\   |   __   | |  |  |  | |      /     |  |      /  /_\\  \\   |  |  |  |  |  |  | \r\n" + 
				"|  |____ |  `----.    /  _____  \\  |  |  |  | |  `--'  | |  |\\  \\----.|  `----./  _____  \\  |  '--'  |  `--'  | \r\n" + 
				"|_______||_______|   /__/     \\__\\ |__|  |__|  \\______/  | _| `._____| \\______/__/     \\__\\ |_______/ \\______/  \r\n" + 
				"                                                                                                                ");
	
	muecomuerto();
	}//cierre funcion titulo
	

	//Esta funcion printa el dibujo de inicio del menu 
	public static void muecomuerto () {
		System.out.println(			" ___________.._______\r\n" + 
				"| .__________))______|\r\n" + 
				"| | / /      ||\r\n" + 
				"| |/ /       ||\r\n" + 
				"| | /        ||.-''.\r\n" + 
				"| |/         |/  _  \\\r\n" + 
				"| |          ||  `/,|\r\n" + 
				"| |          (\\\\`_.'\r\n" + 
				"| |         .-`--'.\r\n" + 
				"| |        /Y . . Y\\\r\n" + 
				"| |       // |   | \\\\\r\n" + 
				"| |      //  | . |  \\\\\r\n" + 
				"| |     ')   |   |   (`\r\n" + 
				"| |          ||'||\r\n" + 
				"| |          || ||\r\n" + 
				"| |          || ||\r\n" + 
				"| |          || ||\r\n" + 
				"| |         / | | \\\r\n" + 
				"\"\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|\r\n" + 
				"|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\r\n" + 
				"| |        \\ \\        | |\r\n" + 
				": :         \\ \\       : :  \r\n" + 
				". .          `'       . .");
		menui();
	}//cierre funcion muecomuerto
	
	//Esta funcion muestra el menu del modo que se puede elegir entre Jugador o IA
	public static void menui () { //Esta es la funcion del menu que hace que eligas el modo de juego//
		int menu = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("\nElige el modo de juego: ");
		
		System.out.println(""
				+ "\n  ---------------------------  "
				+ "\n  |    Jugador VS Jugador    |  ------>  1 "        
				+ "\n  |    Jugador VS IA         |  ------>  2"
				+ "\n  ---------------------------  "
				);
	
		System.out.println();
		System.out.println("¿Que modo quieres jugar?");
		menu=teclado.nextInt();
		
		if (menu == 1) {
			opcion1();//Si eliges 1 se rediccionara a la funcion de 'opcion1'//
		}
		
		if (menu == 2) {
			opcion2();//Si eliges 2 se rediccionara a la funcion de 'opcion2'//
		}
	}//cierre menui
	
	//Funcion de opciion elegido del jugar contra el jugador//
	public static void opcion1 () {
		
		Scanner teclado = new Scanner(System.in);
		int puntuacion = 0;
		String palabraelegida = " ";
		
		System.out.println(""
				+ "\n --------------------------------------- "
				+ "\n | Has elegido jugar contra un Jugador |"
				+ "\n ---------------------------------------");//
		
		
		System.out.println("Introduzca una palabra jugador 1 (SIN ESPACIOS)");
		palabraelegida = teclado.nextLine();//donde se nos guardara la palabra introducida
		String palabra = palabraelegida;
		palabraelegida = "";
		
		
		for (int l = 0; l < palabra.length(); l++) {
			palabraelegida += "" + palabra.charAt(l) + " ";
		}
		
		for (int i = 0; i < 50; i++) { //Da un salto de 50 lineas para que no se vea la plabra secreta que se ha introducido//
			System.out.println();
		}
		
		String palabraJuego = ""; // palabra que el jugador2 ira rellenando 
		System.out.println("La palabra tiene esta logitud: ");
		
		for (int i = 0; i < palabraelegida.length() / 2; i++) { // imprimira el _ por cada letra que tenga la palabra//
			palabraJuego += "_ ";
		}
		
		System.out.println(palabraJuego);
		
		String jugadas;
		String[] palabraJugador2 = new String[palabraelegida.length()];
		for (int m = 0; m < palabraJuego.length(); m++) {
			palabraJugador2[m] = "" + palabraJuego.charAt(m);
		}
		int caracteres = palabraelegida.length() / 2; //Esto significa que si el jugador pone una letra que no coincida con la palabra perdera una vida//
		int caracteres2;
		
		while (puntuacion < 5) { //Si el jugador llega a perder las 5 vidas el jugador pierde//
			
			System.out.println("\nNumero de vidas: " + (puntuacion - 5) + " de 5.");
			
			
			System.out.println("Introduzca una letra: ");
			jugadas = teclado.nextLine();
			
			
			while (jugadas.length() != 1) { // El jugador 2 puede jugar
				System.out.println("Introduzca solo una letra: ");
				jugadas = teclado.nextLine();
			}
			
			palabraJugador2 = comprovacion(jugadas, palabraelegida, palabraJugador2); //Se comprueba si la letra que ha introducido esta en la palabra secreta//
			
			for (int m = 0; m < palabraJugador2.length; m++) { //Esto es lo que veria el jugador 
				System.out.print(palabraJugador2[m]);
			}
			System.out.println();
			
			palabraJuego = "";
			
			for (int x = 0; x < palabraelegida.length(); x++) {
				palabraJuego += palabraJugador2[x];
			}
			
			caracteres2 = caracteres2(palabraJuego, '_');
			if (caracteres2 == 0) {
				puntuacion = 6; // si vale 6 gana la partida//
			}
			
			if (caracteres2 == caracteres) { //comprueba si pierde una vida//
				puntuacion++;
			}
			if (puntuacion == 5) {
				
				System.out.println("\nNo ha aguntado el sufrimiento y ha muerto, malas personas :(");
			}
			if (puntuacion == 6) {
				
				System.out.println("\nLe has salvado de un sufrimiento de muerte, ENHORABUENA!"); 
			}
			Vidas(puntuacion);
			caracteres = caracteres2;
		}
		System.out.println("\nSe acabo el juego, GRACIAS POR JUGARLO :)");
		
	}//cierre opcion 1
	
	//Funcion de la opcion para jugar contra la IA//
	public static void opcion2 () {
		
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		int puntuacion = 0;
		String palabraelegida = " ";
		
		System.out.println(""
				+ "\n ---------------------------------- "
				+ "\n | Has elegido jugar contra la IA |"
				+ "\n ----------------------------------");//
		
		
		System.out.println("Introduzca una palabra jugador 1 (SIN ESPACIOS)");
		palabraelegida = teclado.nextLine();//donde se guardara la palabra que introduzcamos
		String palabra = palabraelegida;
		palabraelegida = "";
		
		
		for (int l = 0; l < palabra.length(); l++) {
			palabraelegida += "" + palabra.charAt(l) + " ";
		}
		
		for (int i = 0; i < 50; i++) { //Da un salto de 50 lineas para que no se vea la plabra secreta que se ha introducido//
			System.out.println();
		}
		
		String palabraJuego = ""; // Esto es para que el jugador 2 vaya rellenado la palabra
		System.out.println("La palabra tiene esta logitud: ");
		
		for (int i = 0; i < palabraelegida.length() / 2; i++) { // imprimira el _ por cada letra que tenga la palabra//
			palabraJuego += "_ ";
		}
		
		System.out.println(palabraJuego);
		
		String jugadas;
		String[] palabraMaquina = new String[palabraelegida.length()];
		for (int m = 0; m < palabraJuego.length(); m++) {
			palabraMaquina[m] = "" + palabraJuego.charAt(m);
		}
		int caracteres = palabraelegida.length() / 2; //Esto significa que si el jugador pone una letra que no coincida con la palabra perdera una vida//
		int caracteres2;
		
		while (puntuacion < 5) { //Si el jugador llega a perder las 5 vidas el jugador pierde//
			
			System.out.println("\nNumero de vidas: " + (puntuacion - 5) + " de 5.");
			
			System.out.println("Introduzca una letra: ");
			jugadas = teclado.nextLine();
			
			while (jugadas.length() != 1) { // El jugador 2 puede jugar
				System.out.println("Introduzca solo una letra: ");
				jugadas = teclado.nextLine();
			}
			
			palabraMaquina = comprovacion(jugadas, palabraelegida, palabraMaquina); //Se comprueba si la letra que ha introducido esta en la palabra secreta//
			
			for (int m = 0; m < palabraMaquina.length; m++) {
				System.out.print(palabraMaquina[m]);
			}
			System.out.println();
			
			palabraJuego = "";
			
			for (int x = 0; x < palabraMaquina.length; x++) {
				palabraJuego += palabraMaquina[x];
			}
			
			caracteres2 = caracteres2(palabraJuego, '_');
			if (caracteres2 == 0) {
				puntuacion = 6; // si vale 6 gana la partida//
			}
			
			if (caracteres2 == caracteres) { //comprueba si pierde una vida//
				puntuacion++;
			}
			if (puntuacion == 5) {
				
				System.out.println("\nNo ha aguntado el sufrimiento y ha muerto, malas personas :(");
			}
			if (puntuacion == 6) {
				
				System.out.println("\nLe has salvado de un sufrimiento de muerte, ENHORABUENA!"); 
			}
			Vidas(puntuacion);
			caracteres = caracteres2;
		}
		
		System.out.println("\nSe acabo el juego, GRACIAS POR JUGARLO :)");
		
	}//cierre opcion 2
		
	//Esta funcion comprueba si el jugador acierta una letra
	public static String[] comprovacion (String jugadas,String palabraelegida,String []palabraJugador2) {
	//devuelve la palabra si acierta una letra//
	
	for (int i = 0; i < palabraelegida.length(); i++) {
		if (palabraelegida.charAt(i) == jugadas.charAt(0)) {
			palabraJugador2[i] = jugadas;
		}
	}
	return palabraJugador2;
}//cierre comprovacion

	//Funcion donde cada vez que pierda vida se pondra el dibujo correspondiente//
	public static void Vidas (int puntuacion) {
	
	switch (puntuacion) {
		case 1:
System.out.println("                       ________________________                 \r\n" + 
					"                     ||                                      \r\n" + 
					"                     ||                                       \r\n" + 
					"                     ||                                       \r\n" + 
					"                     ||                                       \r\n" + 
					"                     ||                                      \r\n" + 
					"                     ||                                       \r\n" + 
					"                     ||                                     \r\n" + 
					"                     ||                                       \r\n" + 
					"                     ||                                       \r\n" + 
					"                     ||                                       \r\n" + 
					"                     ||                                       \r\n" + 
					"                     ||                                       \r\n" + 
					"                 ____||____                                          ");
            
            break;
		case 2:
System.out.println("       	                _________________________                  \r\n" + 
			        "	                  ||                      |                  \r\n" + 
			       	"	                  ||                      |                  \r\n" + 
			        "	                  ||                     _|_                 \r\n" + 
			       	"	                  ||                    (___)_               \r\n" + 
			       	"	                  ||                   |     |               \r\n" + 
			       	"	                  ||                   |     |               \r\n" + 
			       	"	                  ||                   |_____|               \r\n" + 
			       	"	                  ||                                          \r\n" + 
			       	"	                  ||                                          \r\n" + 
			       	"	                  ||                                          \r\n" + 
			       	"	                  ||                                          \r\n" + 
			       	"	                  ||                                          \r\n" + 
			       	"	              ____||____   								            ");                        
            
            break;
		case 3:
System.out.println("                     ______________________________                		 \r\n" + 
			 		"                   ||                            |              \r\n" + 
			 		"                   ||                            |              \r\n" + 
			 		"                   ||                           _|_             \r\n" + 
			 		"                   ||                         _(___)_           \r\n" + 
			 		"                   ||                         |     |           \r\n" + 
			 		"                   ||                         |     |           \r\n" + 
			 		"                   ||                         |_____|           \r\n" + 
			 		"                   ||                            ||             \r\n" + 
			 		"                   ||                     ||||||||||||||||      \r\n" + 
			 		"                   ||                                           \r\n" + 
			 		"                   ||                                      \r\n" + 
			 		"                   ||                                      \r\n" + 
			 		"                   ||                                          \r\n" + 
			 		"                   ||                                            \r\n" + 
			 		"               ____||____                                        ");
             
             break;
		case 4: 
System.out.println("                     ______________________________                 \r\n" + 
			 		"                   ||                            |               \r\n" + 
			 		"                   ||                            |               \r\n" + 
			 		"                   ||                           _|_              \r\n" + 
			 		"                   ||                         _(___)_            \r\n" + 
			 		"                   ||                         |     |            \r\n" + 
			 		"                   ||                         |     |            \r\n" + 
			 		"                   ||                         |_____|            \r\n" + 
			 		"                   ||                            ||              \r\n" + 
			 		"                   ||                     ||||||||||||||||       \r\n" + 
			 		"                   ||                            ||              \r\n" + 
			 		"                   ||                            ||              \r\n" + 
			 		"                   ||                            ||         \r\n" + 
			 		"                   ||                                          \r\n" + 
			 		"                   ||                                            \r\n" + 
			 		"               ____||____                                        ");
             
             break;

		case 5:
System.out.println("                      ______________________________         \r\n" + 
			 		"                   ||                            |               \r\n" + 
			 		"                   ||                            |               \r\n" + 
			 		"                   ||                           _|_              \r\n" + 
			 		"                   ||                         _(___)_            \r\n" + 
			 		"                   ||                         |     |             \r\n" + 
			 		"                   ||                         |     |             \r\n" + 
			 		"                   ||                         |_____|               \r\n" + 
			 		"                   ||                            ||                 \r\n" + 
			 		"                   ||                     ||||||||||||||||                \r\n" + 
			 		"                   ||                            ||            \r\n" + 
			 		"                   ||                            ||            \r\n" + 
			 		"                   ||                          ||  ||          \r\n" + 
			 		"                   ||                         ||    ||             \r\n" + 
			 		"                   ||                        ||      ||           \r\n" + 
			 		"               ____||____                                         ");
             
             break;
	}
}//cierre funcion puntuacion




	//Esta funcion guarda las letras y las cuenta
	public static int caracteres2 (String cadena, char caracter){
	int posicionp, contador = 0;
	//Se busca la primera letra//
	posicionp = cadena.indexOf(caracter);
	while (posicionp != -1) {//mientras se busca el caracter por el jugador//
		contador++; //cuenta la letra//
		posicionp = cadena.indexOf(caracter, posicionp + 1);
		
	}
	return contador;
}// cierre funcion caracteres2
	
	
	//funcion para printar el nombre del juego
	public static void menubj () {
		System.out.println("\nBienvenido al juego del 'Black Jack'. el juego consiste en reunir cartas hasta llegar a 21 sin pasarte.");
		System.out.println(" ____  _            _    _            _    \r\n" + 
				" |  _ \\| |          | |  (_)          | |   \r\n" + 
				" | |_) | | __ _  ___| | ___  __ _  ___| | __\r\n" + 
				" |  _ <| |/ _` |/ __| |/ / |/ _` |/ __| |/ /\r\n" + 
				" | |_) | | (_| | (__|   <| | (_| | (__|   < \r\n" + 
				" |____/|_|\\__,_|\\___|_|\\_\\ |\\__,_|\\___|_|\\_\\\r\n" + 
				"                        _/ |                \r\n" + 
				"                       |__/                 ");
		System.out.println("El juego consiste en reunir cartas hasta llegar a 21 contanto los numeros sin pasarte. Si te pasas pierdes");
		blackjack();
	}//cierre void menubj
	
	//funcion dondehay el juego del blackjack
	public static void blackjack () {
		Scanner sc = new Scanner (System.in);//scanner para introducir por teclado
		int rnum = (int) (1 + Math.random() * 10);//numero randon para la primera carta aleatorio
		int total = 0;
		int p = 0;//para guardar el jugador que empieza
		int ronda = 1;//contador de rondas
		int rg1 = 0;
		int rg2 = 0;
		char otracarta = 'y';//eleccion si quiere otra carta
		int c1 = 0;
		int c2 = 0;
		
		System.out.println("\n¿Que jugador empieza? ¿El 1 o el 2?");//elegir que jugador va ha empezar, si el 1 o el 2
		p = sc.nextInt();
			while(p< 1 || p>2) {
				System.out.println("\n¿Que jugador empieza? ¿El 1 o el 2?");//control de errores en caso de que no sea 1 o 2
				p = sc.nextInt();
			}
		
			while(ronda <=4) {//para hacer las repeticiones de las rondas mientras sea igual o menos a 4
				otracarta = 'y';
				total= 0;//para reiniciar la suma de las cartas al emepzar la ronda del otro jugador
				System.out.println("\nRonda numero: " +ronda);//printar para saber en cual ronda nos encontramos
				System.out.println("\nEmpieza el jugador " +p);//nos dice que jugador le toca
				
			while (otracarta == 'y') {
					rnum = (int) (1 + Math.random() * 10);//numero random de la carta para saber cual te toca
					System.out.println("\nCarta: numero " +rnum);// printamos la primera carta y empieza el jeugo
					total = total + rnum;
					System.out.println("Suma de las cartas " +total);
				
			if (total <21) {//en caso de que el numero que tengamos es menoa a 21 podemos pedir otra carta
				System.out.print("Quieres otra carta? (y -> para si / n -> para no): ");//nos pide k introduzcamos si queremos una carta mas o no
					rnum = (int) (1 + Math.random() * 10);//para el numero aleatorio de la carta
				otracarta = sc.next().charAt(0);//para registrar la letra la cual seleccionamos
					}//cierre if <21
				
			if (total > 21 ) {//en caso de que nos pasemos de 21 nos printara este mensaje
					System.out.println("Te has pasado, por lo tanto has perdido la ronda! Intenta no pasarte la proxima ronda :(");
					
					otracarta = 'n';
				}//cierre if >21
			}//cierre while otracarta
				System.out.println("\nJugador " +p + " te has quedado con una suma de " +total );
				
				if (p == 1) {
					c1 = total;	
				}
				else if( p== 2) {
					c2 = total;
				}
			//para hacer un control de puntos para saber quien gana cada 2 rondas
				//comprovaciones para saber cual juagdor 
			if(ronda ==2 || ronda ==4) {	
			if(c1 < 21 && c1 > c2) {
				rg1++;
			}
			else if(c2 > 21 && c1 < 21) {
				rg1++;
			}
			else if (c1 > 21 && c2< 21) {
				rg2++;
			}
			else if(c2 < 21 && c2 > c1) {
				rg2++;
			}
			}//cierre if ronda
				//para saber cuantas rondas a ganado cada jugador
				System.out.println("\nRondas ganadas juagdor 1 = " +rg1);
				System.out.println("Rondas ganadas juagdor 2 = " +rg2);
				
				
				puntfinal(rg1,rg2, ronda);//llamada a la funcion que nos printe que juagdor gana la ronda
				
				p=cambioj(p);// llamada de la funcion apra hacer el cambio de jugador al terminar la ronda
				ronda++;//para sumar 1 a la ronda del contador
			}//cierre while
	}//cierre blakjack 1vs1
	
	
	public static void puntfinal (int rg1, int rg2, int ronda) {
		//comprobar el numero de ganador de la ronda y printar el mensaje
		if(ronda ==2 || ronda == 4) {
		if(rg1 > rg2) {
			System.out.println("\n   _____                          _                       _              __ \r\n"
					+ "  / ____|                        | |                     | |            /_ |\r\n"
					+ " | |  __  __ _ _ __   __ _       | |_   _  __ _  __ _  __| | ___  _ __   | |\r\n"
					+ " | | |_ |/ _` | '_ \\ / _` |  _   | | | | |/ _` |/ _` |/ _` |/ _ \\| '__|  | |\r\n"
					+ " | |__| | (_| | | | | (_| | | |__| | |_| | (_| | (_| | (_| | (_) | |     | |\r\n"
					+ "  \\_____|\\__,_|_| |_|\\__,_|  \\____/ \\__,_|\\__, |\\__,_|\\__,_|\\___/|_|     |_|\r\n"
					+ "                                           __/ |                            \r\n"
					+ "                                          |___/                             ");
		}
		else if (rg2> rg1){
			System.out.println("\n  _____                          _                       _              ___  \r\n"
					+ "  / ____|                        | |                     | |            |__ \\ \r\n"
					+ " | |  __  __ _ _ __   __ _       | |_   _  __ _  __ _  __| | ___  _ __     ) |\r\n"
					+ " | | |_ |/ _` | '_ \\ / _` |  _   | | | | |/ _` |/ _` |/ _` |/ _ \\| '__|   / / \r\n"
					+ " | |__| | (_| | | | | (_| | | |__| | |_| | (_| | (_| | (_| | (_) | |     / /_ \r\n"
					+ "  \\_____|\\__,_|_| |_|\\__,_|  \\____/ \\__,_|\\__, |\\__,_|\\__,_|\\___/|_|    |____|\r\n"
					+ "                                           __/ |                              \r\n"
					+ "                                          |___/                               ");
		}
		else if (rg1 == rg2){
			System.out.println("\n _                                                        _                                                 _            __\r\n"
					+ " | |                                                      | |                                               | |        _ / /\r\n"
					+ " | |     __ _    ___ ___  ___  __ _    __ _ _   _  ___  __| | __ _    ___ _ __     ___ _ __ ___  _ __   __ _| |_ ___  (_) | \r\n"
					+ " | |    / _` |  / __/ _ \\/ __|/ _` |  / _` | | | |/ _ \\/ _` |/ _` |  / _ \\ '_ \\   / _ \\ '_ ` _ \\| '_ \\ / _` | __/ _ \\   | | \r\n"
					+ " | |___| (_| | | (_| (_) \\__ \\ (_| | | (_| | |_| |  __/ (_| | (_| | |  __/ | | | |  __/ | | | | | |_) | (_| | ||  __/  _| | \r\n"
					+ " |______\\__,_|  \\___\\___/|___/\\__,_|  \\__, |\\__,_|\\___|\\__,_|\\__,_|  \\___|_| |_|  \\___|_| |_| |_| .__/ \\__,_|\\__\\___| (_) | \r\n"
					+ "                                         | |                                                    | |                      \\_\\\r\n"
					+ "                                         |_|                                                    |_|                         ");
		}
		}
	}//cierre puntos final 1 vs 1
	
	public static int cambioj (int p) {//para hacer el cambio de jugador al termianr la ronda
		if(p==1) {
			p=2;
		}
		else if(p ==2) {
			p=1;
		}
		return p;
	}//cierre cjugador		
		
	
	public static void menubjia () {
		//opcion jugar contra la IA
		System.out.println("Has escogido juagr contra la IA. ");//mensajes de bienvenida
		System.out.println("\nBienvenido al juego del 'Black Jack'. el juego consiste en reunir cartas hasta llegar a 21 sin pasarte.");
		System.out.println(" ____  _            _    _            _    \r\n" + 
				" |  _ \\| |          | |  (_)          | |   \r\n" + 
				" | |_) | | __ _  ___| | ___  __ _  ___| | __\r\n" + 
				" |  _ <| |/ _` |/ __| |/ / |/ _` |/ __| |/ /\r\n" + 
				" | |_) | | (_| | (__|   <| | (_| | (__|   < \r\n" + 
				" |____/|_|\\__,_|\\___|_|\\_\\ |\\__,_|\\___|_|\\_\\\r\n" + 
				"                        _/ |                \r\n" + 
				"                       |__/                 ");
		System.out.println("El juego consiste en reunir cartas hasta llegar a 21 contanto los numeros sin pasarte. Si te pasas pierdes."
				+ "\nPuedes ir pidiendo cartas o plantarte, pero siempre sin pasarte de 21.");
		bjia();
	}//cierre void menubj
	
	public static void bjia () {//codigo del juego contra la IA
		Scanner sc = new Scanner (System.in);
		int rnum = (int) (1 + Math.random() * 10);
		int total = 0;
		int p = 0;
		int ronda = 1;
		char otracarta = 'y';
		Random random = new Random();
		int rm = 0;
		
		System.out.println("\nA continuacio jugaremos al blackjack Jugador vs IA.");//para escojer quien empieza si el juagdor o la maquina
		System.out.println("\n¿Quien empieza?"
				+ "\n 1  ->    Jugador"
				+ "\n 2  ->    IA");
		p = sc.nextInt();
		
		while (ronda <4) {//habra un total de 4 rondas
			total=0;
			System.out.println("\nRonda numero: " +ronda);//printar por pantalla en que ronda nos encontramos
			
			if(p ==1) {
				System.out.println("\nTurno del jugador " );//depende de quien empieze hara referencia un numero diferente 
				}
			else if (p == 2) {
				System.out.println("\nTurno de la IA ");
			}//cierre else if
			if (p == 1) {
				while (otracarta == 'y') {
				rnum = (int) (1 + Math.random() * 10);
				System.out.println("\nCarta: numero " +rnum);// printamos la primera carta y empieza el jeugo
				total = total + rnum;
				System.out.println("Suma de las cartas " +total);

			if (total <21) {
			System.out.print("Quieres otra carta? (y -> para si / n -> para no): ");
				rnum = (int) (1 + Math.random() * 10);
			otracarta = sc.next().charAt(0);
				}//cierre if <21
			
			if (total > 21 ) {
				
				System.out.println("Te has pasado, por lo tanto has perdido la ronda! Intenta no pasarte la proxima ronda :(");
				
				otracarta = 'n';
					
			}//cierre if >21
		}//cierre while otracarta	
			System.out.println("\nJugador " +p + " te has quedado con una suma de " +total );
			p=cambioj(p);
			ronda++;		
			}//cierre if jugador 
			
			else if (p == 2) {
				while (otracarta == 'y') {
					rnum = (int) (1 + Math.random() * 10);
					System.out.println("\nCarta: numero " +rnum);// printamos la primera carta y empieza el jeugo
					total = total + rnum;
					System.out.println("Suma de las cartas " +total);
					
				if (total <21) {
					while (otracarta == 'y') {
				System.out.print("Quieres otra carta? (y -> para si / n -> para no): ");
				rm = random.nextInt(3)+1;
				
				if (rm == 1 || rm == 2) {
					
					otracarta= 'y';
				}
				
				else if (rm == 3) {
					
					otracarta= 'n';
				}
					}
				
				rnum = (int) (1 + Math.random() * 10);
				otracarta = sc.next().charAt(0);
					}//cierre if <21
				
				if (total > 21 ) {//en caso de que te pases de 21 nos printara este mensaje
					
					System.out.println("Te has pasado, por lo tanto has perdido la ronda! Intenta no pasarte la proxima ronda :(");
					
					otracarta = 'n';
				}//cierre if >21
			}//cierre while otracarta	
			}//cierre == 2 IA
			otracarta = 'y';
		
			p=cambioj(p);//para hacer el cambio del jugador al cambiar la ronda
			ronda++;//contador de ronda
		}//cierre while ronda	
	}//cierre bj vs ia

}//cierre general de todas funciones
