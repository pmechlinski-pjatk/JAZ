package com.pjatk.nbp.homework.service;

import com.pjatk.nbp.homework.model.Entry;
import com.pjatk.nbp.homework.repository.LoggingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LoggerService {
    private final LoggingRepository loggingRepository;

    @Autowired
    DateService date;

    public LoggerService(LoggingRepository loggingRepository) {
        this.loggingRepository = loggingRepository;
    }

    public int logQuery(Entry entry) {
        try {
            loggingRepository.save(entry);
        } catch (DataAccessException exception) {
            System.out.println("[DB_LOG][ERROR] " + date.getTime() + " " + exception);
            return 1;
        }
        System.out.println("[DB_LOG][OK] " + date.getTime() + " " + entry + " was added to the log database!");
        return 0;
    }
}
