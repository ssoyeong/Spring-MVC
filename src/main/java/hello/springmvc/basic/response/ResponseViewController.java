package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {

        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello");

        return mav;
    }

    // @ResponseBody // return 값을 논리 뷰가 아닌 그대로 HTTP 메시지 바디에 입력한다
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {

        model.addAttribute("data", "hello!");
        return "response/hello";
    }

    @RequestMapping("/response/hello")      // 바로 논리 뷰의 이름으로 인식해서 리턴. 권장하진 않음
    public void responseViewV3(Model model) {

        model.addAttribute("data", "hello!");
    }
}
