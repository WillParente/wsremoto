package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.dao.ArtistaDAO;

@RestController
@CrossOrigin("*")
public class ArtistaController {

	@Autowired
	private ArtistaDAO dao;
	
	@GetMapping("/artistas")
	public List<Artista> getAll() {
		List<Artista> lista = (List<Artista>)dao.findAll();
		return lista;
	}
	
	@GetMapping("/artista/{cod}")
	public Artista getArtista(@PathVariable int cod) {
		Artista objeto =  dao.findById(cod).orElse(null);
		if(objeto==null) {
			return new Artista(0,"Não encontado", "");
		}
		return objeto;
	}
}
