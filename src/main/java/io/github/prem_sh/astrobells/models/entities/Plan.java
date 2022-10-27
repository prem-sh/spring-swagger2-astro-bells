package io.github.prem_sh.astrobells.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plan")
public class Plan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long planId;
	@Column(name="plan_name")
	private String planName;
	@Column(name="price")
	private Double price;
	public Long getPlanId() {
		return planId;
	}
	public String getPlanName() {
		return planName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
