package com.xworkz.controller.save;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.dto.save.SaveDTO;
import com.xworkz.entity.save.SaveEntity;
import com.xworkz.service.save.SaveService;

@RestController
public class SaveController {

	@Autowired
	private SaveService saveService;

	public SaveController() {
		System.out.println("created : " + this.getClass().getSimpleName());
	}

	@PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> onSave(@RequestBody SaveDTO saveDTO) {
		System.out.println(saveDTO.toString());
		saveService.save(saveDTO);
		return new ResponseEntity<String>("user saved succesfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SaveEntity> onGet() {
		List<SaveEntity> list = saveService.getAll();
		return list;
	}

	@GetMapping(value = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public SaveEntity getUserById(@PathVariable int id) {
		return saveService.getById(id);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable int id) {
		System.out.println("invoked int : " + id);
		int did = saveService.deleteById(id);
		return new ResponseEntity<String>("deleted id : " + did, HttpStatus.OK);
	}

	@PutMapping(value = "/update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateById(@PathVariable int id, @RequestBody SaveDTO saveDTO) {
		System.out.println("Dto from save dto : " + saveDTO);
		saveService.update(saveDTO, id);
		return new ResponseEntity<String>("updated", HttpStatus.OK);
	}

}
