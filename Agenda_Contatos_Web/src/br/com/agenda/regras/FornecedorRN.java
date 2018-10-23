package br.com.agenda.regras;

import java.util.List;

import br.com.agenda.dao.FornecedorDao;
import br.com.agenda.model.Fornecedor;

public class FornecedorRN {

	private FornecedorDao fornecedorDao;
	
	public FornecedorRN() {
		this.fornecedorDao = new FornecedorDao();
	}
	
	public Fornecedor getById(Long idFornecedor) {
		return this.fornecedorDao.getbyId(idFornecedor);
	}
	
	public void addFornecedor(Fornecedor fornecedor) {
		this.fornecedorDao.add(fornecedor);
	}
	
	public List<Fornecedor> list(){
		return this.list();
	}
	
	public void update(Fornecedor fornecedor) {
		this.fornecedorDao.update(fornecedor);
	}
	
	public void remover(Long idFornecedor) {
		this.fornecedorDao.remover(idFornecedor);
	}
	
}
