package AnimalKingdom;


//mammals - walk, lungs, live births
public class Fish extends Animals
{
	private String name;
	private int year;

	public Fish(String name, int year)
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
		return "swim";
	}

	@Override
	public String getBreath()
	{
		return "gills";
	}

	@Override
	public String getReproduction()
	{
		return "eggs";
	}



	@Override
	public String toString()
	{
		return "ID: " + getId() + " Fish: Name: " + name + " Year: " + year;
	}

}