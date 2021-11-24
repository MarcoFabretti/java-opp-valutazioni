package it.corso.valutazioni;

public class CalcolaValutazione {
	int  IdStudente;
	int pAssenze;
	float mVoti;
	
	CalcolaValutazione(int IdStudente, int pAssenze, float mVoti){
		this.IdStudente=IdStudente;
		this.pAssenze=pAssenze;
		this.mVoti = mVoti;
	}
	CalcolaValutazione(){
		this.IdStudente=0;
		this.pAssenze=0;
		this.mVoti=0;
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
