package es.juana;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.juana.MetodosLista;

class TestDoubleLink {
	
	 private dobleLinkMetodos<Integer> lista = new dobleLinkMetodos<Integer>();
	 
	 
	 @BeforeEach
	    public void setUp() {
	        lista.add(5);
	        lista.add(25);
	        lista.add(30);
	    }
	
	 @Test
	 void testAdd() {
		 assertEquals("[5, 25, 30]", lista.toString());
		 
	 }
	 
	 @Test
	 void removeEle() {
		 Integer a = 5;
		 lista.remove(a);
		 assertEquals("[25, 30]", lista.toString());
		 
	 }
	 @Test
	 void removeEle2() {
		 Integer a = 25;
		 lista.remove(a);
		 assertEquals("[5, 30]", lista.toString());
		 
	 }
	
	
	
}
