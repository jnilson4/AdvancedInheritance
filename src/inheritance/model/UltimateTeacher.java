package inheritance.model;

public abstract class UltimateTeacher implements Cody
{
	private String knowledge;
	private String code;
	private int speed;
	private boolean isCooking;
	
	public UltimateTeacher()
	{
		this.knowledge = "";
		this.code = "";
		this.speed = 0;
		this.isCooking = false;
	}
	
	public String getKnowledge(String knowledge)
	{
		if(knowledge.contains("I know"))
		{
			System.out.println("YOU KNOW STUFF!");
		}
		else
		{
			System.out.println("YOU DON'T KNOW STUFF!");
		}
		
		return knowledge;
	}

	public String getCode(String code)
	{
		if(code.contains("if"))
		{
			System.out.println("YOU USED AN IF STATEMENT!");
		}
		else if(code.contains("else"))
		{
			System.out.println("YOU USED AN ELSE STATEMENT!");
		}
		
		return code;
	}

	public int getSpeed(int speed)
	{	
		if(speed >= 10)
		{
			System.out.println("You are fast like Cody!");
		}
		else
		{
			System.out.println("Sorry, you are slower than Cody!");
		}
		
		return speed;
	}

	public boolean isCooking()
	{
		if(isCooking)
		{
			System.out.println("Youre cooking!");
		}
		else
		{
			System.out.println("Go cook!");
		}
		
		return isCooking;
	}
}
