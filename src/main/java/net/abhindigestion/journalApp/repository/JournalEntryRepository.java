package net.abhindigestion.journalApp.repository;

import net.abhindigestion.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {



}
