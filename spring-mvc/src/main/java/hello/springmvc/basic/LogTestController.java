package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController     // 뷰 이름 반환이 아니고 문자열을 반환하면 해당 문자열을 바로 HTTP 메시지 바디에 입력
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass()); // @Slf4j

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // 로그의 레벨을 설정 가능
        log.trace("trace log={}", name);
        // log.trace("trace log =" + name);
        // 위와 같이 사용하면 불필요한 연산 발생
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}



