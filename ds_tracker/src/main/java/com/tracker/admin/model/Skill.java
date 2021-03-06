package com.tracker.admin.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table (name = "skill")
public class Skill {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skillId")
	private long skillId;

	@Column(name = "skill")
	private String skill;
}
