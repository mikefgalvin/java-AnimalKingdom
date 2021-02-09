package AnimalKingdom;


public class Birds extends Animals
{
	private String name;
	private int year;

	public Birds(String name, int year)
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
		return "fly";
	}

	@Override
	public String getBreath()
	{
		return "lungs";
	}

	@Override
	public String getReproduction()
	{
		return "eggs";
	}



	@Override
	public String toString()
	{
		return "ID: " + getId() + " Bird: Name: " + name + " Year: " + year;
	}

}