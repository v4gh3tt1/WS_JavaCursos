package dev.smartpanda.campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;

import dev.smartpanda.campoMinado.excecao.ExplosaoException;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean campoAberto = false;
	private boolean campoMinado = false;
	private boolean campoMarcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	public Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;		
		}
		
		boolean addVizinho (Campo vizinho) {
			boolean isLinhaDiferente = linha != vizinho.linha; // teste se a linha � difereten, se for igual � horizontal
			boolean isColunaDiferente = coluna !=vizinho.coluna; // teste se a coluna � diferete, se for igual � vertical
			boolean isDiagonal = isLinhaDiferente && isColunaDiferente; /*sera diagonal se nao for mesma linha e nao for mesma coluna
																		* isDiagonal = false => vertical/horizontal (DeltaGeral=1) 
																		* na horizontal/vertical, para ser vizinho, o deltaGeral (soma de daltas) deve ser sempre 01 (um)
																		* isDiagonal = true => (DeltaGeral=2) 
																		* na diagonal, para ser vizinho, o deltaGeral (soma de daltas) deve ser sempre 02 (dois)
																		*/
			int deltaLinha = Math.abs(linha - vizinho.linha); // testa diferenca (distancia) absoluta entre as celulas em linha
			int deltaColuna = Math.abs(coluna - vizinho.coluna); // testa diferenca (distancia) absoluta entre as celulas em colunas
			
			int deltaGeral = deltaColuna + deltaLinha; /* dois cenarios possiveis para ser vizinho
														* a) diagonal e deltaGeral = 2 => vizinho:true
														* b) horizontal/vertical e deltaGeral = 1 => vizinho:true
														*/
			// testando se � vizinho, adiciona caso true
			if (!isDiagonal && deltaGeral ==1) {
				vizinhos.add(vizinho);
				return true;
			} else if (isDiagonal && deltaGeral == 2) {
				vizinhos.add(vizinho);
				return true;
			}else {
			return false;
			}
		}

		// metodo para aternar entre campos marcados (bandeira) quando ainda fechados
		void alternarMarcacao() {
			if (!campoAberto) {
				campoMarcado = !campoMarcado;
			}
		}
		
		boolean abrirCampo() {
			if (!campoAberto && !campoMarcado) {
				campoAberto = true;
				
				if(campoMinado) { // caso marque uma mina
					throw new ExplosaoException();
				}
				
				if (vizinhacaSegura()) { // se o campo nao esta minado, o metodo abre os vizinhos, que testam novamente se � minado sucessivamente
					vizinhos.forEach(v -> v.abrirCampo());
				}
				
				return true; // caso tenha aberto o campo, retornara true
				
			} else {
			
			return false; // enquanto nao marcado para abrir, retorna false
			}
		}
		
		boolean vizinhacaSegura() { // verifica se nao h� campo minado nas proximidades (??)
			return vizinhos.stream().noneMatch(v -> v.campoMinado);
		}
		
		
		
}