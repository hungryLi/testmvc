package ssm.test.dao;

import java.util.List;
import java.util.Map;

import ssm.test.model.LikeVO;

public interface LikeVOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LikeVO record);

    int insertSelective(LikeVO record);

    LikeVO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LikeVO record);

    int updateByPrimaryKey(LikeVO record);

	List<Map<String, Object>> selectList();
}