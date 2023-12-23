# Learning (1st Test)

## Datagram

1. Datagram socket
2. Adresa serverului
3. Buffer de 256 de bytes (array de bytes)
4. Construim un DatagramPacket
5. Trimitem packetul
6. Pe socket trimitem packetul

```java
public class QuoteClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("10.132.68.54");
        byte[] buf = new byte[256];
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
        socket.send(packet);
    }
}
```
