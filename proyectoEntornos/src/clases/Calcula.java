package clases;

public class Calcula {
    public int resultado;
    private int num1;
    private int num2;
    private String operacion;
    
    public int calcular(int n1, int n2, String paramOperacion){
        num1 = n1;
        num2 = n2;
        operacion = paramOperacion;
        switch(operacion){
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicacion":
            case "multiplicación":
                resultado = num1 * num2;
                break;
            case "division":
            case "división":
                resultado = num1 / num2;
                break;
            default:
                resultado = 0;
                break;
        }
        return resultado;
    }
}
