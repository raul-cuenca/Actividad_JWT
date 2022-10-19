package raul.cuenca.jwt.dto;

public class UsuarioDtoResponse {

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public UsuarioDtoResponse(String token) {
		super();
		this.token = token;
	}

	public UsuarioDtoResponse() {
		super();
	}

}
