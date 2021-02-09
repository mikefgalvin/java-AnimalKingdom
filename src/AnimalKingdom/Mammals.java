package AnimalKingdom;


//mammals - walk, lungs, live births
public class Mammals extends Animals
{
	private String name;
	private int year;

	public Mammals(String name, int year)
	{
		this.name = name;
		this.year = year;
	}

	@Override
	public int getId()
	{
		return id;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public int getYear()
	{
		return year;
	}

	@Override
	public String getMove()
	{
		return "walk";
	}

	@Override
	public String getBreath()
	{
		return "lungs";
	}

	@Override
	public String getReproduction()
	{
		return "Live Birth";
	}



	@Override
	public String toString()
	{
		return "ID: " + getId() + " Mammal: Name: " + name + " Year: " + year;
	}

}