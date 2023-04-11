package com.xworkz.education.repo;

import java.time.LocalDate;

import com.xworkz.education.dto.EducationDTO;

public interface EducationRepository {

	boolean save(EducationDTO dto);

	default boolean isExist(EducationDTO dto)
	{
		return false;
	}

	EducationDTO findByCandidateName(String name);

	EducationDTO findByCandidateNameAndUniversity(String name, String university);

	boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university);

	EducationDTO findByCandidateNameAndStartDateAndEndDate(String name, LocalDate startDate, LocalDate endDate);

	double findPercentageByCandidateName(String name);

	String findStreamByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university);

	int findidByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university);

	String findUniversityByCandidateName(String name);

	int total();

}
