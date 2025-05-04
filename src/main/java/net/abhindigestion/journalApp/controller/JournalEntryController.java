package net.abhindigestion.journalApp.controller;

import jdk.jfr.Frequency;
import net.abhindigestion.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {

    private final Map<String, JournalEntry> journalEntries = new HashMap<>();


    @GetMapping
    public List<JournalEntry> journalEntries(){
        return new ArrayList<>(journalEntries.values());
    }

    @GetMapping("id/{requestedId}")
    public JournalEntry returnEntryForId(@PathVariable Long requestedId){
        return journalEntries.get(requestedId);
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @DeleteMapping("id/{requestedId}")
    public JournalEntry deleteEntryById(@PathVariable Long requestedId){
        return journalEntries.remove(requestedId);
    }

    @PutMapping("id/{requestedId}")
    public JournalEntry modifyEntryById(@PathVariable String requestedId, @RequestBody JournalEntry newEntry){
        return journalEntries.put(requestedId, newEntry);
    }

}
