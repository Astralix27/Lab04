

/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
		// Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void testConstructorParams() throws AssertException
    {
    	Animal animal = new Animal("Orange", "Tony", 200.1, 20.0);
    	
    	Assert.assertEquals("Tony", animal.getName());
    	Assert.assertEquals("Orange", animal.getColor());
    	Assert.assertEquals(200.1, animal.getWeight(), 0.01);
    	Assert.assertEquals(20.0, animal.getHeight(), 0.01);
    }
    
    public void testToString() throws AssertException
    {
    	Animal animal = new Animal("White", "Bonny", 45.0, 5.6);
    	
    	Assert.assertEquals("Bonny, a White-colored animal. 45.0 pounds, 5.6 inches\n", animal.toString());
    }
}

