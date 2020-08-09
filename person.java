class person 
{
String name= "Saichand";
void eat()
{
this.Wash();
this.serve();
	
}
void Wash()
{
	System.out.println("Wash the cloths");
}

void serve()
{
	System.out.println("Serve the food");
}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");	
			
			person p=new person();

			p.eat();
	}
}
