package net.abhindigestion.journalApp.service;

import net.abhindigestion.journalApp.entity.JournalEntry;
import net.abhindigestion.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void makeJournalEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }

}
