package com.xworkz.police.boot;

import java.time.LocalDate;

import com.xworkz.police.dto.AmbulanceDTO;
import com.xworkz.police.repo.AmbulanceRepository;
import com.xworkz.police.repo.AmbulanceRepositoryImpl;
import com.xworkz.police.service.AmbulanceService;
import com.xworkz.police.service.AmbulanceServiceImpl;

public class AmbulanceRunner {

	public static void main(String[] args) {
		//Collection<AmbulanceDTO> ambulanceDTOs = new ArrayList<>();

		AmbulanceDTO dto1= new AmbulanceDTO(1, 10, 15, "Bommayi", false, "Ganga", LocalDate.of(2010, 4, 1));
		AmbulanceDTO dto2 = new AmbulanceDTO(2, 12, 11, "Yash", false, "Darshan", LocalDate.of(2011, 4, 1));

		AmbulanceRepository repository = new AmbulanceRepositoryImpl();
		AmbulanceService service = new AmbulanceServiceImpl(repository);

		boolean save1 = service.validateAndSave(dto1);
		System.out.println("DTO1 is saved"+save1);
		boolean save2 = service.validateAndSave(dto2);
		System.out.println(save2);

	}

}
