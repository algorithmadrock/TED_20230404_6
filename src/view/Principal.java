/*
 RESUMO		  : Classe de seleção do Histórico de Navegação
 PROGRAMADORA : Luiza Felix
 DATA		  : 15/04/2023
 */

package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhas.Pilha;
import controller.Controller;

public class Principal {
	
	public static Pilha historico = new Pilha();
	
	public static void main(String[] args) {
		int opcao = 0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Histórico de Navegação\n  1) Adicionar endereço\n  2) Excluir último acesso\n  3) Visualizar último acesso\n**Para SAIR insira 0."));
			switch(opcao) {
			case 1:
				String site = JOptionPane.showInputDialog("Digite o endereço a ser adicionado:");
				Controller.adicionar(site);
				break;
			case 2:
				Controller.remover();
				break;
			case 3:
				Controller.visualizar();
				break;
			case 0:
				System.out.println("Programa finalizado com Sucesso.");
				break;
			}
		}while (opcao != 0);
	}

}
