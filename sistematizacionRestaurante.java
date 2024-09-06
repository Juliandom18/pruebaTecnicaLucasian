/*Un restaurante que se está sistematizando completamente quiere que se le elabore un programa que le imprima una factura de cobro para sus clientes teniendo en cuenta que por compras iguales o mayores a $200.000 se le otorgara un descuento del 15%, por compras iguales o superiores a $50.000 será un descuento del 2%, por compras iguales o superiores a $20.000 un descuento del 1.5% y por compras inferiores no habrá descuento, la factura debe llevar el valor del bono de descuento el total a pagar y un agradecimiento al comprador el cual debe ingresar su nombre. */



//Importacion necesaria para pedir datos por teclado
import java.util.Scanner;
//Importaciones adicionales para formatear los valores numéricos
import java.text.NumberFormat;
import java.util.Locale;


public class sistematizacionRestaurante {
    public static void main(String[] args) {
        //Pido el nombre del usuario por teclado y lo capturo en la variable "nombreCliente"
        Scanner entradaPorTeclado = new Scanner(System.in);
        System.out.println("¡ Hola, bienvenido al restaurante !\n");
        System.out.println("Por favor ingresa tu nombre aquí abajo: ");
        String nombreCliente = entradaPorTeclado.nextLine();
        
        double valorConsumido = 0;
        //Bloque try para controlar un posible error donde el usuario ingrese un tipo de dato erroneo
        try {
            System.out.println("Ahora por favor ingresa el valor de tu cuenta: ");
            double valorIngresado = entradaPorTeclado.nextDouble();
            valorConsumido = valorIngresado;

        } catch (Exception e) {
            System.out.println("Debes ingresar un valor numérico");
        }

        //Defino las variables para guardar los datos que luego serán mostrados
        double valorDescontado = 0;
        double valorTotalPorPagar = 0;

        //Sección de condicionales para determinar cuanto se le va a descontar dependiendo del valor consumido
        if (valorConsumido >= 200000) {
            valorDescontado = valorConsumido * 0.15;
            valorTotalPorPagar = valorConsumido - valorDescontado;
        }
        else if (valorConsumido >= 50000 && valorConsumido < 200000) {
            valorDescontado = valorConsumido * 0.02;
            valorTotalPorPagar = valorConsumido - valorDescontado;
        }
        else if (valorConsumido >= 20000 && valorConsumido < 50000) {
            valorDescontado = valorConsumido * 0.015;
            valorTotalPorPagar = valorConsumido - valorDescontado;
        }
        else {
            valorDescontado = 0;
            valorTotalPorPagar = valorConsumido - valorDescontado;
        }
        
        //Aquí formateo los valores numéricos para que sea más facil de leer
        NumberFormat formateador = NumberFormat.getInstance(Locale.getDefault());
        String valorDescFormateado = formateador.format(valorDescontado);
        String totalPagarFormateado = formateador.format(valorTotalPorPagar);

        //Por último se imprimen los mensajes de valor descontado, total a pagar y un agradecimiento con el nombre del cliente
        System.out.println("El valor del bono descontado es de: $" + (valorDescFormateado));
        System.out.println("El total a pagar es: $" + (totalPagarFormateado));
        System.out.println("¡ Muchas gracias por tu compra " + nombreCliente + "!");
    }
}
