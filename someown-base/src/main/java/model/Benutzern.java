package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Benutzern")
public class Benutzern implements Serializable{

	/**
	 * serialVersionUID is used as a version control in Serializable Class
	 * By using Eclipse can be automatic generated
	 */
	private static final long serialVersionUID = -3053425493161990578L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="fullName")
	private String fullName;
	
	@Column(name="location")
	private String location;
	
	protected Benutzern() {}
	
	public Benutzern(String n, String l) {
		this.fullName = n ;
		this.location=l;
	}
	
	
	
}
