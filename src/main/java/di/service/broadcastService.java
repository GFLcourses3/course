package di.service;

public interface broadcastService {
    void broadcast(String info, Integer seconds) throws InterruptedException;
}
