package exerc02_bd;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Contato {
	
	private String email;
	private String nome;
	private String telefone;
	private String grupo;
	private String[] appMensagens;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	private String estadoNatal;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String[] getAppMensagens() {
		return appMensagens;
	}
	public void setAppMensagens(String[] appMensagens) {
		this.appMensagens = appMensagens;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEstadoNatal() {
		return estadoNatal;
	}
	public void setEstadoNatal(String estadoNatal) {
		this.estadoNatal = estadoNatal;
	}


}
