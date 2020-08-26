package com.lti;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lti.service.CropService;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CropTest {

	@Autowired
	private CropService cropServ;

	//@Autowired
	//private CropRepository cropRepo;
	
	/* @Test
	void CropAdd() {
		Crop c = new Crop();
		c.setName("Rice");
		c.setCropType("Rabi");
		c.setFertilizerType("Urea");
		c.setQuantity(123);
		c.setSoilPH(8);
		c.setDateAddedOn(LocalDate.of(2020, 1, 31));
		c.setBasePrice(208);
		c.setFarmerId(100);
		c.setStatus("Sold");
		c.setStartDate(LocalDate.of(2020, 2, 3));
		c.setEndDate(LocalDate.of(2020, 3, 31));
		
		cropServ.register(c);
*/
		//Crop SavedCrop = cropRepo.findbyId(c.getId());
		//assertThat(SavedCrop).isNotNull();


}
