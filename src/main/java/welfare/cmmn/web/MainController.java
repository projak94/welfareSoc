package welfare.cmmn.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import welfare.cmmn.service.MainService;

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Resource(name = "MainService")
    private MainService MainService;

    @RequestMapping(value = "/MainIndex.do")
    public String mainPage() throws Exception {
        return "/cmmn/Main";
    }

    @RequestMapping(value = "/mngLogin.do")
    public ModelAndView mngLogin(@RequestParam Map<String, Object> inputMap, Model model) throws Exception {
        logger.info("로그인", inputMap);    

        String returnPage = "";

        HashMap<String, String> mngrInfo = MainService.getMngrInfo(inputMap);
        if(mngrInfo != null) {
            returnPage = "test.do";
        }
        
        ModelAndView mav = new ModelAndView();
        mav.setViewName("jsonView");
        mav.addObject("returnPage",    returnPage);
        return mav;
    }
    
    @RequestMapping(value = "/test.do")
    public String selectSampleList(@RequestParam Map<String, Object> inputMap, Model model) throws Exception {
        List<HashMap<String, String>> testList = MainService.getAcctCtrlList(inputMap);
        model.addAttribute("testList", testList);
        return "/cmmn/Test";
    }
    

}
