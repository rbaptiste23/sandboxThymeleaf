package com.codewritedevelopment.EvaAircraft.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="apu_egt_alrt")
public class AcftApuEngineAlert {
	

	@EmbeddedId
	private AcftApuEngineAlertIdentity acftApuEngineAlert;
	
	
	@Column(name="APU_EGT_TPR_END_THLD")
	private String apuEgtTprEndThld;
	
	@Column(name="ALRT_LVL_DESC")
	private String AlrtLvlDesc;
	
	@Column(name="LST_UPDT_BY_EMP_NUM")
	private String lstUpdtByEmpNum;
	
	@Column(name="LST_UPDT_DTTM")
	private String lstUpdtDttm;


	public String getApuEgtTprEndThld() {
		return apuEgtTprEndThld;
	}

	public void setApuEgtTprEndThld(String apuEgtTprEndThld) {
		this.apuEgtTprEndThld = apuEgtTprEndThld;
	}

	public String getAlrtLvlDesc() {
		return AlrtLvlDesc;
	}

	public void setAlrtLvlDesc(String alrtLvlDesc) {
		AlrtLvlDesc = alrtLvlDesc;
	}

	public String getLstUpdtByEmpNum() {
		return lstUpdtByEmpNum;
	}

	public void setLstUpdtByEmpNum(String lstUpdtByEmpNum) {
		this.lstUpdtByEmpNum = lstUpdtByEmpNum;
	}

	public String getLstUpdtDttm() {
		return lstUpdtDttm;
	}

	public void setLstUpdtDttm(String lstUpdtDttm) {
		this.lstUpdtDttm = lstUpdtDttm;
	}
	
	
	
	
	

}