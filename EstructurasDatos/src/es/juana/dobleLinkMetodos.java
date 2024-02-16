package es.juana;

public class dobleLinkMetodos<T> implements DoubleLinkedList<T>{

	private Nodo<T> inicial;
	private Nodo<T> tail;
	public void MetodosLista() {
	}	

	@Override
	public void add(T elemento) {
		if (inicial == null && tail == null) {
			tail = inicial;
		}else {
			Nodo<T> actual = tail;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = new Nodo<T>(elemento);
			actual.siguiente = tail;
		}
	}

		@Override
		public void add(T elemento, int index) {
			
		}

		@Override
		public T remove(int index) {
			return null;
		}

		@Override
		public void remove(T elemento) {
			if(inicial == elemento) {
				inicial = null;
			}else if(tail == elemento){
				tail = null;
			}else{
				Nodo<T> actual = inicial;
				actual = tail;
				while (actual.siguiente != null) {
					actual = actual.siguiente;
					if (actual == elemento) {
						actual = null;
					}

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
				Nodo<T> actual = tail;
				while (actual.siguiente != null) {
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
		return null;

	}

	@Override
	public Object[] toArray() {
		return null;

	}
}
