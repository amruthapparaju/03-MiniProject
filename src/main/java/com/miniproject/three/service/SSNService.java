package com.miniproject.three.service;

import java.util.List;

import com.miniproject.three.dto.SsnDTO;
import com.miniproject.three.model.SsnModel;

public interface SSNService {

	public String SSnSaveDetails(SsnDTO dto);

	public List<String> getAllStateNames();

	String ValidateSsno1(String ssno, String stateName);

}
