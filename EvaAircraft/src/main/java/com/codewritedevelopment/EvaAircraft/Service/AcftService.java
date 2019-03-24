package com.codewritedevelopment.EvaAircraft.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.codewritedevelopment.EvaAircraft.entities.Acft;

@Service
public interface AcftService {

	List<Acft> getAircraft();
	
}
