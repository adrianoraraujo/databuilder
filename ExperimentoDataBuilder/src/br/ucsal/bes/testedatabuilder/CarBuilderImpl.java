package br.ucsal.bes.testedatabuilder;

public class CarBuilderImpl implements CarBuilder {

	private Car car;

	public CarBuilderImpl() {
		car = new Car();
	}

	@Override
	public Car build() {
		// TODO Auto-generated method stub
		return car;
	}

	public CarBuilder setModel(final String model) {
		car.setModel(model);
		return this;
	}

	public CarBuilder setYear(final int year) {
		car.setYear(year);
		return this;

	}

	@Override
	public CarBuilder setColor(final String color) {
		car.setColor(color);
		return this;
	}

	@Override
	public CarBuilder setWheels(final int wheels) {
		car.setWheels(wheels);
		return this;
	}

}
