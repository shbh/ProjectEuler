package project.euler.base;

import project.euler.base.Key.ThreeState;

public class Solution {

	private long time;
	private Object result;
	private Key.ThreeState state = Key.ThreeState.FAIL;
	private Exception exception;
	private String className;
	private int no;
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Solution() {
		super();
	}

	public Solution(int no,String className, ThreeState state) {
		this.className= className;
		this.state = state;
	}

	public String getClassName() {
		return className;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}



	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public Key.ThreeState getState() {
		return state;
	}

	public void setState(Key.ThreeState state) {
		this.state = state;
		if (this.time > Key.ALLOWEDTIME && state.equals(Key.ThreeState.PASS)) {
			this.state = Key.ThreeState.TIME_EXCEEDED;
		}
	}

	public void setClassName(String className) {
		this.className = className;

	}

}
