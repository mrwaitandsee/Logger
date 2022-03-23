package logger.factory.contract;

import logger.record.contract.Record;

public interface RecordFactory {
    Record create(String text, String... tags);
}
