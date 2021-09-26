package com.gullivertraveller.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gullivertraveller.model.Hotel;

@WebServlet("/listaHotel")
public class ListaHotelServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	 throws IOException, ServletException {
		ArrayList<Hotel> hoteis = new ArrayList<Hotel>();
		hoteis.add(new Hotel(
				"Copacabana Palace",
				"Av. Atlântica, 1702 - Copacabana, Rio de Janeiro - RJ, CEP: 22021-001",
				128.0,
				5
		));
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/hoteis.jsp");
		dispatcher.forward(request, response);
	}
}
