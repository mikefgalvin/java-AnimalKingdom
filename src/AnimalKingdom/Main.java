package AnimalKingdom;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{

	private static List<Animals> filterAnimals(List<Animals> theList, CheckAnimals tester)
	{
		List<Animals> templist = new ArrayList<>();

		for (Animals v : theList)
		{
			if (tester.test(v))
			{
				templist.add(v);
			}
		}

		return templist;
	}


	public static void main (String[] args)
	{
		System.out.println("Module 2 Project!");


		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2021);

		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);



		System.out.println(panda.getName() + " " + panda.getYear() + " " + catfish.getId());

		List<Animals> myList = new ArrayList<>();
		myList.add(panda);
		myList.add(zebra);
		myList.add(koala);
		myList.add(sloth);
		myList.add(armadillo);
		myList.add(raccoon);
		myList.add(bigfoot);
		myList.add(pigeon);
		myList.add(peacock);
		myList.add(toucan);
		myList.add(parrot);
		myList.add(swan);
		myList.add(salmon);
		myList.add(catfish);
		myList.add(perch);

	 // 1. List all the animals in descending order by year named
		System.out.println();
		System.out.println("List all the animals in descending order by year named");
		myList.sort((v1, v2) -> v2.getYear() - v1.getYear());
		myList.forEach((v) -> System.out.println(v.toString()));
		

 	// 	2. List all the animals alphabetically
		System.out.println();
		System.out.println("List all the animals alphabetically");
		myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		myList.forEach((v) -> System.out.println(v.toString()));

 	// 	3. List all the animals order by how they move
		System.out.println();
		System.out.println("List all the animals order by how they move");
		myList.sort((v1, v2) -> v1.getMove().compareToIgnoreCase(v2.getMove()));
		myList.forEach((v) -> System.out.println(v.toString()));

 	// 	4. List only those animals the breath with lungs
		System.out.println();
		System.out.println("List only those animals the breath with lungs");
		List<Animals> filteredList = filterAnimals(myList, (v) -> v.getBreath() == "lungs");
 		filteredList.forEach((v) -> System.out.println(v.toString()));

 	// 	5 .List only those animals that breath with lungs and were named in 1758
		System.out.println();
		System.out.println("List only those animals that breath with lungs and were named in 1758");
		filteredList = filterAnimals(myList, (v) -> (v.getBreath() == "lungs") && (v.getYear() == 1758));
 		filteredList.forEach((v) -> System.out.println(v.toString()));

 	// 	6. List only those animals that lay eggs and breath with lungs
 		System.out.println();
 		System.out.println("List only those animals that lay eggs and breath with lungs");
		filteredList = filterAnimals(myList, (v) -> (v.getBreath() == "lungs") && (v.getReproduction() == "eggs"));
 		filteredList.forEach((v) -> System.out.println(v.toString()));
 		
 	// 	7. List alphabetically only those animals that were named in 1758
 		System.out.println();
 		System.out.println("List alphabetically only those animals that were named in 1758");
		filteredList = filterAnimals(myList, (v) -> (v.getYear() == 1758));
		filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
 		filteredList.forEach((v) -> System.out.println(v.toString()));









	}
}