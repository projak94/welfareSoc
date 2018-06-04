package welfare.cmmn.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import welfare.cmmn.dao.MainDao;


@Service("MainService")
public class MainService extends EgovAbstractServiceImpl {
    @Resource(name="MainDao")
    private MainDao MainDao;

    public List<HashMap<String, String>> getAcctCtrlList(Map<String, Object> inputMap) throws Exception {
        return MainDao.getAcctCtrlList(inputMap);
    }
    
    public HashMap<String, String> getMngrInfo(Map<String, Object> inputMap) throws Exception {
        return MainDao.getMngrInfo(inputMap);
    }

}
