package io.github.prem_sh.astrobells.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fact")
public class Facts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fact_id")
	private Long factId;
	@Column(name = "fact_title", nullable = false, unique = true)
	private String factTitle;
	@Column(name = "fact", nullable = false)
	private String fact;
	public Long getFactId() {
		return factId;
	}
	public void setFactId(Long factId) {
		this.factId = factId;
	}
	public String getFactTitle() {
		return factTitle;
	}
	public void setFactTitle(String factTitle) {
		this.factTitle = factTitle;
	}
	public String getFact() {
		return fact;
	}
	public void setFact(String fact) {
		this.fact = fact;
	}
}
