class Operacion {

	private Double x1;
	private Double x2;
	private Operando op;

	Operacion(Double x1, Double x2, Operando op) {

		this.x1 = x1;
		this.x2 = x2;
		this.op = op;
	
	}

	public Double getX1() {
	
		return this.x1;
	
	}

	public Double getX2() {
	
		return this.x2;
	
	}

	public Operando getOperando() {
	
		return this.op;
	
	}

}
