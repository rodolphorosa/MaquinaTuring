
public class Main {

    public static void main(String[] args) {
        String cadeia = "aabc";
        
        /*Cole seu c�digo a partir daqui*/
        
        /*Esta m�quina deve reconhecer linguagens do tipo a^2n b c^n */
        
        Estado[] est = new Estado[8];
		est[0] = new Estado("q0");
		est[1] = new Estado("q1");
		est[2] = new Estado("q2");
		est[3] = new Estado("q3");
        est[4] = new Estado("q4");
		est[5] = new Estado("q5");
		est[6] = new Estado("q6");
		est[7] = new Estado("qf");
		
		AlfabetoEntrada alfa = new AlfabetoEntrada();
		alfa.setAlfabeto('a');
		alfa.setAlfabeto('b');
        alfa.setAlfabeto('c');
        alfa.setAlfabeto('$');
        alfa.setAlfabeto('#');
		
		AlfabetoAuxiliar alfa_aux = new AlfabetoAuxiliar();
		alfa_aux.setAlfabeto('X');
		alfa_aux.setAlfabeto('Y');
        alfa_aux.setAlfabeto('c');
		
		Transicoes[] trans = new Transicoes[14];
		trans[0] = new Transicoes(est[0], est[0], '$', '$', 'd');
		trans[1] = new Transicoes(est[0], est[1], 'a', 'X', 'd');
		trans[2] = new Transicoes(est[0], est[6], 'X', 'X', 'd');
        trans[3] = new Transicoes(est[0], est[6], 'Y', 'Y', 'd');
		trans[4] = new Transicoes(est[1], est[2], 'a', 'X', 'd');
		trans[5] = new Transicoes(est[2], est[2], 'a', 'a', 'd');
		trans[6] = new Transicoes(est[2], est[3], 'b', 'b', 'd');
		trans[7] = new Transicoes(est[3], est[3], 'Y', 'Y', 'd');
		trans[8] = new Transicoes(est[3], est[4], 'c', 'Y', 'e');
		trans[9] = new Transicoes(est[4], est[5], 'b', 'b', 'e');
		trans[10] = new Transicoes(est[5], est[5], 'a', 'a', 'e');
		trans[11] = new Transicoes(est[5], est[5], 'b', 'b', 'e');
		trans[12] = new Transicoes(est[5], est[0], 'X', 'X', 'd');
		trans[13] = new Transicoes(est[6], est[7], '#', '#', 'd');

		Maquina m = new Maquina(est, est[0], est[7], alfa, alfa_aux, trans);
        /*Este � o final do seu c�digo*/
        
        /*Esse m�todo deve ser sempre instanciado, pois � respons�vel pela leitura da fita*/
        m.lerFita(cadeia);
    }
}
