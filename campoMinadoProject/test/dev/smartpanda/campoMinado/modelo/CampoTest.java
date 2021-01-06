package dev.smartpanda.campoMinado.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.smartpanda.campoMinado.excecao.ExplosaoException;

public class CampoTest{
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoRealDist1Cima() {
		Campo vizinho = new Campo(2,3);
		boolean result = campo.addVizinho(vizinho);

		assertTrue(result);
		}
	
	@Test
	void testeVizinhoRealDist1Direita() {
		Campo vizinho = new Campo(3,4);
		boolean result = campo.addVizinho(vizinho);		
		assertTrue(result);
	}
	
	@Test
	void testeVizinhoRealDist1Embaixo() {
		Campo vizinho = new Campo(4,3);
		boolean result = campo.addVizinho(vizinho);		
		assertTrue(result);		
	}
	
	@Test
	void testeVizinhoRealDist1Esquerda() {
		Campo vizinho = new Campo(3,2);
		boolean result = campo.addVizinho(vizinho);		
		assertTrue(result);		
	}
	
	@Test
	void testeVizinhoRealDist2CimaEsq() {
		Campo vizinho = new Campo(2,2);
		boolean result = campo.addVizinho(vizinho);		
		assertTrue(result);		
	}
	
	@Test
	void testeVizinhoRealDist2CimaDir() {
		Campo vizinho = new Campo(2,4);
		boolean result = campo.addVizinho(vizinho);		
		assertTrue(result);		
	}
	
	@Test
	void testeVizinhoRealDist2EmbaixoEsq() {
		Campo vizinho = new Campo(4,2);
		boolean result = campo.addVizinho(vizinho);		
		assertTrue(result);		
	}
	
	@Test
	void testeVizinhoRealDist2EmbaixoDir() {
		Campo vizinho = new Campo(4,4);
		boolean result = campo.addVizinho(vizinho);		
		assertTrue(result);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(5,4);
		boolean result = campo.addVizinho(vizinho);			
		assertFalse(result);		
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoDuplo() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrirCampo());
	}

	@Test
	void testeAbrirMarcadoNaoMinado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrirCampo());
	}
	
	@Test
	void testeAbrirMarcadoMinado() {
		campo.alternarMarcacao();
		campo.minarCampo();
		assertFalse(campo.abrirCampo());
	}
	
	@Test
	void testeAbrirNaoMarcadoMinado() {
		campo.minarCampo();
		assertThrows(ExplosaoException.class, () ->{
			campo.abrirCampo();
		});
	}
	
	@Test
	void testeAbrirComVizinhos() {
		Campo campo11= new Campo (1,1);
		Campo campo22 = new Campo(2,2);
		campo22.addVizinho(campo11);
		campo.addVizinho(campo22);
		campo.abrirCampo();
		
		assertTrue(campo22.isCampoAberto() && campo11.isCampoAberto());
		
		
	}
	
	@Test
	void testeAbrirComVizinhoMinado() {
		Campo campo11= new Campo (1,1);
		
		Campo campo12= new Campo (1,2);
		campo12.minarCampo();
		
		Campo campo22 = new Campo(2,2);
		campo22.addVizinho(campo11);
		campo22.addVizinho(campo12);
		
		
		campo.addVizinho(campo22);
		campo.abrirCampo();
		
		assertTrue(campo22.isCampoAberto() && campo11.isCampoFechado());
		
		
	}

}
