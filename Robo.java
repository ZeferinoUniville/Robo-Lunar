import java.util.Scanner;
public class Robo {

    public int bateria = 100;
    public boolean sair = false;
    public String metros = "";
    public String graus = "";

    public int getBateria() {
        return bateria;
    }

    public void setBateria() {
        this.bateria -= 10;
    }

    public void Photo() {
        setBateria();
        System.out.println("\n O Robo Lunar Tirou uma Foto e gastou 10% da sua bateria total, a bateria esta em "+ getBateria() + "% ");
        System.out.println("------------------------------------------------------------------------------------------ \n");
    }

    public void Rigth() {
        setBateria();
        System.out.println(" Quantos graus o robo deve girar para a direita ? \n");
        Scanner leitor = new Scanner (System.in);
        graus = leitor.nextLine();
        System.out.println("\n O Robo Lunar Virou "+ graus +"° pra Direita e gastou 10% da sua bateria total, a bateria esta em "+ getBateria() + "% ");
        System.out.println("------------------------------------------------------------------------------------------ \n");
    }
    
    public void Left() {
        setBateria();
        System.out.println(" Quantos graus o robo deve girar para a esquerda ? \n");
        Scanner leitor = new Scanner (System.in);
        graus = leitor.nextLine();
        System.out.println("\n O Robo Lunar Virou "+ graus +"° pra Esquerda e gastou 10% da sua bateria total, a bateria esta em "+ getBateria() + "% ");
        System.out.println("------------------------------------------------------------------------------------------ \n");
    }

    public void Back() {
        setBateria();
        System.out.println(" Quantos centímetros o robo deve Retroceder? \n");
        Scanner leitor = new Scanner (System.in);
        metros = leitor.nextLine();
        System.out.println("\n O Robo Lunar Andou "+ metros +" centímetro(s) para Trás e gastou 10% da sua bateria total, a bateria esta em "+ getBateria() + "% ");
        System.out.println("------------------------------------------------------------------------------------------ \n");
    }

    public void Front() {
        setBateria();
        System.out.println(" Quantos centímetros o robo deve avançar? \n");
        Scanner leitor = new Scanner (System.in);
        metros = leitor.nextLine();
        System.out.println("\n O Robo Lunar Andou "+ metros +" centímetro(s) para Frente e gastou 10% da sua bateria total, a bateria esta em " + getBateria() + "% ");
        System.out.println("------------------------------------------------------------------------------------------ \n");
    }

}