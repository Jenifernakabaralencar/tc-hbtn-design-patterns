import java.util.UUID;

public class CalculadorSalarioService {
    private static CalculadorSalarioService instancia;
    public UUID uuid = UUID.randomUUID();

    private CalculadorSalarioService() {
    }

    public static CalculadorSalarioService getCalculadorSalarioService(){
        if (CalculadorSalarioService.instancia == null){
            CalculadorSalarioService.instancia = new CalculadorSalarioService();
        }
        return CalculadorSalarioService.instancia;
    }

    public double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        return salarioBruto - valorDescontos + (valorVendas * (percentualComissao / 100));
    }
}
