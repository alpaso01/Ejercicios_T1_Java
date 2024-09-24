package com.dam.alex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formattable;
import java.util.Random;
import java.util.Scanner;

public class Main extends Vehiculo{
    public Main(String tipo, String marca, String modelo) {
        super(tipo, marca, modelo);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     System.out.println("A QUE ACTIVIDAD QUIERES ACCEDER?");
     int elegir = teclado.nextInt();
    teclado.nextLine();
     switch (elegir) {
         case 1:
             int num1 = 5;
             int num2 = 5;
             int resultado = 0;

             System.out.println(num1 + " + " + num2 + " = " + resultado);

             break;

         case 2:
             System.out.println("Introduce un nombre");
             String nombre = teclado.nextLine();

             System.out.println("Buenos dias " + nombre);

             break;

         case 3:
             int resultado1 = 0;
             System.out.println("INTRODUCE TU PRIMER NUMERO");
             int numero1 = teclado.nextInt();

             System.out.println("INTRODUCE TU SEGUNDO NUMERO");
             int numero2 = teclado.nextInt();

             System.out.println(numero1 + " + " + numero2 + " = " + resultado1);

             break;
         case 4:
             System.out.println("Introduce tu primer numero");
             int primerNum = teclado.nextInt();

             System.out.println("Introduce tu segundo numero");
             int segundoNum = teclado.nextInt();

             if (primerNum > segundoNum) {
                 System.out.println("Numero mayor : " + primerNum);
                 System.out.println("Numero menor : " + segundoNum);
             } else if (segundoNum > primerNum) {
                 System.out.println("Numero mayor : " + segundoNum);
                 System.out.println("Numero menor : " + primerNum);
             } else if (primerNum == segundoNum) {
                 System.out.println(primerNum + " y " + segundoNum + " son iguales");
             }
             break;
         case 5:

             while (true) {
                 System.out.println("introduce el primer numero");
                 int numerouno = teclado.nextInt();

                 System.out.println("introduce el segundo numero");
                 int numerodos = teclado.nextInt();

                 if (numerouno == numerodos) {
                     System.out.println("los numeros son iguales, fin de programa");
                     break;
                 } else {
                     System.out.println("los numeros son diferentes, vuelve a intentarlo");
                 }
             }

         case 6:
             int resultado6 = 0;
             for (int i = 0; i < 5; i++) {
                 System.out.println("introduce un numero");
                 int numerorepe = teclado.nextInt();

                 resultado6 = resultado6 + numerorepe;
             }

             System.out.println("EL RESULTADO DE LA SUMA DE LOS NUMEROS INTRODUCIDOS ES:  " + resultado6);

             break;

         case 7:
             int contador = 0;
             int numeroelegido;
             int suma = 0;
             while (contador < 5) {
                 System.out.println("introduce un numero");
                 numeroelegido = teclado.nextInt();
                 suma += numeroelegido;
                 contador++;
             }
             System.out.println("La suma de los cinco numero es de : " + suma);


         case 8:
             System.out.println("introduce un numero del 1-12");
             int numero8 = teclado.nextInt();

             if (numero8 > 0 && numero8 < 13) {

                 switch (numero8) {
                     case 1:
                         System.out.println("ENERO");
                         break;
                     case 2:
                         System.out.println("FEBRERO");
                         break;
                     case 3:
                         System.out.println("MARZO");
                         break;
                     case 4:
                         System.out.println("ABRIL");
                         break;
                     case 5:
                         System.out.println("MAYO");
                         break;
                     case 6:
                         System.out.println("JUNIO");
                         break;
                     case 7:
                         System.out.println("JULIO");
                         break;
                     case 8:
                         System.out.println("AGOSTO");
                         break;
                     case 9:
                         System.out.println("SEPTIEMBRE");
                         break;
                     case 10:
                         System.out.println("OCTUBRE");
                         break;
                     case 11:
                         System.out.println("NOVIEMBRE");
                         break;
                     case 12:
                         System.out.println("DICIEMBRE");
                         break;
                 }

             } else {
                 System.out.println("los numeros son mas pequeños de 1 o mas grandes de 12");
             }

         case 9:
             System.out.println("introduce un numero del 1-12");
             int numero10 = teclado.nextInt();

             if (numero10 == 1) {
                 System.out.println("ENERO");
             } else if (numero10 == 2) {
                 System.out.println("FEBRERO");
             } else if (numero10 == 3) {
                 System.out.println("MARZO");
             } else if (numero10 == 4) {
                 System.out.println("ABRIL");
             } else if (numero10 == 5) {
                 System.out.println("MAYO");
             } else if (numero10 == 6) {
                 System.out.println("JUNIO");
             } else if (numero10 == 7) {
                 System.out.println("JULIO");
             } else if (numero10 == 8) {
                 System.out.println("AGOSTO");
             } else if (numero10 == 9) {
                 System.out.println("SEPTIEMBRE");
             } else if (numero10 == 10) {
                 System.out.println("OCTUBRE");
             } else if (numero10 == 11) {
                 System.out.println("NOVIEMBRE");
             } else if (numero10 == 12) {
                 System.out.println("DICIEMBRE");
             }

             break;
         case 10:
             System.out.println("introduce un numero del 1-12");
             int numero9 = teclado.nextInt();

             if (numero9 > 0 && numero9 < 13) {

                 if (numero9 == 1) {
                     System.out.println("ENERO");
                 } else if (numero9 == 2) {
                     System.out.println("FEBRERO");
                 } else if (numero9 == 3) {
                     System.out.println("MARZO");
                 } else if (numero9 == 4) {
                     System.out.println("ABRIL");
                 } else if (numero9 == 5) {
                     System.out.println("MAYO");
                 } else if (numero9 == 6) {
                     System.out.println("JUNIO");
                 } else if (numero9 == 7) {
                     System.out.println("JULIO");
                 } else if (numero9 == 8) {
                     System.out.println("AGOSTO");
                 } else if (numero9 == 9) {
                     System.out.println("SEPTIEMBRE");
                 } else if (numero9 == 10) {
                     System.out.println("OCTUBRE");
                 } else if (numero9 == 11) {
                     System.out.println("NOVIEMBRE");
                 } else if (numero9 == 12) {
                     System.out.println("DICIEMBRE");
                 }

             } else {
                 System.out.println("los numeros son mas pequeños de 1 o mas grandes de 12");
             }
             break;
         case 11:

             System.out.print("Introduce el número del DNI (sin letra): ");
             int dni = teclado.nextInt();
             String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
             int indice = dni % 23;
             char letra = ' ';

             switch (indice) {
                 case 0:
                     letra = 'T';
                     break;
                 case 1:
                     letra = 'R';
                     break;
                 case 2:
                     letra = 'W';
                     break;
                 case 3:
                     letra = 'A';
                     break;
                 case 4:
                     letra = 'G';
                     break;
                 case 5:
                     letra = 'M';
                     break;
                 case 6:
                     letra = 'Y';
                     break;
                 case 7:
                     letra = 'F';
                     break;
                 case 8:
                     letra = 'P';
                     break;
                 case 9:
                     letra = 'D';
                     break;
                 case 10:
                     letra = 'X';
                     break;
                 case 11:
                     letra = 'B';
                     break;
                 case 12:
                     letra = 'N';
                     break;
                 case 13:
                     letra = 'J';
                     break;
                 case 14:
                     letra = 'Z';
                     break;
                 case 15:
                     letra = 'S';
                     break;
                 case 16:
                     letra = 'Q';
                     break;
                 case 17:
                     letra = 'V';
                     break;
                 case 18:
                     letra = 'H';
                     break;
                 case 19:
                     letra = 'L';
                     break;
                 case 20:
                     letra = 'C';
                     break;
                 case 21:
                     letra = 'K';
                     break;
                 case 22:
                     letra = 'E';
                     break;
             }

             System.out.println("El DNI completo es: " + dni + letra);
             break;

         case 12:
             //guardar 10 numeros i recorrerlos en un for

             Array notas[] = new Array[10];

             int nota = 0;
             for (int i = 0; i < notas.length; i++) {
                 System.out.println("INTRODUCE TU NOTA DEL 0 AL 1O");
                 nota = teclado.nextInt();
             }


             if (nota < 11) {

                 switch (nota) {
                     case 0:
                         System.out.println("SUSPENDIDO");
                         break;
                     case 1:
                         System.out.println("SUSPENDIDO");
                         break;
                     case 2:
                         System.out.println("SUSPENDIDO");
                         break;
                     case 3:
                         System.out.println("SUSPENDIDO");
                         break;
                     case 4:
                         System.out.println("SUSPENDIDO");
                         break;
                     case 5:
                         System.out.println("APROBADO");
                         break;
                     case 6:
                         System.out.println("APROBADO");
                         break;
                     case 7:
                         System.out.println("NOTABLE");
                         break;
                     case 8:
                         System.out.println("NOTABLE");
                         break;
                     case 9:
                         System.out.println("SOBRESALIENTE");
                         break;
                     case 10:
                         System.out.println("MATRICULA");
                         break;

                 }

             } else {
                 System.out.println("LA NOTA NO EXISTE PORQUE ES DEL 0 AL 10");
             }
             break;

         case 13:
             double fahrenheit;
             System.out.println("introduce el numero de centigrados");
             double centigrados = teclado.nextDouble();

             fahrenheit = (centigrados * 9 / 5) + 32;

             System.out.println("LOS CENTIGRADOS EN FAHRENHEIT ES: " + fahrenheit);
             break;

         case 14:
             System.out.println("Introduce la medida del radio de la circunferencia");
             double numeroRadio = teclado.nextDouble();

             double diametro = 2 * numeroRadio;

             double area = Math.PI * Math.pow(numeroRadio, 2);

             System.out.println("DIAMETRO : " + diametro);
             System.out.println("Area : " + area);


             break;

         case 15:
             System.out.println("Introduce la medida del radio de la circunferencia");
             double numeroRadio1 = teclado.nextDouble();

             double diametro1 = 2 * numeroRadio1;

             double area1 = Math.PI * Math.pow(numeroRadio1, 2);

             System.out.println("DIAMETRO : " + diametro1);
             System.out.println("Area : " + area1);

            double volumen = (4.0 / 3.0) * Math.PI * Math.pow(numeroRadio1, 3);
            System.out.println("VOLUMEN . "+volumen);

             break;

         case 16:
System.out.println("Introduce el año en que naciste");
int anyo = teclado.nextInt();

System.out.println("Introduce el mes que naciste");
int mes = teclado.nextInt();

System.out.println("Introduce el dia que naciste");
int dia = teclado.nextInt();

int resultadoCumple = 0;
resultadoCumple = dia + mes;

System.out.println("Tu numero de la suerte es : "+resultadoCumple);
             break;

         case 17:
             System.out.println("Introduce tu contraseña, recuerda que debe tener como mínimo");
             System.out.println("5 caracteres, 1 número y 1 letra mayúscula");
             String contra = teclado.nextLine();
             boolean numero = false;
             boolean mayuscula = false;

             if (contra.length() >= 5) {
                 for (char c : contra.toCharArray()) {
                     if (Character.isDigit(c)) {
                         numero = true;
                     }
                     if (Character.isUpperCase(c)) {
                         mayuscula = true;
                     }
                 }

                 if (numero && mayuscula) {
                     System.out.println("La contraseña es correcta !!!!.");
                 } else {
                     if (!numero) {
                         System.out.println("Tu contraseña no tiene números.");
                     }
                     if (!mayuscula) {
                         System.out.println("Tu contraseña no tiene mayúsculas.");
                     }
                 }
             } else {
                 System.out.println("Error: La contraseña debe tener al menos 5 caracteres.");
             }
             break;

         case 18:
             System.out.println("Introduce tu contraseña, recuerda que debe tener como mínimo");
             System.out.println("5 caracteres, 1 número y 1 letra mayúscula");
             String contra2 = teclado.nextLine();
             boolean numero22 = false;
             boolean mayuscula2 = false;

             if (contra2.length() >= 5) {
                 for (char c : contra2.toCharArray()) {
                     if (Character.isDigit(c)) {
                         numero = true;
                     }
                     if (Character.isUpperCase(c)) {
                         mayuscula = true;
                     }
                 }

                 if (numero22 && mayuscula2) {
                     System.out.println("La contraseña es correcta !!!!.");
                 } else {
                     if (!numero22) {
                         System.out.println("Tu contraseña no tiene números.");
                     }
                     if (!mayuscula2) {
                         System.out.println("Tu contraseña no tiene mayúsculas.");
                     }
                 }
             } else {
                 System.out.println("Error: La contraseña debe tener al menos 5 caracteres.");
             }

             System.out.println("Repite la contraseña");
             String contra3 = teclado.nextLine();

             if (contra3.equals(contra2)){
                 System.out.println("Las 2 contraseñas son iguales");
             }else {
                 System.out.println("Las contraseñas no son iguales ! ");
             }
             break;

         case 19:

for (int i = 0; i <128 ; i++){
    System.out.println("Codigo : "+i + " Caracter:"+(char) i );
}

             break;

         case 20:
             for (int i = 0; i< 256; i++){
                 System.out.println("Codigo : "+i+" Caracter : "+(char) i );
             }
             break;

         case 21:

             System.out.println("Introduce el nombre de la persona");
             String nombrePersona = teclado.nextLine();

             ArrayList<String> listaPersonas = new ArrayList<>();

             for (int i = 0; i < 5; i++){
                 listaPersonas.add(nombrePersona);
             }


             break;
         case 22:


             ArrayList<String> listaPersonas2 = new ArrayList<>();
             while (true){
                 System.out.println("Introduce el nombre de la persona");
                 String nombrePersona2 = teclado.nextLine();


                 if (nombrePersona2.equals("0")){
                     break;
                 }
                 listaPersonas2.add(nombrePersona2);
             }
             break;

         case 23:

             ArrayList<String> listaPersonas3 = new ArrayList<>();
             while (true){
                 System.out.println("Introduce el nombre de la persona");
                 String nombrePersona3 = teclado.nextLine();


                 if (nombrePersona3.equals("0")){
                     break;
                 }
                 listaPersonas3.add(nombrePersona3);
             }
             int contador2 = 0;

for (String n : listaPersonas3){
contador2++;
    System.out.println("Linea"+contador2);
    System.out.println("Nombre :"+n);
}

             break;

         case 24:
             System.out.println("Introduce un numero del 1 al 10");
             int numeroIntroducido = teclado.nextInt();
             Random random = new Random();
             int numeroAleatorio = 0;
for (int i = 0; i < 1; i++){
    numeroAleatorio = random.nextInt(10);
    System.out.println("Numero Aleatorio: " + numeroAleatorio);
}
if (numeroIntroducido == numeroAleatorio){
    System.out.println("PREMIO!!! LOS DOS NUMEROS SON IGUALES "+numeroIntroducido + "y "+numeroAleatorio);
   System.out.println("---------------------------------------------------------------------------------");
   System.out.println("Elige tu premio");
   System.out.println("1 - 200€ // 2- Patín electrico // 3- Portatil Asus");
   int elegirPremio = teclado.nextInt();

   if (elegirPremio == 1){
       System.out.println("Felicidades 200€ es tu premio!!!");
   } else if (elegirPremio == 2) {
       System.out.println("Felicidades el patín electrico es tu premio!!!");
   } else if (elegirPremio == 3) {
       System.out.println("Felicidades el Portatil Asus es tu premio!!!");
   }

}else {
    System.out.println("Otra vez serà");
}
             break;
         case  25:
             Random random1 = new Random();


System.out.println("Introduce 3 numeros del 1 al 10");
int numIntroducido1 = teclado.nextInt();
int numIntroducido2 = teclado.nextInt();
int numIntroducido3 = teclado.nextInt();


int numAleatorio1 = random1.nextInt(10);
int numAleatorio2 = random1.nextInt(10);
int numAleatorio3 = random1.nextInt(10);

System.out.println("NUMEROS ALEATORIOS : "+numAleatorio1 + ","+numAleatorio2+","+numAleatorio3);

if (numIntroducido1 == numAleatorio1 ||numIntroducido1 == numAleatorio2 || numIntroducido1 == numAleatorio3 ||numIntroducido2 == numAleatorio1 ||numIntroducido2 == numAleatorio2 || numIntroducido2 == numAleatorio3 || numIntroducido3 == numAleatorio1 ||numIntroducido3 == numAleatorio2 || numIntroducido3 == numAleatorio3){

    System.out.println("FELICIDADES , ALGUNO DE TUS NUMEROS COINCIDE TIENES PREMIO !!!!");

    System.out.println("1 - 200€ // 2- Patín electrico // 3- Portatil Asus");
    int elegirPremio = teclado.nextInt();

    if (elegirPremio == 1){
        System.out.println("Felicidades 200€ es tu premio!!!");
    } else if (elegirPremio == 2) {
        System.out.println("Felicidades el patín electrico es tu premio!!!");
    } else if (elegirPremio == 3) {
        System.out.println("Felicidades el Portatil Asus es tu premio!!!");
    }

}else {
    System.out.println("NINGUNO DE TUS NUMEROS COINCIDE, LO SIENTO");
}

             break;

         case 26:
int[] notas1 = new int[10];
for (int i = 0; i < notas1.length; i++){
    System.out.println("Introduce tu nota del  al 10");
    notas1[i] = teclado.nextInt();

}
for (int nota1 : notas1){
    determinarNotas(nota1);
}
             break;
         case 27:
             System.out.println("Introduce tu DNI sin la letra");
             int dni1 = teclado.nextInt();


             System.out.println("TU DNI COMPLETO ES: "+dni1+""+CalcularDNI(dni1));
             break;

         case 28:
Vehiculo vehiculo1 = new Vehiculo("coche", "volskwagen", "scirocco");
Vehiculo vehiculo2 = new Vehiculo("moto", "Suzuki", "gsx-s");
Vehiculo vehiculo3 = new Vehiculo("coche", "seat", "cordoba");
Vehiculo vehiculo4 = new Vehiculo("coche", "peugeot", "307");
Vehiculo vehiculo5 = new Vehiculo("camion", "Mercedes", "Racing");

vehiculo1.mostrarInfo();
vehiculo2.mostrarInfo();
vehiculo3.mostrarInfo();
vehiculo4.mostrarInfo();
vehiculo5.mostrarInfo();
             break;

         case 29:
             ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

             listaVehiculos.add(new Vehiculo("coche", "volskwagen", "scirocco"));
             listaVehiculos.add(new Vehiculo("moto", "Suzuki", "gsx-s"));
             listaVehiculos.add(new Vehiculo("coche", "seat", "cordoba"));
             listaVehiculos.add(new Vehiculo("coche", "peugeot", "307"));
             listaVehiculos.add(new Vehiculo("camion", "Mercedes", "Racing"));

             for (Vehiculo vehiculo : listaVehiculos){
                 vehiculo.mostrarInfo();
             }
             break;

         case 30:
             System.out.println("Primero vamos al directorio donde se encuentra el archivo del proyecto java, luego con el comando javac lo ejecutamos" +
                     "luego usamos el comando jar para crear un archivo.jar y ejecutarlo en la terminal");
             break;











     }

    }


    public static void determinarNotas(int nota){
if (nota >= 0 && nota <= 10){
    switch (nota){
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("SUSPENDIDO");
            break;
        case 5:
        case 6:
            System.out.println("APROBADO");
            break;

        case 7:
        case 8:
            System.out.println("NOTABLE");
            break;

        case 9:
            System.out.println("SOBRESALIENTE");
            break;
        case 10:
            System.out.println("MATRICULA");
            break;
    }
} else {
    System.out.println("La nota no existe porque es del 0 al 10");
}
    }




    public static char CalcularDNI (int dni2){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = dni2 % 23;
        char letra = ' ';

        switch (indice) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
        }
        return letra;
    }
}