package com.kafi.biish;


import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kafi.dao.Kitecho;
import com.kafi.dao.Miho;
import com.kafi.dao.Words;

@Controller
@RequestMapping("/")
public class Kafi {
	private String wocho;
	private Kitecho kit;
	public Kitecho getKit() {
		return kit;
	}
	public void setKit(Kitecho kit) {
		this.kit = kit;
	}
	@ModelAttribute("miho")
	public Miho getWords(){
		return new Miho();
	}
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	   public String student() {
	      return ("ajax");
	      //new ModelAndView
	     // "command", new Words()
	   }

	@RequestMapping(value = "/shadib", method = RequestMethod.POST)
	public String translate(@ModelAttribute("miho")Miho miho, ModelMap model) throws UnsupportedEncodingException{ 
	model.addAttribute("kafi", miho.getKafi());
	String l=miho.getKafi();
    Words wd=(Words)kit.findRecord(l);
	
	String input=wd.getAmmari();
	int wordLength=input.length();
	StringBuffer wordBuffer=new StringBuffer();
	
	for(int i=0;i<wordLength;i++) 
	{
		wordBuffer.append("&#"+input.codePointAt(i));
	}
	model.addAttribute("wc", wd.getWc()); 
	model.addAttribute("ammari",wordBuffer);
	model.addAttribute("ingliizo", wd.getIngliizo());
	wocho=wordBuffer.toString();
	//getRandom();
		return "Second";
	}
	 //String newString(int codePoint) {
	  //  return new String(Character.toChars(codePoint));
	//}
	
	 @RequestMapping(value = "loose", method = RequestMethod.GET)
	 public @ResponseBody String getRandom(){
		 
		 return wocho;
	 }
	 @RequestMapping(value = "/looseSearch")
	 public @ResponseBody String getTags(Model model, @ModelAttribute ("CHARS") String name) 
	 {
		 System.out.println(name);
	     Words wd=(Words)kit.findRecord(name);
	     System.out.println(name);
	     List<Words> list=new ArrayList<Words>();
	     Map<Integer,Words> map = new HashMap<Integer,Words>();
	     map.put(1, wd);
	     list.add(wd);
	     System.out.println(wd.getAmmari()+wd.getIngliizo());
	     
	     Iterator it = map.entrySet().iterator();
	     while (it.hasNext()) {
	         Map.Entry pair = (Map.Entry)it.next();
	         System.out.println(pair.getKey() + " = " + pair.getValue());
	         
	     }
	     
	     return name;
	 }
	 

}
