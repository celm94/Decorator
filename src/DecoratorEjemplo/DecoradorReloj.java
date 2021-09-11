package DecoratorEjemplo;

public abstract class DecoradorReloj implements Reloj{

    private final Reloj reloj;

    public DecoradorReloj(Reloj reloj){
        this.reloj = reloj;
    }

    @Override
    public void CrearFuncionalidad() {
        this.reloj.CrearFuncionalidad();
    }


}
