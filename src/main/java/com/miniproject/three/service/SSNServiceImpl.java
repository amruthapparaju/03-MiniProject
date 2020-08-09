package com.miniproject.three.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.three.dto.SsnDTO;
import com.miniproject.three.entity.SsnEntity;
import com.miniproject.three.exception.SsnApplicationException;
import com.miniproject.three.repo.SsnRepo;
import com.miniproject.three.repo.StateRepositery;

@Service
public class SSNServiceImpl implements SSNService {

	@Autowired
	private SsnRepo repo;

	private StateRepositery repo1;

	@Override
	public String SSnSaveDetails(SsnDTO dto) {
		boolean isSaved = false;
		SsnEntity save = null;
		SsnEntity entity = new SsnEntity();
		BeanUtils.copyProperties(dto, entity);
		try {
			save = repo.save(entity);
			if (save != null) {
				isSaved = true;
			}
		} catch (Exception e) {
			throw new SsnApplicationException("save failed");
		}

		return save.getSsnNo();
	}

	@Override
	public String ValidateSsno1(String ssno, String stateName) {

		SsnEntity findById = repo.findBySsnNoAndStateName(ssno, stateName);
		if (findById != null) {

			return "VALID";
		} else
			return "IN-VALID";
	}

	@Override
	public List<String> getAllStateNames() {
		return repo1.findState();
	}

}
