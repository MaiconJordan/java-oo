import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {


        // fazer uma conexão http e buscar os top 250 filme
        String url = "https://api.mocki.io/v2/549a5d8b";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

        //extrair só os dados que interessam (titulo, poster, cassificação)

        var parser= new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);


    }
}
