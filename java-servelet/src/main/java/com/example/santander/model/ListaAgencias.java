package com.example.santander.model;

import java.util.ArrayList;
import java.util.List;

public class ListaAgencias {
    private  static List<AgenciaModel> agencias = new ArrayList<>();

    public void adiciona(AgenciaModel agenciaModel){
        ListaAgencias.agencias.add(agenciaModel);
    }

    public List<AgenciaModel> buscaAgencias(){
        return ListaAgencias.agencias;
    }
}
