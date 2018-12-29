package krish.media.world;

import java.util.Map;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PublicationController 
{
	
	
	@RequestMapping(value = "/")
	/*public String deliverIssue(Model m)
	{
		m.addAttribute("medianame1", "Times of India");
		m.addAttribute("medianame2", "The Telegraph");
		m.addAttribute("medianame3", "The Statesman");
		return "mediaworld";
	}*/
	
	/*public String deliverIssue(Map<String,Object> mp)
	{
		mp.put("medianame1", "The Times of India");
		mp.put("medianame2", "The Daily Telegraph");
		mp.put("medianame3", "Washing Post");
		mp.put("medianame4", "Der Spiegel");
		return "mediaworld";
	}*/

	/*public String deliverIssue(ModelMap mm)
	{
		mm.addAttribute("medianame1", "Independent");
		mm.addAttribute("medianame2", "Observer");
		mm.addAttribute("medianame3", "Shinborne Star");
		
		return "mediaworld";
	}*/

	public ModelAndView deliverMessage()
	{
		Publication pb = new Publication("Guinness Book", 1871, "Brittanica", "Reference", 12);
		
		
//		ModelAndView mv = new ModelAndView("mediaworld");
//		mv.addObject("medianame1", "The Hindu");
//		mv.addObject("medianame2", "The Indian Express");
//		mv.addObject("medianame3", "Sportsworld");
		
		ModelAndView mv1 = new ModelAndView("mediaworld", "pb", pb);
		//mv1.addObject("pb", pb);
		mv1.addObject("PublicationName", pb.getPublicationName());
		mv1.addObject("PublishedYear", pb.getPublishedYear());
		mv1.addObject("BusinessGroup", pb.getBusinessGroup());
		mv1.addObject("Category", pb.getCategory());
		mv1.addObject("Editiions", pb.getEditions());
		
		return mv1;
	}
}

