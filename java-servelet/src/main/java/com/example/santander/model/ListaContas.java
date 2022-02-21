package com.example.santander.model;

import java.util.ArrayList;
import java.util.List;

public class ListaContas {
    private  static List<ContaModel> contas = new ArrayList<>();

    public void adiciona(ContaModel contaModel){
        ListaContas.contas.add(contaModel);
    }

    public List<ContaModel> buscaContas(){
        return ListaContas.contas;
    }
}
