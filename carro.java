import java.util.Scanner;

public class Cachorro{
	String nome;
  int idade;
	int maxFelicidade = 10;
	int felicidade = 0;
	int maxComer = 10;
	int comer = 0;
  int dormir = 10;
	
	void comer (int qtdComida) {
		if ( qtdComida <= maxComida) {
			System.out.println("Comendo"); 
			comida -= 1; }
		else if (qtdComida == 0) {
			System.out.println("Comeu tudo"); }
		}else{
      system.out.println("");
    
		
	void dormir (int qtdDormir) {
		if (qtdDormir < dormir && qntComida <= maxComida)
    qntDormir -= 1; 
			System.out.println("Cachorro dormiu");
    }
		  else if (qtdDormir == 0) {
			System.out.println("Cachorro está sem sono"); 
      }

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Cachorro cachorro = new Cachorro();
		cachorro.maxfelicidade = 10;
		cachorro.maxComida = 5;


  	}	}
