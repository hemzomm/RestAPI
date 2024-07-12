package np.edu.ncit.restapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("employees")
    Call<ApiResponse> getALLEmployees();
}
