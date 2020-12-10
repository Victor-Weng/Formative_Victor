import java.util.Arrays;

/*
* Author : Victor
* Date : Dec 10, 2020
* Description : Une méthode qui reçoit en paramètre un tableau d’entiers et qui retourne le
même tableau amputé du plus grand nombre de cet élément. Utiliser la méthode
plusGrandIndex de la classe MethodesTableaux pour trouver l’index du nombre le plus
grand dans un tableau d’entiers. Afficher le tableau ainsi modifié.
*/
public class Formative_Victor3 
{

	public static void main(String[] args) 
	{
		
		int []s= {12,45,33,11};
		EX1plusGrandeElement.plusGrandIndex(s);
		for (int i = 0; i < s.length; i++) {
			if(s[i]!=12)
				System.out.println(s[i]);
			System.out.println(Arrays.toString(s));
		}
		
	}

}
