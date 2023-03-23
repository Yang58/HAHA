package com.company.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.domain.TestVO;
import com.company.mapper.TestMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService{
	
	private TestMapper mapper;

	@Override
	public List<TestVO> getList() {
		log.info("Service Implements getList....");
		return mapper.getList();
	}
	

}
