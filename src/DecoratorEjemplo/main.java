package DecoratorEjemplo;

public class main {

    public static void main(String[] args) {
        Reloj relojsimple1 = new RelojSimple();
        relojsimple1.CrearFuncionalidad();
        System.out.println("\n------------------");

        Reloj relojdeportivo1 = new RelojDeportivoDecorador(new RelojSimple());
        relojdeportivo1.CrearFuncionalidad();
        System.out.println("\n------------------");

        Reloj relojdeportivodelujo1 = new RelojDeLujoDecorador(new RelojDeportivoDecorador(new RelojSimple()));
        relojdeportivodelujo1.CrearFuncionalidad();
        System.out.println("\n------------------");

        Reloj relojdelujo1 = new RelojDeLujoDecorador(new RelojSimple());
        relojdelujo1.CrearFuncionalidad();



    }

}
