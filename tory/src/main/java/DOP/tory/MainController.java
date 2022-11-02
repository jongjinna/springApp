package DOP.tory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/DOPTORY")
    @ResponseBody
    public String index() {
        return "Hello, This is Dop site, i make this site to study spring";
    }
    @RequestMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}