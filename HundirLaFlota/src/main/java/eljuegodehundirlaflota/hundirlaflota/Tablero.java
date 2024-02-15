package eljuegodehundirlaflota.hundirlaflota;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ismael_Ast
 */
public class Tablero {
    private char[][] tablero;
    private Barco[] barco;
    int colocado;
    
    public Tablero(int fila, int columna, Barco[] barcos){
        this.fila = fila;
        this.columna = columna;
        this.Tablero = new char[fila][columna];
        this.barco = barco;
        this.random = new Random();
    }
    
    public void inicializarTablero(){
        for (int i = 0; i < fila; i++){
            for (int j = 0; j < columna; j++){
                System.out.println(Tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
        public void imprimirTablero() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void colocarBarcos(Barco barco, int fila, int columna){
        for (Barco barco : barcos){
            boolean colocado = false;
            while (!colocado){
                int fila = random.nextInt(fila);
                int columna = random.nextInt(columna);
            }
        }
    }
    
    public boolean puedeColocarBarco(Barco barco, int fila, int columna){
        if ( fila + barco.longitud <= filas){
            for (int i = 0; i < barco.longitud; i++){
                if (tablero [fila + i][columna] != '-'){
                    return false;
                }
            }
            return true;
        }
    }
    
     public void colocarBarcoEnTablero(Barco barco, int fila, int columna) {
        for (int i = 0; i < barco.longitud; i++) {
            tablero[fila + i][columna] = 'Barco';
        }
    }

    public void jugar() {
        Scanner sc = new Scanner(System.in);
        int barcosHundidos = 0;

        while (barcosHundidos < barco.length) {
            System.out.println("Escriba la fila y a columna que quieres disparar (separadas por un espacio):");
            int fila = sc.nextInt();
            int columna = sc.nextInt();

            if (fila < 0 || fila >= fila || columna < 0 || columna >= columna) {
                System.out.println("Coordenadas inválidas. Prueba otra vez.");
                continue;
            }

            if (tablero[fila][columna] == 'X' || tablero[fila][columna] == '*') {
                System.out.println("Ya has disparado en esta posición. Prueba otra vez.");
                continue;
            }

            if (tablero[fila][columna] == 'B') {
                System.out.println("¡Has golpeado un barco!");
                for (Barco barco : barco) {
                    if (fila < fila - barco.longitud + 1 && tablero[fila + barco.longitud - 1][columna] == 'B') {
                        barco.hundirParte(fila + barco.longitud - 1 - columna);
                        if (barco.haSidoHundido()) {
                            System.out.println("¡Has hundido el barco " + barco.nombre + "!");
                            barcosHundidos++;
                        }
                    }
                }
                tablero[fila][columna] = 'X'; // Marcar como golpeado
            } else {
                System.out.println("¡Agua!");
                tablero[fila][columna] = '*'; // Marcar como disparo fallido
            }

            imprimirTablero();
        }

        System.out.println("¡ENHORABUENA, has hundido todos los barcos!");
}
