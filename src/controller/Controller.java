/*
 RESUMO		  : Classe de comandos do histórico de navegação
 PROGRAMADORA : Luiza Felix
 DATA		  : 15/04/2023
 */

package controller;

import view.Principal;

public class Controller {
	
	public static void adicionar(String site) {
		if (site.contains("https://www.")) {
			if(site.contains(".com")||site.contains(".org")|| site.contains(".io")) {
				Principal.historico.push(site);
				System.out.println(site + " adicionado ao histórico.");
			} else {
				System.err.println("ERRO: " + site +" inválido. Checar termicação do endereço.");
			}
		}else {
			System.err.println("ERRO: " + site +" inválido. sem 'https://www.'");
		}
	}
	public static void remover() {
		try {
			System.out.println((String) Principal.historico.pop() + " removido do histórico.");
		} catch (Exception e) {
			System.err.println("ERRO: NÃO HÁ endereços no histórico.");
		}
	}
	
	public static void visualizar() {
		try {
			System.out.println((String) Principal.historico.top() + " é o endereço mais recente.");
		} catch (Exception e) {
			System.err.println("ERRO: NÃO HÁ endereços no histórico.");
		}
	}
	

}
