package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Places {

	private int id;
	private double latitude;
	private double longitude;
	private ArrayList<String> type = new ArrayList<String>();
	private ArrayList<String> vehicleCompatible = new ArrayList<String>();

	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime beginOperation;

	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime endOperation;

	public Places() {
		super();
	}

	public Places(int id, double latitude, double longitude, ArrayList<String> type,
			ArrayList<String> vehicleCompatible, LocalDateTime beginOperation, LocalDateTime endOperation) {
		super();
		setId(id);
		setLatitude(latitude);
		setLongitude(longitude);
		setType(type);
		setVehicleCompatible(vehicleCompatible);
		setBeginOperation(beginOperation);
		setEndOperation(endOperation);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public ArrayList<String> getType() {
		return type;
	}

	public void setType(ArrayList<String> type) {
		this.type = type;
	}

	public ArrayList<String> getVehicleCompatible() {
		return vehicleCompatible;
	}

	public void setVehicleCompatible(ArrayList<String> vehicleCompatible) {
		this.vehicleCompatible = vehicleCompatible;
	}

	public LocalDateTime getBeginOperation() {
		return beginOperation;
	}

	public void setBeginOperation(LocalDateTime beginOperation) {
		this.beginOperation = beginOperation;
	}

	public LocalDateTime getEndOperation() {
		return endOperation;
	}

	public void setEndOperation(LocalDateTime endOperation) {
		this.endOperation = endOperation;
	}

}