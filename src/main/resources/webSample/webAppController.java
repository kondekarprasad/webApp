package webSample
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class webAppController {

	@RequestMapping(value= "/homepage", method = RequestMethod.GET)
	public ModelAndView first() {
		System.out.println("hi_cotroller_loaded");
		ModelAndView modelAndView = new ModelAndView(/*"homepage"*/);
		System.out.println("hi"+modelAndView.getClass().getName());
		modelAndView.addObject("message","welcome to spring MVC");
		return modelAndView;
	}

}
