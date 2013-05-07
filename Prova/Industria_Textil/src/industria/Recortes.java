package industria;
import java.util.ArrayList;



public class Recortes {
	private static ArrayList<Retangulo> listarecortes;
	private String material;
	private Retangulo materiaPrima;
	private Retangulo area;



	public Recortes(String material, Retangulo materiaPrima, Retangulo area) {
		listarecortes= new ArrayList<Retangulo>();
		this.material = material;
		this.materiaPrima = materiaPrima;
		this.area = area;

	}



	public static ArrayList<Retangulo> getListarecortes() {
		return listarecortes;
	}



	public static void setListarecortes(ArrayList<Retangulo> listarecortes) {
		Recortes.listarecortes = listarecortes;
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}



	public Retangulo getMateriaPrima() {
		return materiaPrima;
	}



	public void setMateriaPrima(Retangulo materiaPrima) {
		this.materiaPrima = materiaPrima;
	}




    public Retangulo getArea() {
		return area;
	}


	public void cortesFeitos(){

    	//listarecortes.add(); //TODO

    }

}
