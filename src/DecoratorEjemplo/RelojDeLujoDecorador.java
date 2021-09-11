package DecoratorEjemplo;

public class RelojDeLujoDecorador extends DecoradorReloj{

    public RelojDeLujoDecorador(Reloj reloj) {
        super(reloj);
    }

    private void AñadirImpermeabilidad(){
        System.out.println("- Impermeabilidad");
    }

    private void AñadirCargaRapida(){
        System.out.println("- Carga Rápida");
    }

    private void AñadirNFC(){
        System.out.println("- NFC, campo de comunicación cercano");
    }


    @Override
    public void CrearFuncionalidad() {
        super.CrearFuncionalidad();
        System.out.println("mas características de Reloj de Lujo (Decorador)");
        this.AñadirImpermeabilidad();
        this.AñadirCargaRapida();
        this.AñadirNFC();

    }
}
