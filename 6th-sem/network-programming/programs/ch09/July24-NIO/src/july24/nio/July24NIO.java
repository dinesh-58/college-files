package july24.nio;

import java.nio.*;

public class July24NIO {

	public static void main(String[] args) {
		CharBuffer cbf1 = CharBuffer.allocate(10);
		CharBuffer cbf2 = cbf1.duplicate();
		// put() will incrememnt position 
		cbf1.put('N');
		cbf1.put('e');
		cbf1.put('t');
		cbf1.put('w');
		cbf1.put('o');
		cbf1.put('r');
		cbf1.put('k');

		// resets position / pointer
		cbf1.flip();

		// efficient loop (only till last non-empty char in buffer)
		// i.e. doesn't go all the way till last buffer capacity, regardless if empty or not
		int count = 0;
		while (cbf1.hasRemaining()) {
			// get also increments position
			System.out.print(cbf1.get());
			count++;
		}
		// shows that empty positions in buffer are skipped
		System.out.println("loop count: " + count);

	}

}
