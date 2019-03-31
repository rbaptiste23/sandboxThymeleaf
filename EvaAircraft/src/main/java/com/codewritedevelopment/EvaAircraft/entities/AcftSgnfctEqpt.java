package com.codewritedevelopment.EvaAircraft.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


// Different setup because we only have two fields in the table and both fields are primary keys.

@Entity
@Table(name = "ata_sgnfct_eqpt")
@IdClass(value=AcftSgnfctEqpt.AcftSgnfctEqptId.class)
public class AcftSgnfctEqpt implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
	@Column(name = "FLEET_TYPE_CDE")
	private String fleetTypeCde;

	@Id
	@Column(name = "ATA_CHAP_CDE")
	private String ataChapterCode;

 
	
	public String getFleetTypeCode() {
		return fleetTypeCde;
	}

	public void setFleetTypeCode(String fleetTypeCode) {
		this.fleetTypeCde = fleetTypeCode;
	}
 

	public String getAtaChapterCode() {
		return ataChapterCode;
	}

	public void setAtaChapterCode(String ataChapterCode) {
		this.ataChapterCode = ataChapterCode;
	}

	
	@Override
	public String toString() {
		return "AcftSgnfctEqpt [fleetTypeCde=" + fleetTypeCde + ", ataChapterCode=" + ataChapterCode + "]";
	}


	static class AcftSgnfctEqptId implements Serializable  {

		private static final long serialVersionUID = 1L;
		private String fleetTypeCde;
		private String ataChapterCode;

		public String getFleetTypeCde() {
			return fleetTypeCde;
		}

		public void setFleetTypeCde(String fleetTypeCde) {
			this.fleetTypeCde = fleetTypeCde;
		}

		public String getAtaChapCde() {
			return ataChapterCode;
		}

		public void setAtaChapCde(String ataChapCde) {
			this.ataChapterCode = ataChapCde;
		}

	}

}
