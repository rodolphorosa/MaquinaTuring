
public class Estado {
	public String nome;
	public boolean condicao; //condi��o atual do estado
	
	public Estado(String nome){
		this.nome = nome;
	}
	
	public void setState(boolean state){
		condicao = state;
	}
}
