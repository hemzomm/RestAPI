package np.edu.ncit.restapi;

import java.util.List;

public class ApiResponse {
    private String status;
    private List<Employee> data;
    private String message;

    public String getStatus() {
        return status;
    }

    public List<Employee> getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
