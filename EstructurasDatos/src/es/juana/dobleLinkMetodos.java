package es.juana;

public class dobleLinkMetodos<T> implements DoubleLinkedList<T>{

	private Nodo<T> inicial;
	private Nodo<T> tail;
	public void MetodosLista() {
	}	

	@Override
	public void add(T elemento) {
		Nodo<T> inicial1 = new Nodo<T>(elemento);
		if (inicial == null && tail == null) {
			inicial = inicial1;
			tail = inicial1;
		}else {
			Nodo<T> actual = inicial;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = inicial1;
			actual.siguiente.anterior = actual;
			tail = actual.siguiente;
		}
	}

		@Override
		public void add(T elemento, int index) { 
	        Nodo inicial1 = new Nodo(elemento);
	        int tamaño = 0;
	        if (index == 0) { 
	        	inicial1.siguiente = inicial;
	            if (inicial != null) {
	            	inicial.anterior = inicial1;
	            } else {
	            	tail = inicial1; 
	            }
	            inicial = inicial1;
	        } else if (index == tamaño) { 
	        	inicial1.anterior = tail;
	            if (tail != null) {
	            	tail.siguiente = inicial1;
	            } else {
	            	inicial = inicial1; 
	            }
	            tail = inicial1;
	        } else { 
	            Nodo actual = inicial;
	            for (int i = 0; i < index - 1; i++) {
	                actual = actual.siguiente;
	            }
	            inicial1.siguiente = actual.siguiente;
	            inicial1.anterior = actual;
	            actual.siguiente.anterior = inicial1;
	            actual.siguiente = inicial1;
	        }
	        
	        tamaño++;
	    }
	    
		

		@Override
		public T remove(int index) {
	        Nodo actual = inicial;
	        for (int i = 0; i < index; i++) {
	            actual = actual.siguiente;
	            if(i == index) {
	            	actual = actual.siguiente.siguiente;
	            	if (tail.equals(i)) {
	            		tail = tail.anterior;
	            	}
	            }
	        }
	        return (T) actual.getValor();
	    }
	    

		

		@Override
		public void remove(T elemento) {
			
			if(inicial.getValor().equals(elemento)) {
				inicial = inicial.siguiente;
			}else if (tail.getValor().equals(elemento)) {
		        tail = tail.anterior;
			}else {
			    Nodo<T> actual = inicial;
			    if (actual.siguiente.getValor().equals(elemento)) {
			        actual.siguiente = actual.siguiente.siguiente;
			    }
			}
		}

		@Override
		public boolean isEmpty() {
			if(inicial == null && tail == null) {
				return true;
			}else {
				return false;
			}
		}

		@Override
		public int size() {
			int contador = 0;
			if (inicial == null) {
				return 0;
			}else {
				Nodo<T> actual = inicial;
				while (actual != null) {
					actual = actual.siguiente;
					contador++;
				}
			}
			return contador;
		}

		@Override
		public void clear() {
			if(inicial == null && tail == null) {
				
			}else {
				Nodo<T> actual = tail;
				while (actual.siguiente != null) {
					actual = null;
				}
			}
		}

		@Override
		public boolean contains(T elemento) {
			if(inicial == null && tail == null) {
				return false;
			}else if(inicial == elemento && tail == elemento){
				return true;
			}
			return false;
		}
	
	@Override
	public String toString() {
		Nodo<T> inicial1 = inicial;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while (inicial1 != null) {
			sb.append(inicial1.getValor());
			if(inicial1.siguiente != null) {
				sb.append(", ");
			}
			inicial1 = inicial1.siguiente;
		}
		sb.append("]");
		return sb.toString();

	}

	@Override
	public Object[] toArray() {
		return null;

	}
}
