public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programa funcionando");
        System.out.println("Nombre = Jaime Loja");

        runEjercicosPD();
    }
//-----------------------------------------------------------------------------
    private static void runEjercicosPD(){
        EjerciciosPD ePD = new EjerciciosPD();
//-----------------------------------------------------------------------------
        System.out.println("Fibonacci recursivo");

        long start = System.nanoTime();
        System.out.println("Valor= 100");
        long resultado = ePD.getFibonaci(100);
        long end = System.nanoTime();
        long tiempo = end - start;

        System.out.println("Resultado: " + resultado + ", tiempo: " + tiempo);
//-----------------------------------------------------------------------------
        System.out.println("Fibonacci recursivo con caching");

        start = System.nanoTime();
        System.out.println("Valor= 100");
        resultado = ePD.getFibonaciPD(100);
        end = System.nanoTime();
        tiempo = end - start;

        System.out.println("Resultado: " + resultado + ", tiempo: " + tiempo);
//-----------------------------------------------------------------------------
    }
}
