public class PedidoBuilder extends PedidoAbstractBuilder{
    private Pedido pedido = new Pedido();


    @Override
    public void setLanche(TipoLanche tipo) {

        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.LANCHE);
        item.setNome(tipo.name());
        pedido.adicionarItemDentroCaixa(item);

    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.BATATA);
        item.setNome(tamanho.name());
        pedido.adicionarItemDentroCaixa(item);
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.BRINDE);
        item.setNome(tipo.name());
        pedido.adicionarItemDentroCaixa(item);
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.BEBIDA);
        item.setNome(tipo.name());
        pedido.adicionarItemForaCaixa(item);
    }

    public Pedido build(){
        return new Pedido(this.pedido.getItensDentroCaixa(), this.pedido.getItensForaCaixa());
    }
}
