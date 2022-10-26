package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController //annotation -- bilgilendirme ifadesi
@RequestMapping("/api/brands") //endpoint
public class BrandsController {
	private BrandService brandService;
	@Autowired  // parametrenin interfacesini getirmiş gibi
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	@GetMapping("/getAll")
	public List<Brand> getAll(){
		return brandService.getAll();
	}
	@GetMapping("/getId")
	public String tss() {
		return "hakan";
	}
}
