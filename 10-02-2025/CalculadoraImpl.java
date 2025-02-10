import java.io.*;

class CalculadoraImpl implements ICalculadora {

	public Double calcular(Operacion operacion) {
		
		switch (operacion.getOperando()) {

			case SUMA:
				return operacion.getX1() + operacion.getX2();
			default:
				return 0.0;

		}		

	}

}
