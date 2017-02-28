
public class Maquina {

    public Estado estados[];
    public Estado e_inicial;
    public Estado e_final;
    public AlfabetoEntrada alf;
    public AlfabetoAuxiliar alf_aux;
    public Transicoes[] trans;
    static char simbolo_branco = '#';
    static char simbolo_inicio = '$';

    public Maquina(Estado est[], Estado inicial, Estado fin, AlfabetoEntrada a, AlfabetoAuxiliar aux, Transicoes[] t) {
        estados = est;
        e_inicial = inicial;
        e_final = fin;
        alf = a;
        alf_aux = aux;
        trans = t;
    }

    public void lerFita(String fita) {
        int i = 0;
        fita = "$" + fita + "#";
        char[] aux = fita.toCharArray();
        for (int j = 0; j < aux.length; j++) {
            if (alf.contain(aux[j])==false) {
                System.out.println("Simbolo " + aux[j] + " nÃo pertence ao alfabeto!");
                System.exit(0);
            }
        }
        while (e_final.condicao != true) {
            for (int j = 0; j < trans.length; j++) {
            	if(i>=aux.length) break;
                if (trans[j].trans(aux[i], e_inicial)) {
                    Transicoes t = trans[j];
                    t.q_inicial.setState(false);
                    e_inicial = t.q_final;
                    e_inicial.setState(true);
                    aux[i] = t.simbolo_escrito;
                    if (e_final.nome.equals(e_inicial.nome)) {
                        e_final.setState(true);
                    }
                    if (t.direcao == 'e') {
                        i--;
                    } else {
                        i++;
                    }
                    System.out.println(aux);
                }
            }
        }
        if(e_final.condicao==true) System.out.println("ACEITA");
        else System.out.println("NÃO ACEITA!!!");
    }
}
