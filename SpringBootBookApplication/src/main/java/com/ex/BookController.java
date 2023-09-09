package com.ex;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book/")
public class BookController {
	
	@Autowired
	private BookRepository br; 
	
	@GetMapping("/addBook")
	public String bookForm(@ModelAttribute("book") Book book) {
		return "addBook";
	}
	@PostMapping("add")
	public String addBook(@ModelAttribute("book") Book book, Model m) {
		br.save(book);
		return "redirect:viewData";
	}
	@GetMapping("viewData")
	public String viewBook(Model m) {
		m.addAttribute("book", br.findAll());
		return "viewBook";
	}
	 @GetMapping("/editBook/{bkid}")
	    public String editBook(@PathVariable("bkid") int bkid, Model model) {
	        Optional<Book> bookOptional = br.findById(bkid);
	        if (bookOptional.isPresent()) {
	            model.addAttribute("book", bookOptional.get());
	            return "editBook";
	        }
	        return "redirect:/book/viewData";
	    }
	@PostMapping("/updateBook")
    public String updateBook(@ModelAttribute("book") Book book) {
        br.save(book);
        return "redirect:/book/viewData";
    }

	
	@GetMapping("/deleteBook/{bkid}")
	public String deleteBook(@PathVariable("bkid") int bkid, Model model) throws Throwable {
		Book book = br.findById(bkid).orElseThrow(null);
		br.delete(book);
		return "redirect:/book/viewData";
	}
}
