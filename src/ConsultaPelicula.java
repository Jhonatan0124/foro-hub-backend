import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConsultaPelicula {

    Pelicula buscarPelicula(int numeroDePelicula){

        URI direccion = URI.create("https://swapi.dev/api/fims/"+ numeroDePelicula);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        HttpRequest<String> response = null;
        try {
            response = client
                .send(request, HttpRequest.BodyHandlers.ofString());
        }catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


        return new Gson().fromJson(responde.body(),Pelicula.class)
    }
}
