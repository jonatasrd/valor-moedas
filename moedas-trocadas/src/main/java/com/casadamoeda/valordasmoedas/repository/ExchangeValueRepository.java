package com.casadamoeda.valordasmoedas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casadamoeda.valordasmoedas.models.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);
}
