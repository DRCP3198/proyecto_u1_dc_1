package com.example.demo.deberTradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BoletoViaje viaje = new BoletoViaje();
     System.out.println("AEROLINEA AVIANCA");
     System.out.println("-------------------");
     viaje.agendar("2509",LocalDateTime.of(2022,12,2,8,30), 1250, "12587", "Dillan Pozo",25, "1752478417", "Quito-Hungria", "A");
    
     System.out.println();
     viaje.agendar("2802",LocalDateTime.of(2022,12,25,16,30), 900, "1007", "Juan Hurtado",12, "1052428411", "Guayaquil-Tokio", "N");
     
     System.out.println();
     viaje.agendar("1052",LocalDateTime.of(2022,12,31,17,30), 2000, "12337", "Jose Coloma",65, "17186724581", "Quito-New York", "TE");
	}

}
