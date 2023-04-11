package com.xworkz.education.service;

import java.time.LocalDate;

import com.xworkz.education.dto.EducationDTO;
import com.xworkz.education.exception.DataInvalidException;

public interface EducationService {
	boolean validateAndSave(EducationDTO dto) throws DataInvalidException;

//	boolean isExist(EducationDTO dto);
	EducationDTO findByCandidateName(String name) throws DataInvalidException;

	EducationDTO findByCandidateNameAndUniversity(String name, String university) throws DataInvalidException;

	boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university)throws DataInvalidException;

	EducationDTO findByCandidateNameAndStartDateAndEndDate(String name, LocalDate startDate, LocalDate endDate)throws DataInvalidException;

	double findPercentageByCandidateName(String name)throws DataInvalidException;

	String findStreamByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university)throws DataInvalidException;

	int findidByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university)throws DataInvalidException;

	String findUniversityByCandidateName(String name)throws DataInvalidException;

	int total();

}
