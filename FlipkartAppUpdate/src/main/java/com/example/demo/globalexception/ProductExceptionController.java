package com.example.demo.globalexception;

public class ProductExceptionController extends RuntimeException {
	
//	@ExceptionHandler(value = ProductNotFoundException.class)
//	public ResponseEntity<Object> exception(ProductNotFoundException exception) {
		
//		 return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
//	}
	
	private long errorCode;
	private String errorMsg;

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	public ProductExceptionController(String errorMsg, long errorCode) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

}
