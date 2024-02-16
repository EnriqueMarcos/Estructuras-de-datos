package EstructuraDatos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PruebaPila {
	PabloPila<Integer> pila = new PabloPila<Integer>();
	
	@Test
	public void testPushNull() {
		PabloPila<Integer> pila = new PabloPila<>();
	    pila.push(1);
	    Assertions.assertEquals(1, pila.size());
	    Assertions.assertNull(pila.top());
	}

	@Test
	public void testPop() {
	    PabloPila<Integer> pila = new PabloPila<>();
	    pila.push(1);
	    int valor = pila.pop();    
	    Assertions.assertEquals(1, valor);
	    Assertions.assertTrue(pila.isEmpty());
	}

	@Test
	public void testTopVacia() {
		PabloPila<Integer> pila = new PabloPila<>();
	    Assertions.assertNull(pila.top());
	}

	@Test
	public void testEmptyVacia() {
		PabloPila<Integer> pila = new PabloPila<>();
	    Assertions.assertTrue(pila.isEmpty());
	}

	@Test
	public void testClearVacia() {
		PabloPila<Integer> pila = new PabloPila<>();
	    pila.clear();
	    Assertions.assertTrue(pila.isEmpty());
	}

	@Test
	public void testContainsNull() {
		PabloPila<Integer> pila = new PabloPila<>();
	    pila.push(1);
	    Assertions.assertFalse(pila.contains(null));
	}

	@Test
	public void testToArrayVacia() {
		PabloPila<Integer> pila = new PabloPila<>();
	    Object[] array = pila.toArray();
	    Assertions.assertNull(array);
	}

}
