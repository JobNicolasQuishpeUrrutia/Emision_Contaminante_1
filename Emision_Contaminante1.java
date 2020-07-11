/*
  Diseño e implementacion de un algoritmo que le permita
  Disminuir las emisiones contaminantes de un motor de combustiòn interna
 */
package emision_contaminante1;

/*
    @author Quishpe Urrutia Job Nicolas
 */
import java.util.Scanner;
public class Emision_Contaminante1 {

    public static int Determinar_modelo_motor(){
        Scanner sc = new Scanner(System.in);
        int potencia_motor;
        int cilindrada;
        int torque_maximo;
        System.out.print("Ingrese las caracteristicas del Motor de Combustión Interna \n");
        System.out.print("Para Determinar el modelo del motor: \n");
        System.out.print("Potencia motor (Hp): ");
        potencia_motor = sc.nextInt();
        System.out.print("Cilindrada (cc): ");
        cilindrada = sc.nextInt();
        System.out.print("Torque máximo (Nm): ");
        torque_maximo = sc.nextInt();
        
        if(potencia_motor==100 && cilindrada==1597 && torque_maximo==138 ){
        System.out.print("El codigo del motor que coincide con las especificaciones es: ");
        System.out.print("Z16SE 2005 \n");
        
        } else{
                System.out.println("No existe un Modelo de Motor-Combustión interna con las especificaciones seleccionadas");
                } 
        return potencia_motor;
    }
   
    public static int Variar_velocidad_motor(){
        Scanner sc = new Scanner(System.in);
        int maxima_potencia;
        double maxima_velocidad;       // Velocidad angular maxima
        int maximo_torque;
        int na;                 // Para convertir Hp a Watts
      
        System.out.println("Ingrese la máxima potencia del motor en Watts:");// 74570
        maxima_potencia = sc.nextInt();
        System.out.println("Ingrese el valor del torque:" ); //138
        maximo_torque = sc.nextInt();
        maxima_velocidad=maxima_potencia/maximo_torque;
        System.out.println("El motor puede varia su velocidad hasta:" +maxima_velocidad+ "rad/s"); // 540rad/s
        return maxima_potencia;
    }
    
    public static String Comprobar_datos_entrada(){
        Scanner sc = new Scanner(System.in);
        String datos_entrada = null;
        int flujo_combustible;
        int tiempo_admision;
        double apertura_valvulas;
        
        System.out.println("Ingrese el flujo de combustible:");  // 14
        flujo_combustible = sc.nextInt();
        System.out.println("Ingrese el tiempo de admisión:");  // 50
        tiempo_admision = sc.nextInt();
        System.out.println("% de apertura de vâlvula:"); //25
        apertura_valvulas = sc.nextInt();
        System.out.println("Los datos de entrada son :" +flujo_combustible+", "+tiempo_admision+ ","+apertura_valvulas);  
        return datos_entrada;
    }
    
    public static int Medir_emision_contaminante(){
        Scanner sc = new Scanner(System.in);
        int tipo_emision;
        int velocidad_respuesta;
        int cantidad_emision;
        
        String hidrocarburos;
        String mono_carb; 
        String ox_nitr;
        
        System.out.println("Los tipos de emisión son:");
        System.out.println("1. Hidrocarburos");
        System.out.println("2. Monóxido de carbono");
        System.out.println("3. Óxidos de Nitrógeno");
        
        System.out.println("Ingrese el tipo de emisión que se detecto:");
        tipo_emision = sc.nextInt();
        
        if(tipo_emision==1){
            System.out.println("Hidrocarburos");
        }
        if(tipo_emision==2){
            System.out.println("Monóxido de carbono");
        } 
        if(tipo_emision==3){
            System.out.println("Óxidos de Nitrógeno");
        } 
        if(tipo_emision>3){
            System.out.println("Opción no válida");
        } 
        System.out.println("Ingrese la velocidad de respuesta del analizador de gases:"); //1
        velocidad_respuesta = sc.nextInt();
        System.out.println("Porcentaje de la emisión contaminante:"); //40%
        cantidad_emision = sc.nextInt();
        return tipo_emision;
}
    
    public static String Utilizar_funcion_aproximacion(){
        Scanner sc = new Scanner(System.in);
        String entrada_red_neuronal;    
        String salida_red_neuronal;
            
        System.out.println("Ingrese las entradas de la red neuronal:"); //velocidad motor, flujo combustible
        entrada_red_neuronal = sc.next();
        System.out.println("Ingrese las salidas de la red neuronal:"); // HC, CO, NOx
        salida_red_neuronal= sc.next();
        
        return entrada_red_neuronal;
        }
     
    public static int Realizar_muestras_variables(){
        Scanner sc = new Scanner(System.in);
        int cantidad_muestras;
        int cantidad_muestras_validacion;
        
        System.out.println("Ingrese cantidad de muestras tomadas:"); // 60
        cantidad_muestras = sc.nextInt();
        System.out.println("Ingrese cantidad de muestras validadas:"); // 24
        cantidad_muestras_validacion = sc.nextInt();
        
        return cantidad_muestras;
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
       Determinar_modelo_motor();
       Variar_velocidad_motor();
       Comprobar_datos_entrada();
       Medir_emision_contaminante();
       Utilizar_funcion_aproximacion();
       Realizar_muestras_variables();
    }
}
