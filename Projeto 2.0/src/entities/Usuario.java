package entities;

public class Usuario {

	private String usuario;

	private String email;

	private String senha;

	public Usuario() {

	}

	public Usuario(String usuario, String email, String senha) {
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", email=" + email + ", senha=" + senha + "]";
	};

}
