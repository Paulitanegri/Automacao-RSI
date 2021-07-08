package Pages;

import org.openqa.selenium.By;

public class Elementos {
	// cadastro do usuario
	private By menu = By.id("menuUserLink");
	private By cadastro = By.cssSelector("body > login-modal > div > div > div.login.ng-scope > a.create-new-account.ng-scope");
	private By nome = By.name("usernameRegisterPage");
	private By email = By.name("emailRegisterPage");
	private By senha = By.name("passwordRegisterPage");
	private By confirma = By.name("confirm_passwordRegisterPage");
	private By recebofer = By.name("allowOffersPromotion");
	private By condprivac = By.name("i_agree");
	private By registro = By.id("register_btnundefined");

	public By getRecebofer() {
		return recebofer;
	}

	public By getCondprivac() {
		return condprivac;
	}

	public By getRegistro() {
		return registro;
	}

	// login do usuario
	private By login = By.name("username");
	private By password = By.name("password");
	private By remember = By.name("remember_me");
	private By signin = By.id("sign_in_btnundefined");

	// cadastro do usuario
	public By getMenu() {
		return menu;
	}

	public By getCadastro() {
		return cadastro;
	}

	public By getNome() {
		return nome;
	}

	public By getEmail() {
		return email;
	}

	public By getSenha() {
		return senha;
	}

	public By getConfirma() {
		return confirma;
	}

	// login do usuario
	public By getLogin() {
		return login;
	}

	public By getPassword() {
		return password;
	}

	public By getRemember() {
		return remember;
	}

	public By getSignin() {
		return signin;
	}

}
