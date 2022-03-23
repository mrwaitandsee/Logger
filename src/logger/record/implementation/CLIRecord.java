package logger.record.implementation;

import logger.record.contract.Record;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class CLIRecord implements Record {
    private final String text;
    private final String[] tags;

    public CLIRecord(String text, String... tags) {
        this.text = text;
        this.tags = tags;
    }

    @Override
    public String getText() {
        var localDateTime = LocalDateTime.now();
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        var datetime = localDateTime.format(formatter);

        var result = "";
        result += datetime;
        result += "    ";
        result += UUID.randomUUID();
        result += "    ";
        if (tags.length > 0) result += String.join(" ", tags) + "    ";
        result += text;

        return result;
    }
}
