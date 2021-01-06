package dev.smartpanda.campoMinado.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.smartpanda.campoMinado.modelo.Campo;

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

}
