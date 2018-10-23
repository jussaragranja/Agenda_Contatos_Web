package br.com.agenda.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.agenda.dao.acess.JPAUtils;
import br.com.agenda.model.Fornecedor;

public class FornecedorDao {

	private static JPAUtils instance;
	
	protected EntityManager entityManager;

	public static JPAUtils getInstance() {
		if (instance == null) {
			instance = new JPAUtils();
		}

		return instance;
	}

	public FornecedorDao() {
		entityManager = JPAUtils.getEntityManager();
	}
	
	public Fornecedor getbyId(Long id) {
		return  this.entityManager.find(Fornecedor.class,id);
	}
	
	public List<Fornecedor> list(){
		return this.entityManager.createNamedQuery("FROM " + Fornecedor.class.getName()).getResultList();
	}
	
	public void add(Fornecedor fornecedor) {
		try {
			
			this.entityManager.getTransaction().begin();
			this.entityManager.persist(fornecedor);
			this.entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	
	public void update(Fornecedor fornecedor) {
		try {
			
			this.entityManager.getTransaction().begin();
			this.entityManager.merge(fornecedor);
			this.entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void remover(Long idFornecedor) {
		
		try {
			
			Fornecedor fornecedor = getbyId(idFornecedor);
			this.entityManager.remove(fornecedor);
			
		} catch (Exception e) {
			e.printStackTrace();
			this.entityManager.getTransaction().rollback();
		}
		
	}
}
