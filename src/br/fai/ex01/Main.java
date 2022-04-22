package br.fai.ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start() {

		String candidato1 = " 1. João ";
		String candidato2 = " 2. Maria";
		String candidato3 = " 3. Jose";
		String candidato4 = " 4. Antonio";
		String candidato5 = " 5. Tiburssinho";

		ArrayList<String> candidatos = new ArrayList<>();

		candidatos.add(candidato1);
		candidatos.add(candidato2);
		candidatos.add(candidato3);
		candidatos.add(candidato4);
		candidatos.add(candidato5);

		System.out.println("Os candidatos disponíveis são : " + candidatos);
		System.out.println("Digite seu voto: ");
		Scanner in = new Scanner(System.in);
		System.out.print(in.nextLine());

	}

}