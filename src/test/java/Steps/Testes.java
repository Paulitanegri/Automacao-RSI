package Steps;

import java.io.IOException;

import Metodos.Metodo;
import Pages.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Testes {

	Metodo metodo = new Metodo();
	Elementos elemento = new Elementos();

	String nome = "Carolina1018";

	@Dado("que eu eu esteja no site {string}")
	public void que_eu_eu_esteja_no_site(String site) {
		metodo.abrirNavegador(site);

	}

	@Quando("eu clicar <perfil>")
	public void eu_clicar_perfil() throws IOException, InterruptedException {
		metodo.esperarClicavel(elemento.getMenu(), "");
		metodo.clicarTempo(elemento.getMenu(), " ");

	}

	@Quando("clicar <create a new account>")
	public void clicar_create_a_new_account() throws IOException, InterruptedException {
		metodo.clicarTempo(elemento.getCadastro(), " ");

	}

	@Quando("preencher as informacoes obrigatorias")
	public void preencher_as_informacoes_obrigatorias() {
		metodo.escrever(elemento.getNome(), this.nome);
		metodo.escrever(elemento.getEmail(), "carolina1010@depotit.com.br");
		metodo.escrever(elemento.getSenha(), "pXlPatqsP3");
		metodo.escrever(elemento.getConfirma(), "pXlPatqsP3");
		metodo.clicar(elemento.getCondprivac());
		metodo.clicar(elemento.getRegistro());

	}

	@Entao("cadastro criado com sucesso")
	public void cadastro_criado_com_sucesso() throws InterruptedException, IOException {
		metodo.validarCadastro(elemento.getMenu(), this.nome);
		metodo.printScreen("cadastroDeCliente");
		metodo.fechar();

	}

	@Quando("preencher  usuario")
	public void preencher_usuario() {
		metodo.escrever(elemento.getLogin(), "Carolina1015");
	}

	@Quando("preencher senha")
	public void preecnher_senha() {
		metodo.escrever(elemento.getPassword(), "pXlPatqsP3");
	}

	@Entao("login realizado")
	public void login_realizado() throws InterruptedException, IOException {
		metodo.clicar(elemento.getSignin());
		metodo.validarCadastro(elemento.getMenu(), "Carolina1015");
		metodo.printScreen("login");
		metodo.fechar();

	}

}
