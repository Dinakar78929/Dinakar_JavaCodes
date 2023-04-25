package com.xworkz.police.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.police.consts.Cell;

public class PoliceStationDTO implements Serializable, Comparable<PoliceStationDTO> {
	@Min(value=1, message="value should be grater than 1")
	@Max(value=100, message="value shold be less than 100")
	private int id;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "value should be between 2 and 30")
	private String name;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "value should be between 2 and 30")
	private String inspectorName;
	
	private Cell cells;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "value should be between 2 and 30")
	private String area;

	public PoliceStationDTO(int id, String name, String inspectorName, Cell cells, String area) {
		super();
		this.id = id;
		this.name = name;
		this.inspectorName = inspectorName;
		this.cells = cells;
		this.area = area;
	}

	@Override
	public String toString() {
		return "PoliceStationDTO [id=" + id + ", name=" + name + ", inspectorName=" + inspectorName + ", cells=" + cells
				+ ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, cells, id, inspectorName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoliceStationDTO other = (PoliceStationDTO) obj;
		return Objects.equals(area, other.area) && cells == other.cells && id == other.id
				&& Objects.equals(inspectorName, other.inspectorName) && Objects.equals(name, other.name);
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

	public String getInspectorName() {
		return inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		this.inspectorName = inspectorName;
	}

	public Cell getCells() {
		return cells;
	}

	public void setCells(Cell cells) {
		this.cells = cells;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public int compareTo(PoliceStationDTO o) {

		return this.name.compareTo(o.name);
	}

}
