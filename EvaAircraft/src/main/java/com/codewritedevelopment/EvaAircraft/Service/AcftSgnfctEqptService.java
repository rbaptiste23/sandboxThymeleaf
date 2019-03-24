package com.codewritedevelopment.EvaAircraft.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codewritedevelopment.EvaAircraft.entities.AcftSgnfctEqpt;

@Service
public interface AcftSgnfctEqptService {

	List<AcftSgnfctEqpt> getEqptList();
}
