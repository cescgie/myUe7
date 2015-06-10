package myUe7;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class App {
	public static void main(String[] args) throws Exception{
		
		CreationInfo creationInfo =
				AnnotationTest.class.getAnnotation(CreationInfo.class);
		if(creationInfo !=null){
			readNextClass(creationInfo);
		}else{
			System.out.println("Keine " + CreationInfo.class.getSimpleName() +
					"-Annotation vorhanden.");
		}
	}
	//Source http://stackoverflow.com/questions/20362493/how-to-get-annotation-class-name-attribute-values-using-reflection
	private static void readNextClass(CreationInfo creationInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		for (Annotation annotation : NextClass.class.getAnnotations()) {
            Class<? extends Annotation> type = annotation.annotationType();
            System.out.println("Values of " + type.getName());

            for (Method method : type.getDeclaredMethods()) {
                Object value = method.invoke(annotation, (Object[])null);
				if (value.getClass().isArray()) {
					for (Object elem : (Object[]) value) {
						System.out.println(elem);
					}
				} else {
					System.out.println(value);
				}
            }
        }
	}
}