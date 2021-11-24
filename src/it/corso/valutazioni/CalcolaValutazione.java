package it.corso.valutazioni;

public class CalcolaValutazione {
	int  IdStudente;
	int pAssenze;
	float mVoti;
	
	public CalcolaValutazione() {
		IdStudente=0;
		pAssenze=0;
		mVoti=0;
	}
	
	public CalcolaValutazione(int IdStudente, int pAssenze, float mVoti){
		this.IdStudente=IdStudente;
		this.pAssenze=pAssenze;
		this.mVoti = mVoti;
	}
	
	public boolean Esito() {
		boolean esito=true;
		if(pAssenze>50) {
			esito=false;
		}
		if((pAssenze<=50)&&(pAssenze>25)&&(mVoti<6)) {
			esito=false;
		}
		if(pAssenze<=25 && mVoti<2) {
			esito=false;
		}
		
		return esito;
	}
}
