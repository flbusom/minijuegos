import java.util.*; //Importamos los utiles de Java.

/*BORAN GEORGE IOAN DAW1							
 *PARA UNA INFORMACION BIEN EXPLICADA SOBRE EL JUEGO, ACCEDED A LA
 *DOCUMENTACION. GRACIAS.*/

public class Main {
	public static Random rn = new Random(); //Random global
	public static Scanner sc = new Scanner(System.in); //Scanner global

	// VARIABLES GLOBALES
	public static int filas = 0; // Filas numerico.
	public static String fila = "fila"; /*
	 * Fila String para pasar dato a funcion datosFuncion (String palabra,String
	 * jugador.)
	 */

	public static int columnas = 0; // Columnas numerico.
	public static String columna = "columna"; /*
	 * Fila String para pasar dato a funcion datosFuncion (String
	 * palabra,String jugador)
	 */

	public static int numPreguntas = 0; // Numero que se le envia a la funcion para seleccionar la pregunta que toca.
	public static String resultado = " ";

	public static int countPartida = 0; // Int global para contar las rondas de la partida.
	public static int respuesta = 0;

	public static char interrogante = '?'; // Char de interrogante.
	public static char persona = '웃'; // Char de persona.
	public static char cuadrado = '■'; // Char de cuadrado.
	public static char equis = 'X'; // Char de X.

	public static String jugadorUno = " "; // jugadorUno es la String que guarda el nombre del primer jugador.
	public static String jugadorDos = " "; // jugadorDos es la String que guarda el nombre del segunda jugador.
	public static String finalDeJuego = " "; // String para guardar la funcion de finalDeJuego.
	public static String personaFuncion = " "; // String para guardar la funcion de las personas ASCII.
	public static String preguntasRespuesta[] = new String[9]; // String para guardar las preguntas con sus respuestas.
	public static int funcionPreguntas = 0; // int para guardar la funcion preguntas.
	public static int informacion = 0;
	public static String nombres = " "; // String para compactar la introduccion de nombres.
	public static char[][] backend = new char[6][6]; // Char para el tablero con simbolos.
	public static char[][] tablero = new char[6][6]; // Char con el tablero de cajas.
	public static String jugadoresUno = " "; // String para guardar el nombre del jugador Uno.
	public static String jugadoresDos = " "; // String para guardar el nombre del jugador dos.

	public static boolean partida = true; 	// Booleano para validar cuando se completan las partidas.
	public static boolean respuestas = true;	//Booleano para guardar 
	public static boolean introduccionNombres = true; /*   Booleano para validar que se han guardado correctamente los
	 * nombres y asi poder salir del bucle.
	 */
	public static boolean global = false; //Funcion global, es aquella que nos devolvera si la respuesta es correcta o no.

	public static int countPuntosDos = 0; // Contador jugador dos.
	public static int countPuntos = 0; // Contador jugador uno.


	//Funcion Main donde se invocan las otras funciones para crear el juego.
		
	
	public static void main(String args[]) throws InterruptedException {
		tablero = tablero(tablero); /* Invocamos la funcion del tablero para crear la matriz en la que se va a
									 jugar.*/
		backend = backend(backend); // Invocamos la funcion del segundo tablero el cual se utilizara para comparar
		// posiciones.
		nombres = nombres(nombres); // Invocamos la funcion para la introduccion de nombres.

		do { // Bucle para ir haciendo rondas.

			jugadoresUno = jugadoresUno(jugadorUno); /*
			 * Invocamos la funcion para introduccion de filas y columnas del jugador uno.
			 */
			jugadoresDos = jugadoresDos(jugadorDos); /*
			 * Invocamos la funcion para introduccion de filas y columnas del jugador dos .
			 */
			countPartida++; // Contador de rondas completas para ir sumando hasta validar el booleano.
			if (countPartida == 18) { // 18 rondas
				partida = false; // Volvemos el booleano partida a falso para salir del bucle.
			}

		} while (partida);// Se acaba el bucle cuando partida se vuelve false.
		finalDeJuego = finalPartida(countPuntos, countPuntosDos, jugadorUno,jugadorDos); // Invocamos la funcion de finalPartida y le pasamos las puntuaciones y los nombres de los jugadores
	}	
	
	

