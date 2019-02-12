

public class EquipmentTest
{
	public void testConstructorParams() throws AssertException
	{
		Equipment equipment = new Equipment("Smoke Bomb/5,5.0,15.75,A getaway tool");
		
		Assert.assertEquals("Smoke Bomb", equipment.getName());
		Assert.assertEquals(5, equipment.getCount(), 0.01);
		Assert.assertEquals(5.0, equipment.getTotalWeight(), 0.01);
		Assert.assertEquals(15.75, equipment.getTotalPrice(), 0.01);
		Assert.assertEquals("A getaway tool", equipment.getDescription());
	}
	
	public void testToString() throws AssertException
	{
    	Equipment equipment = new Equipment("Smoke Bomb/5,5.0,15.75,A getaway tool");
    	
    	Assert.assertEquals("Name: Smoke Bomb, Number: 5, Weight: 5.00 lbs, Price: $15.75 - A getaway tool", equipment.toString());
	}
}