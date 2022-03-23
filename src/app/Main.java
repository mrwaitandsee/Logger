package app;

import logger.Logger;

public class Main {
    public static void main(String[] args) {
        var logger = new Logger();
        logger.log("Hello logger!", "TAG1", "TAG2", "TAG3");
    }
}
