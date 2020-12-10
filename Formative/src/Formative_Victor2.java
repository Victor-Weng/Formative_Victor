import java.util.Scanner;
/*
* Author : Victor
* Date : Dec 10, 2020
* Description : Une méthode qui permet de verifier la presence d'une nombre
* donner par l'utilisateur dans un tableau.
*/
public class Formative_Victor2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		int input=0;
		System.out.println("C'est quoi votre nombre?"); // Demande pour une nombre
		input=sc.nextInt();
		int []myTab= {90,67,89,45,100,90,1,2,3,1000,6}; // Les  valeurs du tableau
		if(verifiePresence(myTab,input)) // Si return = true
			System.out.println("Present");
		else // Si return = false
			System.out.println("Not Present");
		sc.close();
	}

	static boolean verifiePresence(int []a, int input) // Methode qui verifie la presence du nombre
	{
		for (int i = 0; i < a.length; i++) // On verifie tous les valeurs
		{
			if(a[i]==input) // Si le nombre donner par l'usilateur egale la nombre du tableau
				return true;
		}
		return false;
	}
	
}