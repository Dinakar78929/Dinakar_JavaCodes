package com.xworkz.headphone.dto;

import java.io.Serializable;
import java.util.Objects;

public class SoftwareDTO implements Serializable{
	private int id;
	private String name;
	private int version;
	private String developedBy;

	public SoftwareDTO() {

	}

	public SoftwareDTO(int id, String name, int version, String developedBy) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.developedBy = developedBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(developedBy, id, name, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoftwareDTO other = (SoftwareDTO) obj;
		return Objects.equals(developedBy, other.developedBy) && id == other.id && Objects.equals(name, other.name)
				&& version == other.version;
	}

	@Override
	public String toString() {
		return "SoftwareDTO [id=" + id + ", name=" + name + ", version=" + version + ", developedBy=" + developedBy
				+ "]";
	}

}
