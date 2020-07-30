package com.startup.project.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.startup.project.model.StartupModel;

@Repository("reportImmigrationOffencesRepository")
@Transactional
public interface StartupRepository extends CrudRepository<StartupModel, Long>{

	@Query(value="select TRN_SEQ.nextval from DUAL",nativeQuery=true)
	public Long getTRNSequence();
	
	@Query(value="select max(REPORT_NO) from offences_report_form",nativeQuery=true)
	public String getMaxReportNumber();
}
