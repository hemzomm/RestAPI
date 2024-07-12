package np.edu.ncit.restapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitClient {
    private static final String BASE_URL = "https://dummy.restapiexample.com/api/v1/";
    private static RetroFitClient instance;
    private Retrofit retrofit;

    private RetroFitClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetroFitClient getRetroFitClient() {
        if (instance == null) {
            instance = new RetroFitClient();
        }
        return instance;
    }

    public ApiService getApiService() {
        return retrofit.create(ApiService.class);
    }
}
