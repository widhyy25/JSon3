package dashboard.example.com.json3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private static Object Response;
    ApiInterface apiInterface;
    Buah buah;
    TextView txtNamaBuahnya, txtTipeAkarnya, txtBentukDaunnya, txtVar1, txtVar2, txtVar3;
    private Buah buah;
    private Object ApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNamaBuahnya=(TextView)findViewById(R.id.txt_Nama_Buahnya);
        txtTipeAkarnya=(TextView)findViewById(R.id.txt_Tipe_Akarnya);
        txtBentukDaunnya=(TextView)findViewById(R.id.txt_Bentuk_Daunnya);
        txtVar1=(TextView)findViewById(R.id.txt_var_1);
        txtVar2=(TextView)findViewById(R.id.txt_var_2);
        txtVar3=(TextView)findViewById(R)

        apiInterface = dashboard.example.com.json3.ApiClient.ambilData().create(ApiInterface.class);
        Call<Buah> call=apiInterface.ambilBuah();
        call.enqueue(new Callback<Buah>() {
            @Override
            public void onResponse(retrofit2.Call<Buah> call, retrofit2.Response<Buah> response) {
                Buah data = response.body();
                txtbuah.setText(data.getNama_buah());
                txtakar.setText(data.getTipe_akar());
                txtdaun.setText(data.getBentuk_daun());
                txtvariansi.setText(data.getVariansi());
            }

            @Override
            public void onFailure(retrofit2.Call<Buah> call, Throwable t) {

            }
        });
        }


}
