package dev.mvc.team9_v2sbm3c;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeCont {

  
  public HomeCont() {
    System.out.println("홈(Home) Cont 실행.");
  }
  
  // http://localhost:9093
  @RequestMapping(value= {"", "/", "/index.do", "/index.resort"}, method=RequestMethod.GET)
  public ModelAndView home() {
    System.out.println("home");
    
    ModelAndView mav = new ModelAndView();
    mav.setViewName("/index"); // /WEB-INF/views/index.jsp
    // spring.mvc.view.prefix=/WEB-INF/views/
    // spring.mvc.view.suffix=.jsp
        
    return mav;
  }

}



