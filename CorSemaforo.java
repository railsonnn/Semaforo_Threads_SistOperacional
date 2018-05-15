package semaforo;

public enum CorSemaforo {
	VERDE(1000), AMARELO(300), VERMELHO(2000);

	private int tempoEspera;

	private CorSemaforo(int tempoEspera) {
		// TODO Auto-generated constructor stub
		this.tempoEspera = tempoEspera;

	}

	public int getTempoEspera() {
		return tempoEspera;
	}

}
