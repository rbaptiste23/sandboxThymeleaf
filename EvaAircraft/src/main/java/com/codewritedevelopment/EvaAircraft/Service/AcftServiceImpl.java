package com.codewritedevelopment.EvaAircraft.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewritedevelopment.EvaAircraft.entities.Acft;
import com.codewritedevelopment.EvaAircraft.repositories.AcftRepository;

@Service
public class AcftServiceImpl implements AcftService {

	
	@Autowired
	AcftRepository acftRepository;
	
	
	@Override
	public List<Acft> getAircraft() {
		List<Acft> acftInfo =(List<Acft>) acftRepository.findAll();
		return acftInfo;
	}




	
	
}
