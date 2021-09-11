package DecoratorEjemplo;

public class main {

    public static void main(String[] args) {
        //---------1----------
        System.out.println("\n------------------");
        Reloj relojsimple1 = new RelojSimple();
        relojsimple1.CrearFuncionalidad();
        System.out.println("\n------------------");


        //---------2----------
        Reloj relojdeportivo1 = new RelojDeportivoDecorador(new RelojSimple());
        relojdeportivo1.CrearFuncionalidad();
        System.out.println("\n------------------");


        //---------3----------
        Reloj relojdeportivodelujo1 = new RelojDeLujoDecorador(new RelojDeportivoDecorador(new RelojSimple()));
        relojdeportivodelujo1.CrearFuncionalidad();
        System.out.println("\n------------------");

        Reloj relojdelujo1 = new RelojDeLujoDecorador(new RelojSimple());
        relojdelujo1.CrearFuncionalidad();
        System.out.println("\n------------------");

        Reloj dobledelux = new RelojDeLujoDecorador(new RelojDeLujoDecorador(new RelojSimple()));
        dobledelux.CrearFuncionalidad();






    }

}
