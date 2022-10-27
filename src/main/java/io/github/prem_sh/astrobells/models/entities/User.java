package io.github.prem_sh.astrobells.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "user_id")
	private Long UserId;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="email")
	private String email;
	
	@Column(name = "place_of_birth")
	private String pob;
	
	@Column(name = "time_of_birth")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	
	@Column(name = "latitude")
	private String latitude;
	
	@Column(name = "longititude")
	private String longititude;
}
