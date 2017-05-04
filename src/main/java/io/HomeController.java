package io;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Bako Gdaniec
 **/

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(HttpServletResponse response) {
        return "index"; 
    }
}