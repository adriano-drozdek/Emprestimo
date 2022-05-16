package entities;

import java.util.Date;

public class Contract {

	private Integer number;
	private Date Date;
	private Double totalValue;

	public Contract() {
	}

	public Contract(Integer number, java.util.Date date, Double totalValue) {
		super();
		this.number = number;
		Date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

}