	/* Funcion que pide los nombres a los jugadores e implementa la introduccion al
	 juego.*/
	public static String nombres(String nombres) throws InterruptedException {

		if (introduccionNombres) {
			jugadorUno = jugadorUno(jugadorUno);
			jugadorDos = jugadorDos(jugadorDos);
			for (int i = 0; i < 70; i++) {
				System.out.println(" ");
			}
			resultado=intro(resultado); //print Intro juego
			introduccionNombres = false;
		}

		return nombres;
	}

	// Funcion que devuelve un string y coge un String tambien que contendra el
	// Nombre de los Jugadores.
	// Tiene whiles para pedir datos y para validar los datos .

	public static String jugadoresUno(String jugadorUno) {

		System.out.println(" ");
		System.out.println("Turno de " + jugadorUno + ". Total puntos: " + countPuntos);

		repasoTablero(tablero); // print tablero de juego. [CAJAS]
		filas = datosFuncion(fila, jugadorUno); // Pedir Filas
		columnas = datosFuncion(columna, jugadorUno); // Pedir Columnas

		while (tablero[filas][columnas] != cuadrado) {
			System.out.println();
			System.out.println("Elige otra caja!! Esa esta ya elegida!!");
			filas = datosFuncion(fila, jugadorUno); // Pedir Filas
			columnas = datosFuncion(columna, jugadorUno); // Columnas
		}

		tablero[filas][columnas] = backend[filas][columnas];
		countPuntos = ifsIntroduccionesUno(countPuntos, global);
		return jugadorUno;
	}

	/* Funcion que devuelve un string y coge un String tambien que contendra el
	 Nombre de los Jugadores.
	 Tiene whilespara pedir datos y para validar los datos .*/

	public static String jugadoresDos(String jugadorDos) {

		System.out.println(" ");
		System.out.println("Turno de " + jugadorDos + ". Total puntos: " + countPuntosDos);

		repasoTablero(tablero); // print tablero de juego. [CAJAS]
		filas = datosFuncion(fila, jugadorDos); // Pedir Filas
		columnas = datosFuncion(columna, jugadorDos); // Pedir Columnas

		while (tablero[filas][columnas] != cuadrado) {
			System.out.println();
			System.out.println("Elige otra caja!! Esa esta ya elegida!!");
			filas = datosFuncion(fila, jugadorDos); // Pedir Filas
			columnas = datosFuncion(columna, jugadorDos); // Columnas
		}

		tablero[filas][columnas] = backend[filas][columnas];
		countPuntosDos = ifsIntroduccionesDos(countPuntosDos, global);
		return jugadorDos;
	}

	/*
	 * Funcion que devuelve una int que son los puntos del jugador uno, tiene un
	 * booleano para validar en caso de pregunta si la respuesta es correcta o no
	 * para asi sumar +2 puntos en caso positivo. En el caso de encontrarse con
	 * personas se le suma un punto y en caso de no encontrarse nada se le printa
	 * por pantalla un mensaje.
	 */

	public static int ifsIntroduccionesUno(int countPuntos, boolean validacion) {

		if (backend[filas][columnas] == interrogante) {

			tablero[filas][columnas] = interrogante;
			respuestas = respuestaDos(preguntasRespuesta, numPreguntas, jugadorUno);
			numPreguntas++;

			if (!global) {
				countPuntos++;
				countPuntos++;
				global = true;
			}
		}
		if (backend[filas][columnas] == persona) {
			personaFuncion = asciiTres(personaFuncion);
			tablero[filas][columnas] = persona;
			countPuntos++;
		}

		if (backend[filas][columnas] == cuadrado) {
			System.out.println("No habia nada en esa caja!!");
			tablero[filas][columnas] = equis;
		}

		return countPuntos;
	}

