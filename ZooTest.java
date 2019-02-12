

public class ZooTest
{
	public void testConstructorParams() throws AssertException
	{
		Animal animal = new Animal("White", "Bonny", 45.0, 5.6);
    	Zoo zoo = new Zoo(1);
    	zoo.addAnimal(animal);
    	
    	Assert.assertEquals(45.0, zoo.getAverageWeight(), 0.01);
    	Assert.assertEquals(5.6, zoo.getTotalHeight(), 0.01);
    	Assert.assertEquals(1, zoo.getCapacity(), 0.01);
    	Assert.assertEquals(45.0, zoo.getAverageWeight("White"), 0.01);
	}
	
	public void testToString() throws AssertException
	{
		Animal animal = new Animal("Orange", "Tony", 200.1, 20.0);
    	Zoo zoo = new Zoo(1);
    	zoo.addAnimal(animal);
    	
    	Assert.assertEquals("These animals live in the zoo: \nTony, a Orange-colored animal. 200.1 pounds, 20.0 inches\n", zoo.toString());
	}
}