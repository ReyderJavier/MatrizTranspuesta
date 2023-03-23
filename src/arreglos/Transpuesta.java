/***************************************
 * Autor: Tineo Tineo Reyder Javier    *                 
 * Fecha Creación: 22/03/23            *                 
 * Fecha Actualización: 22/03/23       *                 
 * Descripción: Matriz transpuesta     *
 *                                     *
 **************************************/
package arreglos;

import java.util.Scanner;

public class Transpuesta {

	    
		 public static void main(String[] args) {
			 try (Scanner intputEntrada = new Scanner( System.in)) {
				//Se crea la matriz de filas y columnas
				 int f, c; 			
				 System.out.print("Intruduce el número de filas: ");
				 f= intputEntrada.nextInt();
				
				 System.out.print("Intruduce el número de Columnas: ");
				 c= intputEntrada.nextInt();
				int[][] M = new int[f][c];  

				//Se lee los datoss 
				leerDatos(M);

				//Se muestra la matriz original
				System.out.println("Matriz original");
				mostrarMatriz(M);

				//Se calcula la matriz transpuesta
				int [][] T = matrizTranspuesta(M);

				// Se muestra la matriz transpuesta
				System.out.println("Matriz transpuesta");
				mostrarMatriz(T);
			}

	    }

	
		 
	    //Introduce los números de la matriz
	    public static void leerDatos(int[][] M) {
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Introduce los números en la matriz:");
				for (int i = 0; i < M.length; i++) {
				    for (int j = 0; j < M[i].length; j++) {
				        System.out.print("Matrriz[" + i + "][" + j + "]=");
				        M[i][j] = sc.nextInt();
				    }
				}
			}
	    }

	    //Desarrollo de la matriz transpuesta
	    public static int[][] matrizTranspuesta(int[][] a) {
	        //Su función de la matriz transpuesta                             
	        int[][] t = new int[a[0].length][a.length];
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                t[j][i] = a[i][j];
	            }
	        }
	        return t;
	    }

	    //Se muestra la matriz en pantalla 
	    public static void mostrarMatriz(int[][] A) {
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A[i].length; j++) {
	                System.out.printf("%5d", A[i][j]);
	            }
	            System.out.println();
	        }
	    }

	
			
		}
		
		
	
				

  


