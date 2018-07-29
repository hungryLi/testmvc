package ssm.test.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.test.dao.LikeVOMapper;
import ssm.test.service.TestService;

@Service(value="testService")
public class TestServiceImpl implements TestService {

	
	@Autowired
	private LikeVOMapper likeMapper;
	
	
	public List<Map<String, Object>> testOne() {
		
		List<Map<String,Object>> list = likeMapper.selectList();
		return list;
	}

}
