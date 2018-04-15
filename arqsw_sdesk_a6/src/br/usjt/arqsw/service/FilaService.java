package br.usjt.arqsw.service;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.FilaDAO;
import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;

/*** @author Marcelo Torre�o 816113657 SI3AN-MCA*/

@Service
public class FilaService {
	private FilaDAO dao;
	
	@Autowired
	public FilaService(FilaDAO dao) {
		this.dao = dao;
	}
	public List<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	public Fila carregar(int id) throws IOException{
		return dao.carregar(id);
	}
	
	public int novaFila(Fila fila) throws IOException{
		return dao.inserirFila(fila);
	}
	public String excluirFila(Fila fila) throws IOException {
		return dao.excluirFila(fila);
	}
	
}
