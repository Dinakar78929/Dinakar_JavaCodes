package com.xworkz.education.boot;

import java.time.LocalDate;

import com.xworkz.education.dto.EducationDTO;
import com.xworkz.education.exception.DataInvalidException;
import com.xworkz.education.repo.EducationRepository;
import com.xworkz.education.repo.EducationRepositoryImpl;
import com.xworkz.education.service.EducationService;
import com.xworkz.education.service.EducationServiceImpl;

public class EducationDTORunner {

	public static void main(String[] args) {
		
		
//		EducationDTO educationDTO1 = new EducationDTO();
		EducationDTO educationDTO1 = new EducationDTO(111, "Dinakar", "BCA", 69.9, "kuvempu university", LocalDate.of(2019, 7, 12), LocalDate.of(2022, 11, 4), true, "Computer");
		EducationDTO educationDTO2 = new EducationDTO(222, "Kavana", "BCom", 80.6, "kuvempu university", LocalDate.of(2019, 6, 12), LocalDate.of(2022, 11, 12), true, "Accounts");
		EducationDTO educationDTO3 = new EducationDTO(333, "Nikhil", "BCA", 70, "kuvempu university", LocalDate.of(2019, 6, 28), LocalDate.of(2022, 11, 4), true, "Computer");

		EducationRepository repository = new EducationRepositoryImpl();

		EducationService service = new EducationServiceImpl(repository);
		
		try 
		{
		boolean save1 = service.validateAndSave(educationDTO1);
		System.out.println("1st dto is saved:" + save1);

		boolean save2 = service.validateAndSave(educationDTO2);
		System.out.println("2nd dto is saved:" + save2);

		boolean save3 = service.validateAndSave(educationDTO3);
		System.out.println("3rd dto is saved:" + save3);

//		boolean bckLog = service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Dinakar", "BCA", "kuvempu university");
//		System.out.println(bckLog);
		
		
		int id=service.findidByCandidateNameAndDegreeNameAndUniversity("Kavana", "BCom", "kuvempu university");
		System.out.println(id);
		
		System.out.println(service.findByCandidateName(" "));
		int id1=service.findidByCandidateNameAndDegreeNameAndUniversity("Kavana", "BCom", "kuvempu university");
		System.out.println(id1);
		}catch (DataInvalidException e) {
//			e.getStackTrace();
			System.err.println(e.getMessage());
		}
	}
}
