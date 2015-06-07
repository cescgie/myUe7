package myUe7;

import java.util.Arrays;

public class App {
	public static void main(String[] args) throws Exception{
		CreationInfo creationInfo =
				AnnotationTest.class.getAnnotation(CreationInfo.class);
		if(creationInfo !=null)
			printCreationInfo(creationInfo);
		else
			System.out.println("Keine " + CreationInfo.class.getSimpleName() +
					"-Annotation vorhanden.");
	}
	private static void printCreationInfo(CreationInfo creationInfo){
		System.out.println("author: "+ creationInfo.author());
		System.out.println("description: "+ creationInfo.description());
		System.out.println("tags: " + Arrays.toString(creationInfo.tags()));
		System.out.println("baseclass: " + creationInfo.baseclass());
	}
}