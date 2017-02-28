import java.util.ArrayList;


public class AlfabetoEntrada implements Alfabeto{
	public ArrayList<String> alf = new ArrayList<String>();
	
	public AlfabetoEntrada(){
	}
	
	public void setAlfabeto(char c){
		alf.add(String.valueOf(c));
	}
	
	@Override
	public char getSimbol(int pos) {
		// TODO Auto-generated method stub
		return alf.get(pos).charAt(0);
	}
        
        public boolean contain(char c){
            if(alf.contains(String.valueOf(c))==true) return true;
            else return false;
        }

}