	/*
	 * Funcion que devuelve una int que son los puntos del jugador dos, tiene un
	 * booleano para validar en caso de pregunta si la respuesta es correcta o no
	 * para asi sumar +2 puntos en caso positivo. En el caso de encontrarse con
	 * personas se le suma un punto y en caso de no encontrarse nada se le printa
	 * por pantalla un mensaje.
	 */

	public static int ifsIntroduccionesDos(int countPuntosDos, boolean validacion) {

		if (backend[filas][columnas] == interrogante) {
			tablero[filas][columnas] = interrogante;
			respuestas = respuestaDos(preguntasRespuesta, numPreguntas, jugadorDos);
			numPreguntas++;
			if (!global) {
				countPuntosDos++;
				countPuntosDos++;
				global = true;
			}
		}
		if (backend[filas][columnas] == persona) {
			personaFuncion = asciiTres(personaFuncion);
			tablero[filas][columnas] = persona;
			countPuntosDos++;
		}
		if (backend[filas][columnas] == cuadrado) {
			System.out.println("No habia nada en esa caja!!");
			tablero[filas][columnas] = equis;
		}
		return countPuntosDos;
	}

	/*
	 * Funcion String jugador Uno, que permite al jugador introducir su nombre.
	 * Devuelve un String que se guarda en la variable jugadorUno.
	 */

	public static String jugadorUno(String jugadorUno) {

		System.out.println("Bienvenidos al Juego Invasion Alien, para continuar introduzcan sus nombres.");
		System.out.print("Jugador Uno introduzca su nombre porfavor: ");
		jugadorUno = sc.nextLine();

		while (jugadorUno.length() < 4 || jugadorUno.length() > 10) {
			System.out.println("Introduzca un nombre de entre 4 y 10 letras porfavor.");
			jugadorUno = sc.nextLine();
		}
		System.out.println(" ");
		return jugadorUno;
	}

	/*
	 * Funcion String jugador Dos, que permite al jugador dos introducir su nombre.
	 * Devuelve un String que se guarda en la variable jugadorDos.
	 */

	public static String jugadorDos(String jugadorDos) {

		System.out.print("Jugador Dos introduzca su nombre porfavor: ");
		jugadorDos = sc.nextLine();

		while (jugadorDos.length() < 4 || jugadorDos.length() > 10) {
			System.out.println("Introduzca un nombre de entre 4 y 10 letras porfavor.");
			jugadorDos = sc.nextLine();
		}
		return jugadorDos;
	}

	/*
	 * Funcion de booleano, toma los datos de la funcion "respuestaPegunta" e pide
	 * la respuesta a los jugadores. Despues de ver la respuesta el booleano
	 * validacion se vuelve false o se queda en true y manda la respuesta a la
	 * funcion principal.
	 */

	public static boolean respuestaDos(String preguntasFuncion[], int numPreguntas, String jugador) {

		String[] todasLasPreguntas = new String[9];
		todasLasPreguntas = respuestaPregunta(todasLasPreguntas, numPreguntas);
		System.out.println(" ");
		System.out.print("Introduce tu respuesta: ");
		respuesta = sc.nextInt();
		System.out.println(" ");

		if (respuesta == 2) { // Aqui se debia hacer otra funcion pero me quede un poco sin tiempo.
			System.out.println("Respuesta Correcta!! Ganas 2 puntos!!");
			System.out.println(" ");
			global = false;
		} else if (respuesta == 1 || respuesta == 3) {
			System.out.println("Respuesta Incorrecta!! Sigues con los mismos puntos!! ");
			System.out.println(" ");
		}
		if (respuesta > 3 || respuesta < 1) {
			System.out.print("Error!! Datos fuera del rango!! Introduce la respuesta de nuevo: ");
			System.out.println(" ");
			respuesta = sc.nextInt();
			if (respuesta == 2) {
				System.out.println("Respuesta Correcta!! Ganas 2 puntos!!");
				System.out.println(" ");
				global = false;
			} else if (respuesta == 1 || respuesta == 3) {
				System.out.println("Respuesta Incorrecta!! Sigues con los mismos puntos!! ");
				System.out.println(" ");
			}

		}

		return global;
	}

