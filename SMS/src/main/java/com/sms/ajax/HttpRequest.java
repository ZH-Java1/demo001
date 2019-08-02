package com.sms.ajax;
/**
 * 此类是对AJAX的请求进行接收和返回数据
 * @author 000
 *
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.pojo.Wares;

public class HttpRequest extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	/**
	 * 接收
	 * @param request
	 * @return
	 */
	private Wares ajaxRequest(HttpServletRequest request) {
		Wares wares=new Wares();
		wares.setId(Long.valueOf(request.getParameter("id")))
			.setWareName(request.getParameter("wareName"))
			.setWareHome(request.getParameter("wareHome"))
			.setWarePrice(Double.valueOf(request.getParameter("warePrice")));
		
		return wares;
	}
	/**
	 * 响应
	 */
}
