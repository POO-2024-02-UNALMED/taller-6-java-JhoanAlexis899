package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, 
			String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Pais.anadir(this.fabricante.getPais());
		Fabricante.anadir(this.fabricante);
		Vehiculo.cantidadVehiculos++;
	}
	public String getPlaca() {return this.placa;}
	
	public int getPuertas() {return this.puertas;}
	
	public int getVelocidadMaxima() {return this.velocidadMaxima;}
	
	public String getNombre(){return this.nombre;}
	
	public int getPrecio() {return this.precio;}
	
	public int getPeso() {return this.peso;}
	
	public String getTraccion() {return this.traccion;}
	
	public Fabricante getFabricante() {return this.fabricante;}
	
	public void setPlaca(String p) {this.placa = p;}
	
	public void setPuertas(int p) {this.puertas = p;}
	
	public void setVelocidadMaxima(int v) {this.velocidadMaxima = v;}
	
	public void setNombre(String n) {this.nombre = n;}
	
	public void setPrecio(int p) {this.precio = p;}
	
	public void setPeso(int p) {this.peso = p;}
	
	public void setTraccion(String t) {this.traccion = t;}
	
	public void setFabricante(Fabricante f) {this.fabricante = f;}
	
	public static int getCantidadVehiculos() {
		return Vehiculo.cantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int c) {
		Vehiculo.cantidadVehiculos = c;
	}
	
	public static String vehiculosPorTipo() {
		String camionetas = String.valueOf(Camioneta.getCantidadCamionetas());
		String automoviles = String.valueOf(Automovil.getCantidadAutomoviles());
		String camiones = String.valueOf(Camion.getCantidadCamiones());
		return "Automoviles: "+automoviles+"\n"+"Camionetas: "+camionetas+"\n"+
				"Camiones: "+camiones;
	}
	
}
