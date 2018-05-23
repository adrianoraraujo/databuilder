package br.ucsal.bes.testedatabuilder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCarBuildDirector {
public static final int wheels = 4;
public static final String color = "red";
private CarBuilder builder;
@Test
public void montarCarro(final CarBuilder builder) {
	Car b = new CarBuilderImpl()
			.setColor(color)
			.setWheels(wheels)
			.build();
		
	assertEquals(wheels, b.getWheels());
	assertEquals(color, b.getColor());
		
	


}}
