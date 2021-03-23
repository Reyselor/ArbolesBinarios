package arbol;

public class Arbol {
	private Nodo raiz;
        private String cad="";
        private int cont=0;
        
	public Arbol(String dato) {
		raiz=new Nodo(dato);
		raiz.setIzquierda(null);
		raiz.setDerecha(null);
	}
	public void insertarIzquierda(String dato, Nodo ref) {
		if(ref!=null) {
			Nodo nuevo=new Nodo(dato);
			ref.setIzquierda(nuevo);
		}
	 }
	 public void insertarDerecha(String dato, Nodo ref) {
		 if(ref!=null) {
				Nodo nuevo=new Nodo(dato);
				ref.setDerecha(nuevo);
		 }
	 }
	 public String preOrden(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                     	cad=cad+" "+ref.getDato(); 
                        preOrden(ref.getIzquierda());
			preOrden(ref.getDerecha());
		 }
                 return cad; 
	 }
	 public String inOrden(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
			inOrden(ref.getIzquierda());
			cad=cad+" "+ref.getDato(); 
                        inOrden(ref.getDerecha());
		 }
            return cad; 
	 }
	 public String posOrden(Nodo ref) {
		 if(ref!=null) {
			if(ref==raiz){
                            cad="";
                        }
			
                        posOrden(ref.getIzquierda());
			posOrden(ref.getDerecha());
			cad=cad+" "+ref.getDato(); 
		 }
                 return cad; 
	 }
         
        public String invPreOrden(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                     	cad=cad+" "+ref.getDato(); 
                        invPreOrden(ref.getDerecha());
                        invPreOrden(ref.getIzquierda());
		 }
                 return cad; 
	}
        
        public String invInOrden(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
			invInOrden(ref.getDerecha());
			cad=cad+" "+ref.getDato(); 
                        invInOrden(ref.getIzquierda());
		 }
            return cad; 
	 }
        
        public String invPosOrden(Nodo ref) {
		 if(ref!=null) {
			if(ref==raiz){
                            cad="";
                        }
			
			invPosOrden(ref.getDerecha());
                        invPosOrden(ref.getIzquierda());
			cad=cad+" "+ref.getDato(); 
		 }
                 return cad; 
	 }
        
        public String grado(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                        int cont=0;
                        if(ref.getDerecha()!=null){
                            cont++;
                        }
                        if(ref.getIzquierda()!=null){
                            cont++;
                        }
                     	cad=cad+"Nodo: "+ref.getDato()+"\nGrado: "+cont+"\n=====================\n"; 
                        grado(ref.getIzquierda());
			grado(ref.getDerecha());
		 }
                 return cad; 
	 }
        
        public String peso(Nodo ref) {
		if(ref!=null) {
                    if(ref==raiz){
                        cad="";
                    }
			
                    peso(ref.getIzquierda());
                    peso(ref.getDerecha());
                    
                    cont=pesoAux(ref);
                    cad=cad+"Nodo: "+ref.getDato()+"\nPeso: "+cont+"\n=====================\n";
                    cont=0;
		}
                return cad; 
        }
        public int pesoAux(Nodo ref){
            
            if(ref!=null){
                
                pesoAux(ref.getIzquierda());
                pesoAux(ref.getDerecha());
            
                if(ref.getDerecha()!=null){
                    cont++;
                }
                if(ref.getIzquierda()!=null){
                    cont++;
                }
            }
            return cont;
        }
	 
	 public Nodo getRaiz() {
		 return raiz; 
	 }
}
