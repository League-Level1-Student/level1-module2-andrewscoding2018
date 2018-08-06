
public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	String title;

	public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
this.name = name;
this.isWoman = isWoman;
this.isKnighted = isKnighted;

	if(name.equals("Jane Austen"))
	{
		isWoman = true;
	}else if(name.equals("George Orwell"))
	{
		isWoman = false;
	}else if(name.equals("Issac Newton"))
	{
		isWoman = false;
	}

	if(isKnighted== true && isWoman == false)
	{
title = "Sir ";
	}
	else if(isKnighted == false  && isWoman == false)
	{
		title = "Mr. ";
	}
	else if(isKnighted == true  && isWoman == true)
	{
		title = "Lady ";
	}
	else if(isKnighted  == true  && isWoman == true)
	{
		title = "Ms. ";
	}
	
	
return "Hello " + title + name;
}
}

