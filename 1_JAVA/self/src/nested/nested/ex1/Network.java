package nested.nested.ex1;

public class Network {
	public void sendMessage(String text) {
		NetworkMessage ntM = new NetworkMessage(text);
		ntM.print();
	}

	private static class NetworkMessage {
		// Network객체 안에서만 사용
		private String content;

		public NetworkMessage(String content) {
			this.content = content;
		}

		public void print() {
			System.out.println(content);

		}
	}
}
