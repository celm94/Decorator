package DecoratorEjemplo;

public class RelojSimple implements Reloj{


    private void AñadirTemporizador(){
        System.out.println("- Temporizador");
    }

    @Override
    public void CrearFuncionalidad() {
        System.out.println("Reloj básico");
        this.AñadirTemporizador();
    }
}
