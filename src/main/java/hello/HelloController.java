package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        String style = "<style type='text/css' media='screen'>";
        style += "body { background-color: red; position: fixed; top: 50%; left: 50%; transform: translate(-50%, -50%); color: orange; font-size: 250%; }";
        style += "</style>";
        
        String message = "Greetings from GitLab Amsterdam!";
        
        String body = "<body>" + message + "</body>";

        return style + body;
    }

}
