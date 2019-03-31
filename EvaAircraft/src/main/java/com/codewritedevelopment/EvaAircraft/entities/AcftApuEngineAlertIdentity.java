package com.codewritedevelopment.EvaAircraft.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AcftApuEngineAlertIdentity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Column(name="FLEET_TYPE_CDE")
	private String fleetTypeCode;
	
	
	@Column(name="APU_EGT_TPR_STRT_THLD")
	private String apuEgtTprStrtThld;


	public AcftApuEngineAlertIdentity() {
	}


	public AcftApuEngineAlertIdentity(String fleetTypeCode, String apuEgtTprStrtThld) {
		this.fleetTypeCode = fleetTypeCode;
		this.apuEgtTprStrtThld = apuEgtTprStrtThld;
	}


	public String getFleetTypeCode() {
		return fleetTypeCode;
	}


	public void setFleetTypeCode(String fleetTypeCode) {
		this.fleetTypeCode = fleetTypeCode;
	}


	public String getApuEgtTprStrtThld() {
		return apuEgtTprStrtThld;
	}


	public void setApuEgtTprStrtThld(String apuEgtTprStrtThld) {
		this.apuEgtTprStrtThld = apuEgtTprStrtThld;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apuEgtTprStrtThld == null) ? 0 : apuEgtTprStrtThld.hashCode());
		result = prime * result + ((fleetTypeCode == null) ? 0 : fleetTypeCode.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AcftApuEngineAlertIdentity other = (AcftApuEngineAlertIdentity) obj;
		if (apuEgtTprStrtThld == null) {
			if (other.apuEgtTprStrtThld != null)
				return false;
		} else if (!apuEgtTprStrtThld.equals(other.apuEgtTprStrtThld))
			return false;
		if (fleetTypeCode == null) {
			if (other.fleetTypeCode != null)
				return false;
		} else if (!fleetTypeCode.equals(other.fleetTypeCode))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "AcftApuEngineAlertIdentity [fleetTypeCode=" + fleetTypeCode + ", apuEgtTprStrtThld=" + apuEgtTprStrtThld
				+ "]";
	}
	
	
	
}