	/*
	 * Funcion con la cual creamos el array "backend" Para introducir diferentes
	 * simbolos "obstaculos" [cuadrados, personas e interrogantes] con los cuales el
	 * jugador se ira encontrando.
	 */

	public static char[][] backend(char[][] tbackend) {

		int filas = 6;
		int columnas = 6;
		int count = 0;
		int countDos = 0;

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tbackend[i][j] = '■';
			}
		}
		while (count < 12) {
			filas = rn.nextInt(6) + 0;
			columnas = rn.nextInt(6) + 0;
			while (tbackend[filas][columnas] != '■') {
				filas = rn.nextInt(6) + 0;
				columnas = rn.nextInt(6) + 0;
			}
			tbackend[filas][columnas] = '웃';
			count++;
		}
		while (countDos < 9) {
			filas = rn.nextInt(6) + 0;
			columnas = rn.nextInt(6) + 0;

			while (tbackend[filas][columnas] != '■') {
				filas = rn.nextInt(6) + 0;
				columnas = rn.nextInt(6) + 0;
			}
			tbackend[filas][columnas] = '?';
			countDos++;
		}

		return tbackend;
	}

	/*
	 * Funcion con la cual recorremos la funcion "backend" Matriz array char del
	 * mismo tamano que el tablero para comparar posiciones.
	 */

	public static char[][] repasoBackend(char[][] backend) {
		int num = 0;
		int count = 0;
		System.out.println(" ");
		System.out.println("  0   1   2   3   4   5 ");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (num == 0) {
					System.out.print(num);
					num++;
				}
				System.out.print(" ");
				System.out.print(backend[i][j] + "  ");
				count++;
				if (count == 6) {
					System.out.println("\n");
					count = 0;
					if (num < 6) {
						System.out.print(num);
					}
					num++;
				}
			}
		}
		return backend;
	}

	/*
	 * Funcion para retornar un array de chars bidimensional el cual se llenara de
	 * simbolos cuadrados. Introduccion datos en el tablero:
	 */

	public static char[][] tablero(char[][] tabla) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				tabla[i][j] = '■';
			}
		}
		return tabla;
	}

	/*
	 * Funcion con la cual recorremos la funcion "tablero" Sirve para printar el
	 * tablero con las posiciones actualizadas a medida que se juega.
	 */

	public static char[][] repasoTablero(char[][] tabla) {
		int num = 0;
		int count = 0;
		System.out.println(" ");
		System.out.println("   0   1   2   3   4   5 ");
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (num == 0) {
					System.out.print(num + " ");
					num++;
				}
				System.out.print(" ");
				System.out.print(tabla[i][j] + "  ");

				count++;
				if (count == 6) {
					System.out.println("\n");
					count = 0;
					if (num < 6) {
						System.out.print(num + " ");
					}
					num++;
				}
			}
		}
		return tabla;
	}

	// INTRODUCCION AL JUEGO: "Una Pequena Historia :D"

	public static String intro(String introd) throws InterruptedException {

		System.out.println("Lerida...2021");
		Thread.sleep(2000);
		System.out.println(" ");
		System.out.println("▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n" + "▒█▀█▀█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒\r\n" + "▒█▀█▀█▒█▀▀█▒█▀█▒▄███▄▒\r\n"
				+ "▒█▀█▀█░█▀▀█▒█▀█░█▄█▄█░\r\n" + "░█▀█▀█░█▀▀█▒█▀█░█▄█▄█░\r\n" + "██████████████████████\n");
		Thread.sleep(2000);

		System.out.println("Todo estaba funcionando de manera normal en la ciudad, cuando de repente...");
		Thread.sleep(2000);
		System.out.println(" ");
		System.out.println("──────────────▄▀█▀█▀▄\r\n" + "─────────────▀▀▀▀▀▀▀▀▀ \r\n" + "─────────────▄─░░░░░▄\r\n"
				+ "───█──▄─▄───▐▌▌░░░░░▌▌\r\n" + "▌▄█▐▌▐█▐▐▌█▌█▌█░░░░░▌▌\r\n" + "");
		Thread.sleep(2000);
		System.out.println("Eso es un platillo volante?");
		Thread.sleep(2000);
		System.out.println(" ");
		System.out.println("▒▒▄▀▀▀▀▀▄▒▒▒▒▒▄▄▄▄▄▒▒▒\r\n" + "▒▐░▄░░░▄░▌▒▒▄█▄█▄█▄█▄▒\r\n" + "▒▐░▀▀░▀▀░▌▒▒▒▒▒░░░▒▒▒▒\r\n"
				+ "▒▒▀▄░═░▄▀▒▒▒▒▒▒░░░▒▒▒▒\r\n" + "▒▒▐░▀▄▀░▌▒▒▒▒▒▒░░░▒▒▒▒\n");
		Thread.sleep(2000);
		System.out.println("Me temia de esto... Una invasion alienigena!!!");
		Thread.sleep(2000);
		System.out.println("DEBEMOS BUSCAR EN ESTAS CAJAS PARA VER QUE PODEMOS ENCONTRAR UTIL!!!!!");
		Thread.sleep(4000);
		for (int i = 0; i < 50; i++) {
			System.out.println(" ");
		}
		return introd;
	}

	/*
	 * Funcion String que retorna una imagen creada con codigo ascii con el mismo
	 * funcionamiento que las funciones ascii de mas abajo. Recibe el string
	 * jugadorPerdido con el nombre de la persona que pierde la partida y lo retorna
	 * con el print ascii.
	 */

	public static String asciiFinal(String jugadorPerdido) {
		System.out.println(" ");
		System.out.println(" .                            *\r\n" + "                    _.-'~~~~'-._\r\n"
				+ "      .          .-~ \\__/  \\__/ ~-.         .\r\n" + "               .-~   (oo)  (oo)    ~-.\r\n"
				+ "              (_____//~~\\\\//~~\\\\______)\r\n" + "         _.-~`                         `~-._\r\n"
				+ "        /O=O=O=O=O=O=O=O=O=O=O=O=O=O=O=O=O=O\\\r\n"
				+ "        \\___________________________________/\r\n" + "                   \\x x x x x x x/\r\n"
				+ "                    \\x_x_x_x_x_x/\r\n" + "                     :|. | ' .\"\r\n"
				+ "                      | |. '. |:| Zzuzz!\r\n" + "                      | :  |:. ;|\r\n"
				+ "    \"Es lo que	      . | : .|  :\r\n" + "      tiene perder!   | . | : .||\r\n" + "    -!"
				+ jugadorPerdido + " : |. | . ::  Zzuzz!\r\n" + "        \\    ___     |.: |. :. |\r\n"
				+ "            /  _)    | :|___ |:|\r\n" + "           |  (~o   (\\.|(___)  /)\r\n"
				+ "           _\\/_/_    \\\\(_O O_)//   Zzuzz!\r\n" + "          /      \\   .\\(_\\O/_)/:\r\n"
				+ "         / /    \\ \\  :|\\/\\_/\\/ |\r\n" + "         \\ |    | /  | .(_ _): |\r\n"
				+ "          \\|____|/   .| /   \\ |:\r\n" + "           |_  _|    | /_____\\.| !!!EEEEKKKK!!!\r\n"
				+ "           | |  |    : .| | | .\r\n" + "           | |  |    .  | | | ||\r\n"
				+ "           |_|__|    | :|_|_| .:\r\n" + "   jro     [__[__)   .: <_|_> .|\r\n" + "");

		System.out.println(" ");
		return jugadorPerdido;
	}

	// FUNCION QUE RETORNA UNA IMAGEN 1

	public static String ascii(String imagen) {
		System.out.println(" ");
		System.out.println("█──██████────██████──█\r\n" + "█─██────██──██────██─█\r\n" + "─███─██─██████─██─███\r\n"
				+ "──██────██──██────██\r\n" + "───██████────██████\r\n" + "");
		System.out.println(" ");
		return imagen;
	}

	// FUNCION QUE RETORNA UNA IMAGEN 2

	public static String asciiDos(String imagen) {
		System.out.println(" ");
		System.out.println("─────█─▄▀█──█▀▄─█─────\r\n" + "────▐▌──────────▐▌────\r\n" + "────█▌▀▄──▄▄──▄▀▐█────\r\n"
				+ "───▐██──▀▀──▀▀──██▌───\r\n" + "──▄████▄──▐▌──▄████▄──\r\n" + "");
		System.out.println(" ");
		return imagen;
	}

	// FUNCION QUE RETORNA UNA IMAGEN 3 + Respuesta a la caja abierta.

	public static String asciiTres(String imagen) {

		System.out.println(" ");
		System.out.println("Has salvado unas cuantas personas!! Recibes +1 punto por ello!!");
		System.out.println(" ");
		System.out.println("────██──────▀▀▀██\r\n" + "──▄▀█▄▄▄─────▄▀█▄▄▄\r\n" + "▄▀──█▄▄──────█─█▄▄\r\n"
				+ "─▄▄▄▀──▀▄───▄▄▄▀──▀▄\r\n" + "─▀───────▀▀─▀───────▀▀\r\n" + "");
		System.out.println(" ");
		return imagen;

	}

	/*
	 * Funcion que retorna un String[] La he usado para juntar las imagenes con cada
	 * una de sus frases, le he anadido un num para poder rotar de frases a medida
	 * que avanza el juego con un contador.
	 */

	public static String[] respuestaPregunta(String[] todasLasPreguntas, int num) { // PREGUNTAS CON SUS IMAGENES

		String imagenFuncionUno = " ";// Imagen Ascii 1
		String imagenFuncionDos = " ";// Imagen Ascii 2
		String[] todasLasPreguntasFuncion = new String[9]; // Array de preguntas
		todasLasPreguntasFuncion = preguntasInterrogante(todasLasPreguntasFuncion);

		if (num == 0) {
			System.out.println(" ");
			System.out.println("Oh no!! Es un friki salvaje!!Seguro que te podra preguntas!!"); // Frases intro
			// 'Personaje'
			System.out.println("Friki: Te voy a vencer pringado!!");
			imagenFuncionUno = ascii(imagenFuncionUno); // Imagen Personaje y asi sucesivamente mas abajo.
			System.out.println(todasLasPreguntasFuncion[0]); // Siguiente pregunta y asi sucesivamente.
		} else if (num == 1) {
			System.out.println(" ");
			System.out.println("Es anonymous!! Sabe todo sobre nosotros!! Respondele sabiamente!!"); // Frases intro
			// 'Personaje2'
			System.out
			.println("Anonymous: Quien eres tu?? Programador novato!, aver si puedes contra mis preguntas!!!");
			imagenFuncionDos = asciiDos(imagenFuncionDos);
			System.out.println(todasLasPreguntasFuncion[1]);
		} else if (num % 2 == 0) {
			imagenFuncionUno = ascii(imagenFuncionUno);
			System.out.println(todasLasPreguntasFuncion[num]);
		} else if (num % 2 != 0) {
			imagenFuncionDos = asciiDos(imagenFuncionDos);
			System.out.println(todasLasPreguntasFuncion[num]);
		}
		return todasLasPreguntas;
	}

	/*
	 * Funcion que retorna un String[] el cual recorreremos para acceder a las demas
	 * respuestas,para almacenar las preguntas que se le haran a los jugadores con
	 * sus posibles respuestas. "Las respuestas son secretas, es necesario jugar al
	 * juego para desbloquear acceso a ellas".
	 */

	public static String[] preguntasInterrogante(String[] todasLasPreguntasDos) {

		String[] todasLasPreguntas = new String[9];

		todasLasPreguntas[0] = "Que es el bindi en la cultura 'Hindu'? " + "\n" + "1:Cruz  2:Punto  3:Coma";
		todasLasPreguntas[1] = "Cual de los siguientes es sinonimo de placeres: " + "\n" + "1:Tres 2:Delicias 3:Arroz";
		todasLasPreguntas[2] = "El Bosco pinto 'El Jardin de las...'" + "\n" + "1:Nubes  2:Delicias  3:Ninfas";
		todasLasPreguntas[3] = "La de Brandemburgo es muy famosa y esta en Berlin.:" + "\n"
				+ "1:Llave  2:Puerta  3:Pomo";
		todasLasPreguntas[4] = "Signo que se usa en matematicas: " + "\n" + "1:Puerta  2:Llave  3:Pomo";
		todasLasPreguntas[5] = "Es un tipo de yogur: " + "\n" + "1:Cubano  2:Griego  3:Rumano";
		todasLasPreguntas[6] = "Que es Steve Rogers de 'Los Vengadores'?" + "\n" + "1:Doctor  2:Capitan  3:Loco";
		todasLasPreguntas[7] = "A que palabra hay que cambiarle una letra para convertirla en 'chico' en Ingles?" + "\n"
				+ "1:Arrow 2:Voy 3:Mil ";
		todasLasPreguntas[8] = "Que palabra de las siguientes significa 'fresa' en ingles: " + "\n"
				+ "1:Cranberry 2:Strawberry 3:Rasperry   ";

		return todasLasPreguntas;
	}

	/*
	 * Funcion int: Pedir datos "columnas" y "filas" pasandole 2 strings y
	 * returnando el numero introducido.
	 */

	public static int datosFuncion(String palabra, String jugador) {
		int num = 0;
		System.out.println(" ");
		System.out.println("Eleccion de " + jugador);
		System.out.println("Introduce la " + palabra + " que deseas elegir.");
		num = sc.nextInt();

		while (num > 5 || num < 0) {
			System.out.println("ERROR [Has rebasado el limite de " + palabra + "]!!");
			System.out.println("Vuelve a introducir la " + palabra + " que deseas elegir: \" ");
			num = sc.nextInt();
		}

		return num;

	}

	/*
	 * Funcion de String finalPartida que pasa las puntuaciones de los 2 jugadores y
	 * sus nombres para printar la pantalla final Con la funcion para el codigo
	 * asciiFinal invocada para poner el nombre del perdedor.
	 */

	public static String finalPartida(int contadorUno, int contadorDos, String jugadorUno, String jugadorDos) {
		String partidaFinal = " ";

		System.out.println("Alien: Se os han acabado las cajas!!");
		System.out.println(
				"Alien: El que haya perdido se va con nosotros hacia el planeta Javalien de la galaxia 0.14!! MUAHAHAHHAHA");
		System.out.println("Vamos a contar los puntos!!");

		if (contadorUno > contadorDos) {
			System.out.println(jugadorUno + " es el ganador!!");
			System.out.println("Con una puntuacion de " + contadorUno + " a " + contadorDos);
			System.out.println(" ");
			partidaFinal = jugadorDos;
			partidaFinal = asciiFinal(jugadorDos);
		}

		else if (contadorDos > contadorUno) {
			System.out.println(jugadorDos + " es el ganador!!");
			System.out.println("Con una puntuacion de " + contadorDos + " a " + contadorUno);
			System.out.println(" ");
			partidaFinal = jugadorUno;
			partidaFinal = asciiFinal(jugadorUno);
		}

		return partidaFinal;
	}
}