package industria;
import java.util.Scanner;
// import java.util.ArrayList;

public class TextilApp {

     // private static ArrayList<Retangulo> listarecortes;
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double result = 0;
        double base;
        double lado;
        double altura;
        int op;



        Scanner scanf = new Scanner(System.in);
        System.out.println("Insira o tamanho do tecido.");
        System.out.println("Digite a Base");

        base = scanf.nextDouble();


        System.out.println("Digite a Altura");
        altura = scanf.nextDouble();


        Retangulo r = new Retangulo(base, altura);




    System.out.println("Area: " + r.getArea());

do{
    System.out.println("Selecione a opção 1 para quadrado 2 para circulo.");
    op = scanf.nextInt();
    switch (op) {
        case 1:
            System.out.println("Digite o lado do quadrado");

            lado  = scanf.nextDouble();
            try{
            Figura quadrado = new Figura(lado);
            System.out.println("Area: " + quadrado.getArea());
            System.out.println("resultad: " + result);

            result = (r.getArea() - quadrado.getArea());

            System.out.println("Sobra do recorte: "  + result);
            r.setArea(result);
            }catch(RuntimeException error){

                System.out.println("erro");
                System.out.println(error.toString());
                scanf.close();
            }

            break;

        case 2:
            double raio;
            System.out.println("Digite o Raio do Circulo");


            raio = scanf.nextDouble();
            try{
            Circulo circulo = new Circulo(raio);

            System.out.println("Area: " + circulo.getArea());



            result = (r.getArea() - circulo.getArea());

            System.out.println("Sobra do recorte: "  + result);
            r.setArea(result);
            }catch(RuntimeException error){

                System.out.println("erro");
                System.out.println(error.toString());
                scanf.close();
            }
            break;
    }

}while(true);
    }

}
