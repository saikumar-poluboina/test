package com.shivam;


import com.entity.MobileBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/check")
public class MobileNumValidation extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        PrintWriter pw =res.getWriter();
        res.setContentType("text/html");
        MobileBean mb= new MobileBean();
        //mb.setMobNi(Long.parseLong(req.getParameter("mob")));
        int mobi=13750;
        float a=137500.50f;
        System.out.println(Integer.parseInt(String.valueOf(mobi)));
        System.out.println(Integer.parseInt(String.valueOf(a)));
        if((mobi >= 1000000000) && (mobi <= 9999999999l))
        {
            mb.setMobNi(mobi);
            pw.println("MobileNumber:"+mb.getMobNi());
        }
        else
            pw.println("please enter 10 digit mobile number");



    }
}
