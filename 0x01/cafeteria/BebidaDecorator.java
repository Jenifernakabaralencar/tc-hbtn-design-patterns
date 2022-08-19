import java.util.ArrayList;
import java.util.List;

public class BebidaDecorator extends Bebida{
    private final Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public List<String> obterIngredientes() {
         return this.bebidaDecorada.obterIngredientes();
    }

    @Override
    public double obterPreco() {
        return this.bebidaDecorada.obterPreco();
    }
}
