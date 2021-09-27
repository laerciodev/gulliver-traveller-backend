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
				500.0,
				5
		));
		hoteis.add(new Hotel(
				"Windsor Leme",
				"Av. Atlântica, 656 - Leme, Rio de Janeiro - RJ, CEP: 22010-000",
				300.0,
				5
		));
		hoteis.add(new Hotel(
				"Fasano Ipanema",
				"Av. Vieira Souto, 80 - Ipanema, Rio de Janeiro - RJ, CEP: 22420-002",
				450.0,
				5
		));
		hoteis.add(new Hotel(
				"Hotel Nacional",
				"Av. Niemeyer, 769 - São Conrado, Rio de Janeiro - RJ, 22450-221",
				650.0,
				5
		));
		request.setAttribute("Hoteis", hoteis);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/hoteis.jsp");
		dispatcher.forward(request, response);
	}
}
