public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche(4);
        miCoche.agregarPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");

        Coche nigger = new Coche(6);
        nigger.agregarPuerta();
        System.out.println("Mi coche tiene " + nigger.getNumPuertas() + " puertas.");


        int resultado = suma(10, 20, 30);
        System.out.println("El resultado es: " + resultado);
    }

    public static int suma(int num1, int num2, int num3) {
        // Realizando la suma de los tres números

        int resultado = num1 + num2 + num3;
        return resultado;

    }

    }
