package AnimalKingdom;

abstract class Animals
{
	//number
	//name
	//year discovered
	protected static int maxId = 0;
	protected int id;

	public Animals()
	{
		maxId++;
		id = maxId;
	}

	abstract int getId();
	abstract String getName();
	abstract int getYear();

	//methods
	//- move
	//- breath
	//- reproduce
	abstract String getMove();
	abstract String getBreath();
	abstract String getReproduction();

	

}