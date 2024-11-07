package pratica1;
import javax.swing.*;
public class Telas {
    private String nome;

    private void tela1(){
        nome = JOptionPane.showInputDialog(null,"Qual é o seu nome?","Inserir nome",3);
    }

    private void tela2(){
        JOptionPane.showMessageDialog(null, "Olá "+nome+",seja bem vindo ao módulo de interfaces gráficas no Java!", "mensagem", 1);
    }

    private void tela3(){
        String[] opcoes = {"Sim","Não"};
        int resposta = JOptionPane.showOptionDialog(null, nome+"! Você gosta de progamar?", "Insira uma opção", 0, 3, null, opcoes, opcoes);
        if(resposta == 0){
            JOptionPane.showMessageDialog(null, "Então estude bem o Java Swing. Ele pode abrir varias portas para você", "Mensagem", 1);
        }else if(resposta == 1){
            JOptionPane.showMessageDialog(null, "Que pena. Mas com as janelas você vai gostar","Mensagem", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Algo saiu errado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void tela4(){
        String[] opcoes = {"Sim - Objeto é legal","Não - Objeto é sofrimento","Talvez -  quero aprender"};
        int resposta = JOptionPane.showOptionDialog(null, "Lembrete, aqui no java swing tudo é objeto, você gosta disso?","Atenção", 2, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes);
        if(resposta == 0){
            JOptionPane.showMessageDialog(null, "Ótimo, todos os objetos são objetos!", "Mensagem", 1);
        }else if(resposta == 1){
            JOptionPane.showMessageDialog(null, "Não se preocupe. Você irá aprender a importância dos objetos!", "Mensagem", 1);
        }else if(resposta == 2){
            JOptionPane.showMessageDialog(null, "Sim ocê aprenderá", "Mensagem", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Algo saiu errado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void inicar(){
        tela1();
        tela2();
        tela3();
        tela4();
    }


}
