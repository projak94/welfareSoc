package welfare.cmmn.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("MainDao")
public interface MainDao {

    HashMap<String, String> getMngrInfo(Map<String, Object> inputMap) throws Exception;
    
    List<HashMap<String, String>> getAcctCtrlList(Map<String, Object> inputMap) throws Exception;
    

}
