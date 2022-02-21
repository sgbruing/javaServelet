package com.example.santander;

import com.example.santander.model.ContaModel;
import com.example.santander.model.ListaContas;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Conta", value = "/conta")
public class Conta extends HttpServlet {

    ListaContas listaContas = new ListaContas();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numConta = request.getParameter("numConta");
        ContaModel conta = new ContaModel();
        conta.setNum(numConta);

        listaContas.adiciona(conta);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contaCadastrada.jsp");
        request.setAttribute("conta", conta.getNum());
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<ContaModel> contas = listaContas.buscaContas();

        request.setAttribute("contas", contas);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaContas.jsp");
        requestDispatcher.forward(request, response);

    }

}
