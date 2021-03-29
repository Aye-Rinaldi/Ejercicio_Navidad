package ar.com.xeven;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        //CALCULAR CUANTOS DIAS FALTAN PARA NAVIDAD, A PARTIR DE MANIANA
        LocalDateTime laNavidad = LocalDateTime.of(2021,12,24,23,59);
        LocalDateTime unDia = LocalDateTime.now().plusDays(1); //maniana

        if (unDia.isAfter(laNavidad)){ //pregunto si maniana es dp de navidad
            System.out.println("Ya paso la Navidad.");
        } else {
            int diasParaNavidad = laNavidad.getDayOfYear() - unDia.getDayOfYear();
            long diasQueFaltan = Duration.between(unDia,laNavidad).toDays(); //otra forma de hacerlo
            System.out.println("Todavia faltan "+diasParaNavidad+" dias para Navidad.");
            System.out.println("Faltan "+diasQueFaltan);
        }



    }
}
