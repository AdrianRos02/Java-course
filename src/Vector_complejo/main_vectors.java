package Vector_complejo;

import java.util.Random;

public class main_vectors {

	public static void main(String[]args){
		
		double OperaNumerosuma=0;
		double OperaNumeroImaSuma=0;
		
		double OperaNumeroResta=1;
		double OperaNumeroImaResta=1;
		
		double OperaNumeroDivision=1;
		double OperaNumeroImaDivision=1;
		
		double OperaNumeroMulti=1;
		double OperaNumeroImaMulti=1;
		
		claseCalc vectorc[]=new claseCalc[10];
		
		for(int i=0;i<vectorc.length;i++) {
			double n1,n2;
			n1=Math.random();
			n2=Math.random();
			
			vectorc[i]=new claseCalc(n1,n2) ;
			
			
			
		}
		//suma real
		
		for(int i=0;i<vectorc.length;i++) {
			OperaNumerosuma=vectorc[i].getr()+OperaNumerosuma;
			
		}
		System.out.println("suma: "+OperaNumerosuma);
		
		//suma imaginario
		for(int i=0;i<vectorc.length;i++) {
			OperaNumeroImaSuma=vectorc[i].geti()+OperaNumeroImaSuma;
			
		}
		System.out.println("suma imagin: "+OperaNumeroImaSuma+"i");
		
		//resta real
		
				for(int i=0;i<vectorc.length;i++) {
					OperaNumeroResta=vectorc[i].getr()-OperaNumeroResta;
					
				}
				System.out.println("resta: "+OperaNumeroResta);
				
		//resta imaginario
				for(int i=0;i<vectorc.length;i++) {
					OperaNumeroImaResta=vectorc[i].geti()-OperaNumeroImaResta;
					
				}
				System.out.println("resta imagin: "+OperaNumeroImaResta+"i");
				
		//division real
				
				for(int i=0;i<vectorc.length;i++) {
					OperaNumeroDivision=vectorc[i].getr()/OperaNumeroDivision;
					
				}
				System.out.println("division: "+OperaNumeroDivision);
				
		//division imaginario
				for(int i=0;i<vectorc.length;i++) {
					OperaNumeroImaDivision=vectorc[i].geti()/OperaNumeroImaDivision;
					
				}
				System.out.println("division imagin: "+OperaNumeroImaDivision+"i");
		
				
		//multiplicacion real
				
				for(int i=0;i<vectorc.length;i++) {
					OperaNumeroMulti=vectorc[i].getr()*OperaNumeroMulti;
					
				}
				System.out.println("multi : "+OperaNumeroDivision);
				
		//multiplicacion imaginario
				for(int i=0;i<vectorc.length;i++) {
					OperaNumeroImaMulti=vectorc[i].geti()*OperaNumeroImaMulti;
					
				}
				System.out.println("multi imagin: "+OperaNumeroImaMulti+"i");	
		
	/*	for(int i=0;i<vectorc.length;i++) {
			System.out.println(vectorc[i].getr()+" "+vectorc[i].geti()+"i");
		}
	*/	
		
		
		
	}
}
