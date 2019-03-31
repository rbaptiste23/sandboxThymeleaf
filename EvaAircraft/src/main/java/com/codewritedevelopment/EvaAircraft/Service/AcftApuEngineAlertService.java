package com.codewritedevelopment.EvaAircraft.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codewritedevelopment.EvaAircraft.entities.AcftApuEngineAlert;
import com.codewritedevelopment.EvaAircraft.entities.AcftApuEngineAlertIdentity;

@Service
public interface AcftApuEngineAlertService {

	List<AcftApuEngineAlert> getAlerts();

}
