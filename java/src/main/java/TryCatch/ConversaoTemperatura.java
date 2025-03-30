package TryCatch;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoTemperatura {
    double temp, fhr;

    public ConversaoTemperatura() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Temperatura (ºC): ");
            this.temp = sc.nextDouble();
            if(temp < -273.15) {
                throw new TemperaturaInvalidaException();
            }
            this.fhr = (this.temp * 1.8) + 32;
            System.out.println("Temperatura (ºF): " + this.fhr);
        } catch(TemperaturaInvalidaException e) {
            System.out.println("Erro! Temperatura abaixo do zero absoluto.");
        }
    }
}
