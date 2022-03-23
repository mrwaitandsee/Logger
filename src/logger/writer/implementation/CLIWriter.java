package logger.writer.implementation;

import logger.record.contract.Record;
import logger.writer.contract.Writer;

public class CLIWriter implements Writer {
    @Override
    public void write(Record record) {
        System.out.println(record.getText());
    }
}
