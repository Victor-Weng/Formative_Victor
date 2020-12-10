/*
* Author : Victor
* Date : Dec 10, 2020
* Description : Méthode permettant de calculer et 
* d’afficher la somme des éléments d’un tableau d’entiers.
*/
public class Formative_Victor1 
{

	public static void main(String[] args) 
	{
		
		int []myTab= {90,67,89,45,100,90,1,2,3,1000,6}; // Les  valeurs du tableau
		System.out.println("La somme des éléments est egale à " + sommeEntier(myTab)); // Imprimer la somme
	}

	static int sommeEntier(int []Tab) // Methode qui sert a calculer la somme
	{ 
		int somme=0; // Variable qui servira pour la somme totale
		for (int i = 0; i < Tab.length; i++) // Loop
		{
			somme= somme+Tab[i]; // La somme s'ajoute a l'element du tableau
		}
		return somme; // Return la somme
	}
}
