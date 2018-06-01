package welfare.cmmn.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import welfare.cmmn.service.MainService;

@Controller
public class MainController {

    @Resource(name = "MainService")
    private MainService MainService;
    
    @RequestMapping(value = "/test.do")
    public String selectSampleList(@RequestParam Map<String, Object> inputMap, Model model) throws Exception {
        List<HashMap<String, Object>> testList = MainService.getAcctCtrlList(inputMap);
        model.addAttribute("testList", testList);
        return "/cmmn/Test";
    }
    

    @RequestMapping(value = "/MainIndex.do")
    public String mainPage() throws Exception {
        return "/cmmn/Main";
    }
}
