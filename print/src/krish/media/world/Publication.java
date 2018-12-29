package krish.media.world;

public class Publication 
{
	private String PublicationName;
	private int PublishedYear;
	private String BusinessGroup;
	private String Category;
	private int Editions;
	
	
	public String getPublicationName() 
	{
		return PublicationName;
	}
	public void setPublicationName(String PublicationName) 
	{
		this.PublicationName = PublicationName;
	}
	public int getPublishedYear() 
	{
		return PublishedYear;
	}
	public void setPublishedYear(int PublishedYear) 
	{
		this.PublishedYear = PublishedYear;
	}
	public String getBusinessGroup() 
	{
		return BusinessGroup;
	}
	public void setBusinessGroup(String BusinessGroup) 
	{
		this.BusinessGroup = BusinessGroup;
	}
	public String getCategory() 
	{
		return Category;
	}
	public void setCategory(String Category) 
	{
		this.Category = Category;
	}
	public int getEditions() 
	{
		return Editions;
	}
	public void setEditions(int Editions) 
	{
		this.Editions = Editions;
	}
	public Publication(String PublicationName, int PublishedYear, String BusinessGroup, String Category, int Editions) 
	{
		
		this.PublicationName = PublicationName;
		this.PublishedYear = PublishedYear;
		this.BusinessGroup = BusinessGroup;
		this.Category = Category;
		this.Editions = Editions;
	}

	
	
	
	
	
	
	
	
}
