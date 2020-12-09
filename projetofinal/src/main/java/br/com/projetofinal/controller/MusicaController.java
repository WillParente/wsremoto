package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Musica;
import br.com.projetofinal.dao.MusicaDAO;

@RestController
@CrossOrigin("*")
public class MusicaController {

	@Autowired
	private MusicaDAO dao;
	
	@GetMapping("/musicas")
	public List<Musica> getAll() {
		List<Musica> lista = (List<Musica>)dao.findAll();
		return lista;
	}
	
	@GetMapping("/musica/{cod}")
	public Musica getMusica(@PathVariable int cod) {
		Musica objeto =  dao.findById(cod).orElse(null);
		if(objeto==null) {
			return new Musica(0,"Não encontado", "", "", 0);
		}
		return objeto;
	}
}
