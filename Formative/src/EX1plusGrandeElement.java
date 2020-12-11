
/*
* Author : Victor
* Date : Nov 26, 2020
* Description : 
*/
public class EX1plusGrandeElement {
	
	public static void main(String[] args) 
	{
		int []myTab= {90,67,89,45,100,90,1,2,3,1000,6,12,2001,23};
		System.out.println("L'element le plus grand est a la position " + plusGrandIndex(myTab));
		
		/* Methodes suivants pour afficher les resultats
		if(isPresent(myTab,6))
			System.out.println("Present");
		else
			System.out.println("Not Present");
		
		int []b=croissant2(myTab);
		System.out.println(b[10]);
		
		*/
		
	}
	
	// Methode pour afficher le plus grand
	static int plusGrandNum(int []Tab)
	{ 
		int max=0; // variable qui servira pour la valeur maximale
		for (int i = 0; i < Tab.length; i++) 
		{
			if(Tab[i]>max)
				max=Tab[i];
		}
		return max;
	}
	
	
		// methode pour afficher le plus petit nombre
		static int plusPetitNum(int []Tab)

		{
			int min=234567650; // variable qui servira pour la valeur min
			for (int i = 0; i < Tab.length; i++) 
			{
				if(Tab[i]<min)
					min=Tab[i];
			}
			return min;
		}
		// methode pour afficher l'index du plus grand nombre
				static int plusGrandIndex(int []Tab)
				{
					int max=0; // variable qui servira pour la valeur maximale
					int pos=0; // variable pour la position du plus grand nombre
					for(int i=0;i<Tab.length;i++)
					{
						if(Tab[i]>max)
						{
							max=Tab[i];
							pos=i;
						}
					}
					return pos;
				}
		// methode pour afficher l'index du plus petite nombre
		static int plusPetitIndex(int []Tab)
		{
			int pos = 0; // variable qui indique la position du plus petit nombre
			int min=234567650; // variable qui servira pour la valeur min
			for (int i = 0; i < Tab.length; i++) 
			{
				if(Tab[i]<min)
					min=Tab[i];
					pos=i;
			}
			return pos;
		}
		// methode pour afficher le nombre d'elements d'un tableau 
		//d'entiers dont la valeur est inferieure a 10
		static int plusPetitDix(int []a)
		{
			int cpt=0; // compteur pour les valeurs < 10
			
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]<10)
					cpt++;	
			}
			return cpt;
			
		}
		// methode permettant de dire si un element quelconque est present 
		// ou non dans un tableau d'entiers
		static boolean isPresent(int []a, int x)
		{
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]==x)
					return true;
			}
			return false;
		}
		// methode permettant de ranger en ordre croissant les elements 
		// d'un tableau
		static int [] croissant (int []a)

		{
			for (int i = 0; i < a.length; i++) 
			{
				int temp;
				for (int j = 0; j < a.length; j++) 
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
					
				}
				
			}
			return a;
		}
		// Un autre facon de fair croissant
		static int [] croissant2 (int []a)
		{
			int temp=0;
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					i=-1; // Pour recommencer le comptage
				}
				
			}
			return a;
		}
		// Un methode qui classe les nombres decroissants
		static int [] decroissant (int []a)
		{
			for (int i = 0; i < a.length; i++) 
			{
				int temp;
				for (int j = 0; j < a.length; j++) 
				{
					if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
					
				}
				
			}
			return a;
		}	
		// Un methode qui classe les nombres decroissants
		static double moyenneNotes (int []a)
		{
			int somme=0;
			for (int i = 0; i < a.length; i++) 
				{
					somme+=a[i]; // somme = somme+a [i];
				}
				return somme/a.length;
				
			}
		}


		
	
	
