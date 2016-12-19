package facam.control;

import facam.model.ComportamentoRelogio;

public class Hora implements ComportamentoRelogio {
	
	int hora, minuto,segundo,mostraHoraCompleta;

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public void setMostraHoraCompleta(int mostraHoraCompleta) {
		this.mostraHoraCompleta = mostraHoraCompleta;
	}

	@Override
	public String getHora() {
	
		return null;
	}

	@Override
	public String getMinuto() {
		
		return getMinuto();
	}

	@Override
	public String getSegundos() {
		
		return null;
	}

	@Override
	public String mostraHoraCompleta() {
		
		return null;
	}

}
