/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author mario.garciat
 */
class Lista {
    private NodoCabeza cabeza;
    private Nodo nodo;
    
    public Lista () {
        cabeza = new NodoCabeza ();
    }
    
    public void insertarDato (float columna1, float columna2) {
       nodo = new Nodo (columna1, columna2);
       cabeza.getLigaFinal().setLiga(nodo);
       cabeza.setLigaFinal(nodo);
       cabeza.setnFilas(cabeza.getnFilas()+1);
    }

    public NodoCabeza getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCabeza cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
    
    
    
}