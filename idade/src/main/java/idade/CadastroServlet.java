package idade;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastroServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Receber os dados do formulário
        int ano_nascimento = Integer.parseInt(request.getParameter("ano_nascimento"));
        String fez_aniversario = request.getParameter("fez_aniversario");
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");

        // Processar os dados
        int idade = 2023 - ano_nascimento;
        boolean fezAniversario = fez_aniversario.equals("sim");

        // Exibir os resultados
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultados</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Resultados</h1>");
        out.println("<p>Dados recebidos:</p>");
        out.println("<ul>");
        out.println("<li>Ano de nascimento: " + ano_nascimento + "</li>");
        out.println("<li>Já fez aniversário? " + fezAniversario + "</li>");
        out.println("<li>Nome: " + nome + "</li>");
        out.println("<li>Endereço: " + endereco + "</li>");
        out.println("</ul>");
        out.println("<p>Idade: " + idade + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
