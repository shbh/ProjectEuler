package project.euler.base;


public class Solution {

	private long time;
	private Object result;
	private KeyConstant.FourState state = KeyConstant.FourState.FAIL;
	private Exception exception;
	private String className;
	private int problemNo;
	private String actualresult;
	
	
	public int getProblemNo() {
		return problemNo;
	}

	public void setProblemNo(final int problemNo) {
		this.problemNo = problemNo;
	}


	public String getClassName() {
		return className;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(final Exception exception) {
		this.exception = exception;
	}

	public long getTime() {
		return time;
	}

	public void setTime(final long time) {
		this.time = time;
	}



	public Object getResult() {
		return result;
	}

	public void setResult(final Object result) {
		this.result = result;
	}

	public KeyConstant.FourState getState() {
		return state;
	}

	public void setState(final KeyConstant.FourState state) {
		this.state = state;
		if (this.time > KeyConstant.ALLOWEDTIME && state.equals(KeyConstant.FourState.PASS)) {
			this.state = KeyConstant.FourState.TIME_EXCEEDED;
		}
	}

	public String getActualresult() {
		return actualresult;
	}

	public void setActualresult(String actualresult) {
		this.actualresult = actualresult;
	}

	public void setClassName(final String className) {
		this.className = className;

	}

	public void setActualResult(String actualresult) {
		this.actualresult = actualresult;
		
	}
	
	

}
