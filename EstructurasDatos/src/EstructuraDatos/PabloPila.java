package EstructuraDatos;

import java.util.Iterator;

public class PabloPila<T> implements Pila<T>{
	
	
	private Object[] pila;
	
	public PabloPila() {
		pila = new Object[2];
		
	}

	@Override
	public void push(T elemento) {
		for (int i = 0; i < pila.length; i++) {
			if (pila[i] == null) {
				pila[i] = elemento;
			}
		}
		
	}

	@Override
	public void pop() {
		for (int i = pila.length; i == pila.length; i--) {
			if (pila[i] != null) {
				pila[i] = null ;
				break;
			}
		}
	}

	@Override
	public T top() {
		for (int i = pila.length; i == pila.length; i--) {
			if (pila[i] != null) {
				return (T) pila[i];
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < pila.length; i++) {
			if (pila[i] == null) {
				return true;
			}
		}
		return false;
		
	}

	@Override
	public int size() {
		int contador = 0;
		for (int i = 0; i < pila.length; i++) {
			contador++;
			return contador;
		}
		return -1;
	}

	@Override
	public void clear() {
		for (int i = pila.length; i == pila.length; i--) {
			if (pila[i] != null) {
				pila[i] = null;
			}
		}
	}

	@Override
	public boolean contains(T elemento) {
		for (int i = 0; i < pila.length; i++) {
			if (pila[i] == elemento) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		for (int i = 0; i < pila.length; i++) {
			if (pila[i] != null) {
				System.out.println(pila[i]);
			}
		}
		return null;
	}

	@Override
	public void asegurarCapacidad() {
		int tope = 0;
		 if (tope == pila.length - 1) {
	            Object[] nuevoPila = new Object[pila.length * 2];
	            for (int i = 0; i <= tope; i++) {
	                nuevoPila[i] = pila[i];
	            }
	            pila = nuevoPila;
	        }
		
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("[");
		for (int i = 0; i < pila.length; i++) {
			str.append(pila[i]);
			
			if( i != pila.length -1) {
				str.append(",");
			}
		}
		str.append("]");
		return str.toString();
	}
	
	

}
