package aribank;

public interface AcessoInterno {

	//os metodos nao tem comprotamento(corpo) so tem assinatura
	
	/**
	 * @param String usuario => pode-se informar um usuario valido
	 * @param String senha => pode-se informar uma senha com até 2555 caracteres alfanuméricos
	 * @return retorna verdadeiro quando a senha estiver correta
	 * 
	 * 
	 */
	
	public boolean autenticarSistema ( String usuario, String senha);
	boolean mudarUsuario(String usuarioAntigo, String usuarioNovo);
	boolean mudarSenha(String senhaAntiga, String senhaNova);
	
}
