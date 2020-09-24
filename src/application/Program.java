package application;

import java.util.Date;
import java.util.Random;

import helper.Utils;

public class Program {

	public static void main(String[] args) {

		Random gerador = new Random();

		Date data = new Date();
		// System.out.println(data);
		System.out.println(Utils.dateParaString(data));

		Double preco = 10000 * gerador.nextDouble();
		// System.out.println(preco);
		System.out.println(Utils.doubleParaString(preco));

	}

}
