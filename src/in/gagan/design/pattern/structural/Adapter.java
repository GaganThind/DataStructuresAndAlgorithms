package in.gagan.design.pattern.structural;

public class Adapter implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public int getVolts() {
        return socket.getVolts();
    }

    @Override
    public int get240Volts() {
        return convertVolts(socket.getVolts(), 240);
    }

    @Override
    public int get5Volts() {
        return convertVolts(socket.getVolts(), 5);
    }

    private static int convertVolts(int volts, int to) {
        return to;
    }
}

interface SocketAdapter {
    int getVolts();
    int get240Volts();
    int get5Volts();
}

class Socket {

    public Socket() { }

    public int getVolts() {
        return 120;
    }
}

class TestAdapter {

    public static void main(String[] args) {
        SocketAdapter sa = new Adapter();
        sa.get5Volts();
        sa.get240Volts();
        sa.getVolts();
    }

}
