package com.codewritedevelopment.EvaAircraft.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewritedevelopment.EvaAircraft.entities.AcftSgnfctEqpt;
import com.codewritedevelopment.EvaAircraft.repositories.AcftSgnfctEqptRepository;

@Service
public class AcftSgnfctEqptServiceImpl implements AcftSgnfctEqptService {

	@Autowired
	AcftSgnfctEqptRepository acftSgnfctEqptRepository;
	
	

	@Override
	public List<AcftSgnfctEqpt> getEqptList() {
		List<AcftSgnfctEqpt> act = (List<AcftSgnfctEqpt>) acftSgnfctEqptRepository.findAll();
		return act; 
	}



}
