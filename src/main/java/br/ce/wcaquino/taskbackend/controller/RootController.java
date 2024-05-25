package br.ce.wcaquino.taskbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/")
public class RootController {

	
	@GetMapping
	public String hello() {
		return "Olá humano!";
	}
	public class ParabensAmigaLuiza {
		public static void main(String[] args) {
			String nome = "Luiza";
			String mensagem = gerarMensagem(nome);
			System.out.println(mensagem);
		}
	
		private static String gerarMensagem(String nome) {
			StringBuilder sb = new StringBuilder();
			
			sb.append("****************************************\n");
			sb.append("*                                      *\n");
			sb.append("*        PARABÉNS, AMIGA ").append(nome.toUpperCase()).append("!        *\n");
			sb.append("*                                      *\n");
			sb.append("****************************************\n");
			sb.append("*                                      *\n");
			sb.append("*    Desejo a você um dia maravilhoso! *\n");
			sb.append("*    Que todos os seus sonhos se       *\n");
			sb.append("*    realizem e que você seja muito    *\n");
			sb.append("*    feliz hoje e sempre.              *\n");
			sb.append("*                                      *\n");
			sb.append("****************************************\n");
	
			return sb.toString();
		}
	}
}
