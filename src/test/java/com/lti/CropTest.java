package com.lti;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lti.entity.Crop;
import com.lti.service.CropService;

@SpringBootTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class CropTest {
	
	@Autowired
	private CropService cropServ;
	//@Autowired
	//private CropRepository cropRepo;
	
	@Test
	void CropAdd() {
		Crop c = new Crop();
		c.setName("Rice");
		c.setCrop_type("Rabi");
		c.setFertilizer_type("Urea");
		c.setQuantity(123);
		c.setSoil_pH(8);
		c.setDate_added_on(LocalDate.of(2020, 1, 31));
		c.setBase_price(208);
		c.setFarmer_id("F001");
		c.setStatus("Sold");
		c.setStart_date(LocalDate.of(2020, 2, 3));
		c.setEnd_date(LocalDate.of(2020, 3, 31));
		
		cropServ.register(c);

		//Crop SavedCrop = cropRepo.findbyId(c.getId());
		//assertThat(SavedCrop).isNotNull();

	}
}
