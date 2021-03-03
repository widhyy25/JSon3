package dashboard.example.com.json3;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("8587da66")
    Call <Buah> ambilBuah();

}
