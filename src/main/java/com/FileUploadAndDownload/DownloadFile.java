package com.FileUploadAndDownload;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


@WebServlet("/download_book")
public class DownloadFile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String titleBook = req.getParameter("title");
            String nameFile = titleBook + ".txt";
            byte[] arrayByte = Files.readAllBytes(Paths.get("D:\\" + nameFile));
            ServletOutputStream serOutStr = resp.getOutputStream();
            resp.setContentType("application/txt");
            resp.setHeader("Content-Disposition", "attachment; nameFile=\"" + nameFile + "\"");
            serOutStr.write(arrayByte);
            serOutStr.close();
            resp.getWriter().print("Файл успешно скачен с сервера!");
        } catch (Exception e) {
            resp.getWriter().print("Ошибка скачки файла...");
        }
    }
}
