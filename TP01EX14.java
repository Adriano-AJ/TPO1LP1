/*
14.Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados. 
*/

import java.util.Scanner;

public class TP01EX14
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da aresta do cubo:");
		double a = sc.nextDouble();
		System.out.println("Digite o valor do raio da esfera:");
		double r = sc.nextDouble();
		
		
		double volumeEsfera = (4*Math.PI*Math.pow(r, 3))/3;
		double volumeCubo = Math.pow(a, 3);
		
		double volumeLivre = volumeCubo - volumeEsfera;
	
	    System.out.printf("Volume livre: %.2f", volumeLivre);
	}
}
