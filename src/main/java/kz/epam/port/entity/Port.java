package main.java.kz.epam.port.entity;


import java.util.concurrent.Semaphore;
import java.util.function.Supplier;
import java.util.logging.Logger;


public class Port {
    private String name;
    private int numberOfBerths;
    private Storage storage;
    private Semaphore semaphore;
    private static Logger logger = Logger.getLogger(String.valueOf(Port.class));

    public Port() {
    }

    public Port(String name, int numberOfBerths, Storage storage) {
        this.name = name;
        this.numberOfBerths = numberOfBerths;
        this.storage = storage;
        this.semaphore = new Semaphore(numberOfBerths, true);
    }


    public void entranceToPort(int id) {
        try {
            semaphore.acquire();
            logger.info("Ship number " + id + " moored in port " + name);
        } catch (InterruptedException e) {
            logger.warning((Supplier<String>) e);
        }

    }

    public void leftPort(int id) {
        logger.info("Ship number " + id + " left port " + name);
        semaphore.release();
    }


    public Storage getStorage() {
        return storage;
    }

    public String getName() {
        return name;
    }
}
