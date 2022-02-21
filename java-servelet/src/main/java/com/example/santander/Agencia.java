package com.example.santander;

import com.example.santander.model.AgenciaModel;
import com.example.santander.model.ListaAgencias;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Agencia", value = "/agencia")
public class Agencia extends HttpServlet {

    ListaAgencias listaAgencias = new ListaAgencias();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numAgencia = request.getParameter("numAgencia");
        AgenciaModel agencia = new AgenciaModel();
        agencia.setNum(numAgencia);

        listaAgencias.adiciona(agencia);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("agenciaCadastrada.jsp");
        request.setAttribute("agencia", agencia.getNum());
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<AgenciaModel> agencias = listaAgencias.buscaAgencias();

        request.setAttribute("agencias", agencias);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaAgencias.jsp");
        requestDispatcher.forward(request, response);

    }

}
