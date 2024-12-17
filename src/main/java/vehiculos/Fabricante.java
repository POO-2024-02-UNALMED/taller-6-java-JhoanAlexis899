package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String s, Pais p) {
		this.nombre = s;
		this.pais = p;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public Pais getPais() {
		return this.pais;
	}
	
	public void setPais(Pais p) {
		this.pais = p;
	}
	
	public static void anadir(Fabricante f) {
		Fabricante.fabricantes.add(f);
	}
	
	public static int cantidadFabricante(Fabricante fabricante) {
		int vendidos = 0;
		for (int i = 0; i<fabricantes.size();i++) {
			if (fabricantes.get(i) == fabricante) {
				vendidos++;
			}
		}
		return vendidos;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante masVentas = fabricantes.get(0);
		int vendio = Fabricante.cantidadFabricante(masVentas);
		for (int i = 0; i<fabricantes.size();i++) {
			if (fabricantes.get(i) != masVentas) {
				int otroVendedor = Fabricante.cantidadFabricante(fabricantes.get(i));
				if (otroVendedor > vendio) {
					masVentas = fabricantes.get(i);
					vendio = otroVendedor;
				}
			}	
		}
		return masVentas;
	}
	
}
