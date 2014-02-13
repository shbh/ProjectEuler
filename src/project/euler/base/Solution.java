package project.euler.base;


public class Solution {

	private long time;
	private Object result;
	private KeyConstant.ThreeState state = KeyConstant.ThreeState.FAIL;
	private Exception exception;
	private String className;
	private int problemNo;
	
	
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

	public KeyConstant.ThreeState getState() {
		return state;
	}

	public void setState(final KeyConstant.ThreeState state) {
		this.state = state;
		if (this.time > KeyConstant.ALLOWEDTIME && state.equals(KeyConstant.ThreeState.PASS)) {
			this.state = KeyConstant.ThreeState.TIME_EXCEEDED;
		}
	}

	public void setClassName(final String className) {
		this.className = className;

	}

}
