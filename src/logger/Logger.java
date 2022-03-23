package logger;

import logger.factory.contract.RecordFactory;
import logger.factory.implementation.CLIRecordFactory;
import logger.writer.contract.Writer;
import logger.writer.implementation.CLIWriter;

public class Logger {
    private RecordFactory factory;
    private Writer writer;

    public Logger() {
        factory = new CLIRecordFactory();
        writer = new CLIWriter();
    }

    public void setRecordFactory(RecordFactory factory) {
        this.factory = factory;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void log(String text, String... tags) {
        var record = factory.create(text, tags);
        writer.write(record);
    }
}
