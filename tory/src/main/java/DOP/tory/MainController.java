package DOP.tory;

import DOP.tory.question.Question;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/DOPTORY")
    public String index() {
        return "doptory";
    }
    @RequestMapping("/")
    public String root() {
        return "redirect:/DOPTORY";
    }
}