package calculadorafinal;

public class calc_poo {


		// TODO Auto-generated method stub
	public class Calculadora {
	    //Atributos
	    public double iOperadorA;
	    public double iOperadorB;
	    //Constructor Vazio
	    public Calculadora()
	    {
	        this.iOperadorA = 10;
	        this.iOperadorB = 8;
	    }
	//Constructor
	    public Calculadora(double iOperadorA, double iOperadorB) {
	        this.iOperadorA = iOperadorA;
	        this.iOperadorB = iOperadorB;
	    }

	    public double getiOperadorA() {
	        return iOperadorA;
	    }

	    public void setiOperadorA(double iOperadorA) {
	        this.iOperadorA = iOperadorA;
	    }

	    public double getiOperadorB() {
	        return iOperadorB;
	    }

	    public void setiOperadorB(double iOperadorB) {
	        this.iOperadorB = iOperadorB;
	    }
	    
	    
	    public double Suma()
	    {
	        return iOperadorA + iOperadorB;
	    }
	    
	    public double Resta()
	    {
	        return iOperadorA - iOperadorB;
	    }
	    
	    public double Multiplicacion()
	    {
	        return iOperadorA * iOperadorB;
	    }
	    
	    public double Division()
	    {
	         return iOperadorA / iOperadorB;
	    }

	    public void Resultado(){
	        System.out.println("dav_branch");
	        System.out.println(Suma());
	        System.out.println(Resta());
	        System.out.println(Multiplicacion());
	        System.out.println(Division());
	    }
	

}
