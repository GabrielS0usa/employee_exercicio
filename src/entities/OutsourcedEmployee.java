package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharger;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharger) {
		super(name, hours, valuePerHour);
		this.additionalCharger = additionalCharger;
	}

	public Double getAdditionalCharger() {
		return additionalCharger;
	}

	public void setAdditionalCharger(Double additionalCharger) {
		this.additionalCharger = additionalCharger;
	}

	@Override
	public Double payment() {
		return super.payment() + additionalCharger * 1.1;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(getName() + " - " + String.format("%.2f", payment()));
		return str.toString();
	}

}
