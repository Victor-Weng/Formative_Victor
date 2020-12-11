/*
* Author : Victor
* Date : Dec 10, 2020
* Description : Une méthode qui recoit une tableau et puis l'affiche sans la nombre 
* le plus grande et sans une espace vide
*/
public class Formative_Victor3 
{

	public static void main(String[] args) 
	{
		
		int []s= {12,45,200,1000,33,3,4,5,6}; // Tableau
		int M=EX1plusGrandeElement.plusGrandIndex(s); // Variable 'M' est assigne la position du plus grande variable
		
		System.out.print("{"); 
		for (int j = 0; j < s.length; j++) // Loop pour verifier si position 'M' est egale a la position dans le tableau
		{
				if(M!=j) // Si 'M' n'est pas egale a la position
					System.out.print(s[j]+",");	// Imprime le nombre
		}
		if(s[s.length-1]!=M) // Apres tous les nombres sont imprimer, on ajoute la nombre en dernier pour n'y avoir pas une vide
		{
			System.out.print(s[s.length-1]); 
		}
		System.out.print("}");
	}
}
