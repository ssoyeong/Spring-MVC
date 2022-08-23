package hello.typeconverter.controller;

import hello.typeconverter.type.IpPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {

        String data = request.getParameter("data");     // Http 요청 파라미터는 모두 문자로 처리됨
        Integer intValue = Integer.valueOf(data);       // 숫자 타입으로 변경
        System.out.println("intValue = " + intValue);
        return "ok";
    }
    
    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data) {     // 문자 10이 숫자 10으로 내부에서 변환됨
        System.out.println("data = " + data);
        return "ok";
    }

    @GetMapping("/ip-port")
    public String ipPort(@RequestParam IpPort ipPort) {
        System.out.println("ipPort IP = " + ipPort.getIp());
        System.out.println("ipPort PORT = " + ipPort.getPort());
        return "ok";
    }
}
