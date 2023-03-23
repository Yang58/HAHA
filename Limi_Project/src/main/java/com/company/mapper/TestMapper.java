package com.company.mapper;

import java.util.List;

import com.company.domain.TestVO;

public interface TestMapper {

	public List<TestVO> getList();
	
	public TestVO getTest(int code1);
	
	
}
