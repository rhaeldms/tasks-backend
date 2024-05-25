package br.ce.wcaquino.taskbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/")
public class RootController {

	
	@GetMapping
	public String hello() {
		return 			"0000000     0000000     L         UU       UU    IIIII    ZZZZZZZ    AAAAA  \n" + \
						"0000000000 0000000000   L         UU       UU     III         ZZ     AAAAAA \n" + \
						"000000000000000000000   L         UU       UU     III       ZZ       AA   AA\n" + \
						" 0000000000000000000    L         UU       UU     III      ZZ        AAAAAAA\n" + \
						"   0000000000000000     L         UU       UU     III     ZZ         AA   AA\n" + \
						"     000000000000       LLLLLLL    UUUUUUUUU      III     ZZZZZZZ    AA    AA\n" + \
						"       00000000       \n" + \
						"         0000        \n" +  \
						"          00          ";
	}
}
