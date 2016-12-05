package mace.jon;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

import junit.framework.TestCase;
import mace.jon.aspects.MatchAnnotation.MyAspectAddedInterface;

public class TestMethodsAreImplemented extends TestCase {
	
	@Test
	public void testAbstractClassWithAnnotationIsWoven() {
		assertTrue(MyAspectAddedInterface.class.isAssignableFrom(AbstractClassWithAnnotation.class));
	}
	
	@Test
	public void testAbstractClassWithoutAnnotationIsWoven() {
		assertTrue(MyAspectAddedInterface.class.isAssignableFrom(AbstractClassWithoutAnnotation.class));
	}
	
	@Test
	public void testMethodsAreImplemented1() throws NoSuchMethodException, SecurityException {
		Method m = AbstractClassWithAnnotation.class.getMethod("count");
		assertFalse(Modifier.isAbstract(m.getModifiers()));
	}
	
	@Test
	public void testMethodsAreImplemented2() throws NoSuchMethodException, SecurityException {
		Method m = AbstractClassWithoutAnnotation.class.getMethod("count");
		assertFalse(Modifier.isAbstract(m.getModifiers()));
	}

}
