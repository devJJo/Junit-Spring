package devjjo.junit.dto;

import org.springframework.stereotype.Component;

@Component//Defaultf�� Ŭ������(���ڸ� �ҹ���)
public class StringPrinter implements Printer {
	private StringBuffer buffer = new StringBuffer();

	public void print(String message) {
		this.buffer.append(message);
	}

	public String toString() {
		return this.buffer.toString();
	}
}