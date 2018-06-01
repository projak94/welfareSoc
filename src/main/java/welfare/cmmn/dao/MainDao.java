package welfare.cmmn.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("MainDao")
public interface MainDao {
    
    List<HashMap<String, Object>> getAcctCtrlList(Map<String, Object> inputMap) throws Exception;

}
