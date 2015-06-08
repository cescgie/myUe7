package myUe7;

@CreationInfo(
		author = "Author NextClass", 
		description = "Description NextClass",
	    baseclass = AbstractClass.class,
		interfaces = { Interface1.class, Interface2.class }, 
		tags = { "Tag1", "Tag2" })
public class NextClass extends AbstractClass implements Interface1, Interface2 {
	public void someMethod() {
	}
}