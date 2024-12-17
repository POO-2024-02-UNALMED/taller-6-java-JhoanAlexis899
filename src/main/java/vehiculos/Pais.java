package vehiculos;
import java.util.ArrayList;
public class Pais {
	
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String s) {
		this.nombre = s;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public static void anadir(Pais p) {
		Pais.paises.add(p);
	}
	
	public static int cantidadPais(Pais pais) {
		int vendidos = 0;
		for (int i = 0; i<paises.size();i++) {
			if (paises.get(i) == pais) {
				vendidos++;
			}
		}
		return vendidos;
	}
	
	public static Pais paisMasVendedor() {
		Pais masVendedor = paises.get(0);
		int vendio = Pais.cantidadPais(masVendedor);
		for (int i = 0; i<paises.size();i++) {
			if (paises.get(i) != masVendedor) {
				int otroVendedor = Pais.cantidadPais(paises.get(i));
				if (otroVendedor > vendio) {
					masVendedor = paises.get(i);
					vendio = otroVendedor;
				}
			}	
		}
		return masVendedor;
	}
	
}