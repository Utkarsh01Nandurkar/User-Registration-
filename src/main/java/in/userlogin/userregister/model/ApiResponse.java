package in.userlogin.userregister.model;

public class ApiResponse<T> {
    private String message;
    private T data;

    // No-args constructor
    public ApiResponse() {
    }

    // All-args constructor
    public ApiResponse(String message, T data) {
        this.message = message;
        this.data = data;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // Optional: for debugging/logging
    @Override
    public String toString() {
        return "ApiResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
