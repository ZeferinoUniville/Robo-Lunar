import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Robo robo = new Robo();

        robo.bateria = 100;
        String escolha = "";

        do{
            if (robo.bateria > 10){
                System.out.println("--------------------------------------------");
                System.out.println("Qual é o Próximo movimento do Robo Lunar?: (O Caps Lock deve estar ativo para comandar o Robo)");
                System.out.println("============================================");
                System.out.println(" W    - Andar pra Frente");
                System.out.println(" A    - Virar pra Esquerda");
                System.out.println(" S    - Andar pra Trás");
                System.out.println(" D    - Virar pra Direita");
                System.out.println(" F    - Tirar Foto");
                System.out.println(" ESC  - Para sair do acesso remoto ao robo");
                System.out.println("============================================\n");
                Scanner leitor = new Scanner (System.in);
                escolha = leitor.nextLine();

                switch (escolha) {
                    case "W":
                        robo.Front();
                        break;
                    case "A":
                        robo.Left();
                        break;
                    case "S":
                        robo.Back();
                        break;
                    case "D":
                        robo.Rigth();
                        break;
                    case "F":
                        robo.Photo();
                        break;
                    case "ESC":
                        System.out.println("\nDesconectando do Robo Lunar.......\n");
                        robo.sair = true;
                        break;
                    default:
                        System.out.println(" Esta não é uma função que o Robo Lunar saiba executar");                
                }
            }else if(robo.bateria >= 10){
                System.out.println(" O Robo Lunar está com 10% ou menos de sua bateria, entrando em modo de ibernação e preparando painéis solares para recarga ");
                System.out.println("* Passam se 3 dias * \n");
                robo.bateria = 100;
            }
        }while(robo.sair != true); 
    }
}