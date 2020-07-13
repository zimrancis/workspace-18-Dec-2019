package net.guides.springboot2.springboot2jpacrudexample.model.exception.ResourceNotFoundException;

public class ErrorResponse {
	
	private String path;
	private String errorMessage;

	public ErrorResponse() {

	}

	public ErrorResponse(String path, String errorMessage) {
		super();
		this.path = path;
		this.errorMessage = errorMessage;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
