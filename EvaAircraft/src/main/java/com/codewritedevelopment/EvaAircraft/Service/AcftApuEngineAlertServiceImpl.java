package com.codewritedevelopment.EvaAircraft.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewritedevelopment.EvaAircraft.entities.AcftApuEngineAlert;
import com.codewritedevelopment.EvaAircraft.repositories.AcftApuEngineAlertRepository;

@Service
public class AcftApuEngineAlertServiceImpl implements AcftApuEngineAlertService {
	
	@Autowired
	AcftApuEngineAlertRepository acftApuEngineAlertRepository;

	@Override
	public List<AcftApuEngineAlert> getAlerts() {
       List<AcftApuEngineAlert> eAlert = (List<AcftApuEngineAlert>) acftApuEngineAlertRepository.findAll();
       return eAlert;
	}
	
	

}
