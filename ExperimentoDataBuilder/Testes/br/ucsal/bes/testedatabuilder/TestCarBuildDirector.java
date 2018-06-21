package br.ucsal.bes.testedatabuilder;

import org.junit.Assert;
import org.junit.Test;

public class TestCarBuildDirector {
	public static final int wheels = 4;
	public static final String color = "red";
	public static final String model = "A";
	public static final int year = 2017;

	@Test
	public void emptyCar() {

		Car car = new CarBuilderImpl().build();

		Assert.assertNull(car.getModel());
		Assert.assertNull(car.getColor());
		Assert.assertEquals(0, car.getWheels());
		Assert.assertEquals(0, car.getYear());

	}

	@Test
	public void genericCar() {

		Car builder = new CarBuilderImpl().setModel(model).setColor(color).setWheels(wheels).setYear(year).build();

		Assert.assertEquals(model, builder.getModel());
		Assert.assertEquals(color, builder.getColor());
		Assert.assertEquals(wheels, builder.getWheels());
		Assert.assertEquals(year, builder.getYear());

	}

}
