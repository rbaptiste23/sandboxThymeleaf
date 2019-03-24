package com.codewritedevelopment.EvaAircraft.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Acft {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ACFT_TAIL_NUM")
	private String aircraftTailNumber;
	
	@Column(name="ACFT_NOSE_NUM")
	private String aircraftNoseNum;
	
	@Column(name="FLEET_TYPE_CDE")
	private String fleetTypeCode;
 
	@Column(name="LST_UPDT_BY_EMP_NUM")
	private String lastUpdateByEmployeeNumber;
	
	@Column(name="LST_UPDT_TYPE_DESC")
	private String lastUpdateTypeDescription;
	
 
	@Column(name="LST_UPDT_REAS")
	private String lastUpdateReason;


	public String getAircraftTailNumber() {
		return aircraftTailNumber;
	}


	public void setAircraftTailNumber(String aircraftTailNumber) {
		this.aircraftTailNumber = aircraftTailNumber;
	}


	public String getAircraftNoseNum() {
		return aircraftNoseNum;
	}


	public void setAircraftNoseNum(String aircraftNoseNum) {
		this.aircraftNoseNum = aircraftNoseNum;
	}


	public String getFleetTypeCode() {
		return fleetTypeCode;
	}


	public void setFleetTypeCode(String fleetTypeCode) {
		this.fleetTypeCode = fleetTypeCode;
	}


	public String getLastUpdateByEmployeeNumber() {
		return lastUpdateByEmployeeNumber;
	}


	public void setLastUpdateByEmployeeNumber(String lastUpdateByEmployeeNumber) {
		this.lastUpdateByEmployeeNumber = lastUpdateByEmployeeNumber;
	}


	public String getLastUpdateTypeDescription() {
		return lastUpdateTypeDescription;
	}


	public void setLastUpdateTypeDescription(String lastUpdateTypeDescription) {
		this.lastUpdateTypeDescription = lastUpdateTypeDescription;
	}


	public String getLastUpdateReason() {
		return lastUpdateReason;
	}


	public void setLastUpdateReason(String lastUpdateReason) {
		this.lastUpdateReason = lastUpdateReason;
	}


	@Override
	public String toString() {
		return "Acft [aircraftTailNumber=" + aircraftTailNumber + ", aircraftNoseNum=" + aircraftNoseNum
				+ ", fleetTypeCode=" + fleetTypeCode + ", lastUpdateByEmployeeNumber=" + lastUpdateByEmployeeNumber
				+ ", lastUpdateTypeDescription=" + lastUpdateTypeDescription + ", lastUpdateReason=" + lastUpdateReason
				+ "]";
	}
	
 
	
  
	
	

}
