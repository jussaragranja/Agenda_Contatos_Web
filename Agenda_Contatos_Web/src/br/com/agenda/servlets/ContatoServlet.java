package br.com.agenda.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.model.Contato;
import br.com.agenda.model.Email;
import br.com.agenda.model.Fornecedor;
import br.com.agenda.model.Telefone;
import br.com.agenda.regras.FornecedorRN;

/**
 * Servlet implementation class ContatoServlet
 */

@WebServlet("/ContatoServlet")
public class ContatoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	//private ContatoRN service;
	
	private FornecedorRN service;
       
    public ContatoServlet() {
    	
    	this.service = new FornecedorRN();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Contato contato = new Contato();
		
		String nome = request.getParameter("nome");
		contato.setNome(nome);
		
		String cpf = request.getParameter("cpf");
		contato.setCpf(cpf);
		
		String e1 = request.getParameter("email1");
		Email email1 = new Email();
		email1.setDescricao(e1);
		email1.setContato(contato);
		contato.getEmails().add(email1);
		
		
		String e2 = request.getParameter("email2");
		Email email2 = new Email();
		email2.setDescricao(e2);
		email2.setContato(contato);
		contato.getEmails().add(email2);
		
		
		String t1 = request.getParameter("telefone1");
		Telefone telefone1 = new Telefone();
		telefone1.setNumero(t1);
		telefone1.setContato(contato);
		contato.getTelefones().add(telefone1);
	
		
		String t2 = request.getParameter("telefone2");
		Telefone telefone2 = new Telefone();
		telefone2.setNumero(t2);
		telefone2.setContato(contato);
		contato.getTelefones().add(telefone2);
		
		//this.service.addContato(contato);
		Fornecedor f = this.service.getById(1L);
		f.getContatos().add(contato);
		contato.getFornecedores().add(f);
		service.update(f);
		
		System.out.println("####--- CONTATO " + contato.getNome()+ " SALVO COM SUCESSO! ---####");
		response.sendRedirect("/agenda");
	}

}
