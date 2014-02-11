package project.euler.base;

import project.euler.base.Key.ThreeState;

public class Problem {

	private long time;
	private int number;
	private Object result;
	private Key.ThreeState state = Key.ThreeState.FAIL;
	private Exception exception;
	
	
	
	public Problem() {
		super();
	}

	public Problem(int number, ThreeState state) {
		this.number = number;
		this.state = state;
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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
		if(this.time>Key.ALLOWEDTIME && state.equals(Key.ThreeState.PASS))
		{
			this.state = Key.ThreeState.TIME_EXCEEDED;
		}
	}

}
