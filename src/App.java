public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec  = new Recursividad();
        System.out.println(rec.factorial(5));
        System.out.println(rec.sumaConsecutivos(5));
        System.out.println(rec.potencia(5, 2));
        System.out.println(rec.sumaDigitos(456));
    }
}
