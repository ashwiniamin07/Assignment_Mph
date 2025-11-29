package com.mph.Maven29Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ShapeTest {
	
	
//	@ParameterizedTest
//	@ValueSource(classes= {Shape.class,Circle.class,Triangle.class})
//	public void typeTest(Class<?> cls) throws Exception{
//		Shape shape=(Shape) cls.getDeclaredConstructor().newInstance();
//		assertTrue(shape.getClass()==cls);
//	}
	
	public Stream<Shape> shapeProvider(){
		return Stream.of(new Shape(),new Circle(),new Triangle());
	}
	
	
	@ParameterizedTest
	@MethodSource("shapeProvider")
	public static void typeTest(Shape shape) {
		Shape res=shape.type();
		assertTrue(res instanceof Shape||res instanceof Circle|| res instanceof Triangle);
	}
}
