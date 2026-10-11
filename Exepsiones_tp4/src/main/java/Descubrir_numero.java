import exepcioens.NumeroFueraDeRangoException;

public class Descubrir_numero {
    private int num;
    private final int aleatorio = (int) (Math.random() * 500) + 1;
    private int cantidadIntentos = 0;
    private int limiteInferior = 1;
    private int limiteSuperior = 500;

    public Descubrir_numero() {
    }

    public int getNum() {
        return num;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public void setNum(int num) {
        this.num = num;

    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    @Override
    public String toString() {
        return "Descubrir_numero{" +
                "num=" + num +
                ", aleatorio=" + aleatorio +
                ", cantidadIntentos=" + cantidadIntentos +
                '}';
    }

    public void validarNumero(int num) throws NumeroFueraDeRangoException {
        if (num < 1 || num > 500) {
            throw new NumeroFueraDeRangoException(
                    "El número debe estar entre 1 y 500."
            );
        }
    }

    public boolean adivino() {
        return num == aleatorio;
    }

    public void jugar() {
        cantidadIntentos++;

        if (num < aleatorio) {
            System.out.println("El número secreto es mayor.");
            if (limiteInferior < num) {
                limiteInferior = num + 1;
            }

        } else if (num > aleatorio) {
            System.out.println("El número secreto es menor.");
            if (limiteSuperior > num) {
                limiteSuperior = num - 1;
            }
        } else {
            System.out.println("¡Felicitaciones! Adivinaste el número.");
            System.out.println("Cantidad de intentos: " + cantidadIntentos);
            return;
        }
        int sugerido = (limiteInferior + limiteSuperior) / 2;
        System.out.println("Sugerido: " + sugerido);
    }

}
