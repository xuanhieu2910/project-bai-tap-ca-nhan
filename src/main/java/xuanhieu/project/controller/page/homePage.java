package xuanhieu.project.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class homePage {

    @RequestMapping
    public String homePage(){
        return "index";
    }
}
