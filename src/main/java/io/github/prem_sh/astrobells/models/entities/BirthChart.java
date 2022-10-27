package io.github.prem_sh.astrobells.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="birth_chart")
public class BirthChart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="birth_chart_id")
	private Long id;
	
	@OneToOne
	@JoinColumn(name="user_id", nullable = false)
	private User user;
	private Double ascendant;
	private Double sun;
	private Double moon;
	private Double satrun;
	private Double jupiter;
	private Double mars;
	private Double venus;
	private Double mercury;
	private Double rahu;
	private Double kethu;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Double getAscendant() {
		return ascendant;
	}
	public void setAscendant(Double ascendant) {
		this.ascendant = ascendant;
	}
	public Double getSun() {
		return sun;
	}
	public void setSun(Double sun) {
		this.sun = sun;
	}
	public Double getMoon() {
		return moon;
	}
	public void setMoon(Double moon) {
		this.moon = moon;
	}
	public Double getSatrun() {
		return satrun;
	}
	public void setSatrun(Double satrun) {
		this.satrun = satrun;
	}
	public Double getJupiter() {
		return jupiter;
	}
	public void setJupiter(Double jupiter) {
		this.jupiter = jupiter;
	}
	public Double getMars() {
		return mars;
	}
	public void setMars(Double mars) {
		this.mars = mars;
	}
	public Double getVenus() {
		return venus;
	}
	public void setVenus(Double venus) {
		this.venus = venus;
	}
	public Double getMercury() {
		return mercury;
	}
	public void setMercury(Double mercury) {
		this.mercury = mercury;
	}
	public Double getRahu() {
		return rahu;
	}
	public void setRahu(Double rahu) {
		this.rahu = rahu;
	}
	public Double getKethu() {
		return kethu;
	}
	public void setKethu(Double kethu) {
		this.kethu = kethu;
	}
}
