package com.xworkz.service.save;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dao.save.SaveDAO;
import com.xworkz.dto.save.SaveDTO;
import com.xworkz.entity.save.SaveEntity;

@Service
public class SaveService {
	@Autowired
	private SaveDAO dao;

	public SaveService() {
		System.out.println("created : " + this.getClass().getSimpleName());
	}

	public Integer save(SaveDTO saveDTO) {

		SaveEntity saveEntity = new SaveEntity();
		System.out.println("save method invoked from : " + this.getClass().getSimpleName());
		BeanUtils.copyProperties(saveDTO, saveEntity);
		dao.save(saveEntity);
		System.out.println("Sending to dao : " + this.getClass().getSimpleName());
		return 0;
	}

	public List<SaveEntity> getAll() {

		List<SaveEntity> list = dao.getAll();
		return list;
	}

	public SaveEntity getById(int id) {
		SaveEntity entity = dao.getById(id);
		return entity;
	}

	public int deleteById(int id) {
		int entityId = dao.deleteById(id);
		return entityId;
	}
	public Integer update(SaveDTO saveDTO,int id) {

		SaveEntity saveEntity = new SaveEntity();
		System.out.println("save method invoked from : " + this.getClass().getSimpleName());
		BeanUtils.copyProperties(saveDTO, saveEntity);
		saveEntity.setId(id);
		dao.save(saveEntity);
		System.out.println("Sending to dao : " + this.getClass().getSimpleName());
		return 0;
	}

}
