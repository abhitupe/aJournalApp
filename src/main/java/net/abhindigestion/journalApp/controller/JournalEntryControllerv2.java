package net.abhindigestion.journalApp.controller;

import net.abhindigestion.journalApp.entity.JournalEntry;
import net.abhindigestion.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2 {

    @Autowired
    private JournalEntryService entryService;

    @GetMapping
    public List<JournalEntry> journalEntries() {
        return null;
    }

    @GetMapping("id/{requestedId}")
    public JournalEntry returnEntryForId(@PathVariable String requestedId) {
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        entryService.makeJournalEntry(myEntry);
        return true;
    }

    @DeleteMapping("id/{requestedId}")
    public JournalEntry deleteEntryById(@PathVariable String requestedId) {
        return null;
    }

    @PutMapping("id/{requestedId}")
    public JournalEntry modifyEntryById(@PathVariable String requestedId, @RequestBody JournalEntry newEntry) {
        return null;
    }

}


//Controller ---> Service ---> Repository