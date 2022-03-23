package logger.writer.contract;

import logger.record.contract.Record;

public interface Writer {
    void write(Record record);
}
