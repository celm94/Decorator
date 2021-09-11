package DecoratorEjemplo;

public class RelojDeportivoDecorador extends DecoradorReloj{


    public RelojDeportivoDecorador(Reloj reloj) {
        super(reloj);
    }

    private void AñadirPodometro(){
        System.out.println("- Podómetro: contador de pasos");
    }
    private void AñadirModoSueño(){
        System.out.println("- Modo de Sueño: monitorear calidad de sueño");
    }

    @Override
    public void CrearFuncionalidad() {
        super.CrearFuncionalidad();
        System.out.println("mas características de Reloj Deportivo (Decorador)");
        this.AñadirModoSueño();
        this.AñadirPodometro();
    }
}
