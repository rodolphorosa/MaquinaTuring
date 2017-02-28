
public class Transicoes {
	public Estado q_inicial; //estado antes do processamento do caracter
	public Estado q_final; //estado após processamento do caracter
	public char simbolo_entrada; //simbolo de entrada
	public char simbolo_escrito; //simbolo que sera escrito na fita
	public char direcao; //direcao de andamento
	
	public Transicoes(Estado q_inicial, Estado q_final, char simbolo_entrada, char simbolo_escrito, char direcao){
		this.q_inicial = q_inicial;
		this.q_final = q_final;
		this.simbolo_entrada = simbolo_entrada;
		this.simbolo_escrito = simbolo_escrito;
		this.direcao = direcao;
	}
	
	public boolean trans(char entrada, Estado atual){
		if(simbolo_entrada==entrada&&q_inicial.nome.equals(atual.nome))
			return true;
		else return false;
	}
}
