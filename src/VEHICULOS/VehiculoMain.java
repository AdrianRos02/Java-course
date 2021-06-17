package VEHICULOS;

import java.util.ArrayList;

public class VehiculoMain {

	public static void main(String[] args) {
		
		//OBJETOS
		//COCHE
		coches coche1 = new coches("Terrestre", "3532 fff", "Seat ", 4, true);
		coches coche2 = new coches("Terrestre", "3522 uuu", "bmw", 4, true);
		
		//MOTOS
		motos moto1 = new motos("Terrestre", "7544 ttt", "Indian", 2, "blanco");
		motos moto2 = new motos("Terrestre", "3444 ooo", "Brough", 2, "azul");
		
		//BARCOS
		barcos barco1 = new barcos("Acuatico", "4-TA-3-320-65", "Petrolero", 300, true);
		barcos barco2 = new barcos("Acuatico", "2-TY-5-325-86", "Pesca", 20, true);
		
		//SUBMARINOS
		submarino sub1 = new submarino("Acuatico", "576", "Typhoon", 200, 400);
		submarino sub2 = new submarino("Acuatico", "986", "Triomphant", 150, 400);
		
		//AVIONES
		aviones avion1 = new aviones("Aereo", "yp-ter", "Militar", 2, 20);
		aviones avion2 = new aviones("Aereo", "PO-WRW", "Militar", 4, 22);
		
		//HELICOPTEROS
		helicoptero heli1 = new helicoptero("Aereo", "TW-YRC", "Ataque", 4, 4);
		helicoptero heli2 = new helicoptero("Aereo", "EC-BTH", "Bombardero", 6, 6);
		
		//ARRAYLIST
		ArrayList <Vehiculos>listaVehiculos = new ArrayList <Vehiculos>();
		
		//AÑADIR OBJETOS A LA ARRAYLIST
		listaVehiculos.add(coche1);
		listaVehiculos.add(coche2);
		listaVehiculos.add(moto1);
		listaVehiculos.add(moto2);
		listaVehiculos.add(barco1);
		listaVehiculos.add(barco2);
		listaVehiculos.add(sub1);
		listaVehiculos.add(sub2);
		listaVehiculos.add(avion1);
		listaVehiculos.add(avion2);
		listaVehiculos.add(heli1);
		listaVehiculos.add(heli2);
		
		for (Vehiculos vehiculo : listaVehiculos) {
			System.out.println(vehiculo);
			System.out.println();
		}
	}

}
