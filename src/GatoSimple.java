import java.util.ArrayList;


public class GatoSimple {

  // atributos
  
  String nombre;
  String color;
  String raza;
  String sexo;
  
  int    edad;
  double peso;
  
  
  // constructor
  GatoSimple (String n, String c, String r, String s, int e, double p) {
	  this.nombre=n;
	  this.color=c;
	  this.raza=r;
	  this.sexo = s;
	  this.edad=e;
	  this.peso=p;
  }
  
  // getter
  public String getSexo() {
    return this.sexo;
  }
  

  public  void maulla() {
    System.out.println("Miauuuu");
  }


  public void ronronea() {
    System.out.println("mrrrrrr");
  }
  
 
  public void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

 
  public void peleaCon(GatoSimple contrincante) {
    if (this.sexo.equals("hembra")) {
      System.out.println("no peleo");
    } else {
      if (contrincante.getSexo().equals("hembra")) {
        System.out.println("no peleo contra hembras");
      } else {
        System.out.println("te reviento");
      }
    }
  }
  
  public String toString() {
	  
	  return "Soy " + nombre +  " de raza "  +raza + " y color " + color+ " de sexo " + sexo + ". Además tengo " + edad + " años y peso " + peso + " kg";
  }

  
  

}

