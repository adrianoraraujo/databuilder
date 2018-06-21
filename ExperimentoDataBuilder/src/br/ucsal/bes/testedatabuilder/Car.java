package br.ucsal.bes.testedatabuilder;

public class Car {
	private int wheels;
	private String color;
	private int year;
	private String model;

	public Car() {
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(final String color) {
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(final int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", color=" + color + ", year=" + year + ", model=" + model + "]";
	}

}

interface CarBuilder {
	Car build();

	CarBuilder setColor(final String color);

	CarBuilder setWheels(final int wheels);

	CarBuilder setYear(final int year);

	CarBuilder setModel(final String model);
}
