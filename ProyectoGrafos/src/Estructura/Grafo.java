/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.awt.Color;

/**
 *
 * @author luigy
 */
public class Grafo {
    private Lista vertices;
    private Lista aristas;

    public Grafo() {
        vertices=new Lista();
        aristas=new Lista();
    }

    public Grafo(Lista vertices, Lista aristas) {
        this.vertices = vertices;
        this.aristas = aristas;
    }

    public Lista getVertices() {
        return vertices;
    }

    public void setVertices(Lista vertices) {
        this.vertices = vertices;
    }

    public Lista getAristas() {
        return aristas;
    }

    public void setAristas(Lista aristas) {
        this.aristas = aristas;
    }
    
    public void AddVertice(Vertice entrada){
        vertices.insert(new Nodo(null,entrada));
    }
    public void AddArista(Arista entrada){
        aristas.insert(new Nodo(null,entrada));
    }
    public Grafo algoritmoPrim(int adyacencias[][],Grafo grafo,Vertice origen){
        Grafo arbol= new Grafo();
        int[] visited = new int[grafo.getVertices().size()]; // Vertices Visitados
        int min;
        int u = 0, v = 0; // Cordenadas de los Vertices
        int total = 0;
        for(int i = 0; i < grafo.getVertices().size(); i++){
            visited[i] = 0; // 0 Ninguno esta visitado			
            for(int j = 0; j < grafo.getVertices().size(); j++){
                if(adyacencias[i][j]==0){ 
                    adyacencias[i][j] = 999; //Se inicia en infinito
                }
            }
	}		
        visited[origen.getId()] = 1;	// Vertice Origen Visitado = 1
        // Recorre hasta el numero de Vertices-1
        for(int counter = 0; counter < grafo.getVertices().size()-1 ; counter++){			
            min = 999;
            /*Recorre todos los nodos visitados en la matriz y revisa las aristas 
            /conectadas que tienen el valor minimo, tomar el nodo del valor minimo*/
            for(int i = 0; i < grafo.getVertices().size(); i++){			
                if(visited[i]==1){ // Si el nodo i esta visitado
                    for(int j = 0; j < grafo.getVertices().size(); j++){                       
                        if(visited[j]!=1){//Revisa si el nodo conectado al nodo i, no esta visitado		
                            if(min > adyacencias[i][j]){		
                                min = adyacencias[i][j];
                                u = i;
                                v = j;							
                            }
                        }
                    }
                }
            }
            visited[v] = 1;//El nodo conectado a i pasa a visitado
            total += min;// Se suma el peso total
            adyacencias[u][v] = adyacencias[u][v] = 999; 
            System.out.println("Ruta : "+(u+1)+" -> "+(v+1)+" : "+min);
            // Agregar los nodos conectados a u nuevo grafo.
            String nombre1 = String.valueOf(u+1);
            nombre1 = Integer.toString(u+1);
            String nombre2 = String.valueOf(v+1);
            nombre2 = Integer.toString(v+1);
            Vertice e1 = new Vertice(u+1,nombre1);
            Vertice e2 = new Vertice(v+1,nombre2);
            arbol.AddArista(new Arista(Color.BLACK,e1,e2,min));
        }
        System.out.println("El Peso Total Es: "+ total);
        
        return arbol;
    }
}
