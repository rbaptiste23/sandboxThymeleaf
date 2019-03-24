package com.codewritedevelopment.EvaAircraft.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codewritedevelopment.EvaAircraft.entities.Acft;

@Repository
public interface AcftRepository extends CrudRepository<Acft, String>{

}
