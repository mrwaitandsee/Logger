package logger.factory.implementation;

import logger.record.contract.Record;
import logger.factory.contract.RecordFactory;
import logger.record.implementation.CLIRecord;

public class CLIRecordFactory implements RecordFactory {
    @Override
    public Record create(String text, String... tags) {
        return new CLIRecord(text, tags);
    }
}
