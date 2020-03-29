package com.example.maapi.services;

import com.example.maapi.models.Folder;
import com.example.maapi.models.Note;
import com.example.maapi.models.User;
import com.example.maapi.repositories.FolderRepo;
import com.example.maapi.repositories.NoteRepo;
import com.example.maapi.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    NoteRepo noteRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    FolderRepo folderRepo;

    public List<Note> findAllNotes(){
        return noteRepo.findAllNotes();
    }

    public Note findNoteById(int noteId){
        return noteRepo.findNoteById(noteId);
    }

    public List<Note> findNotesByUser(int userId){
        return noteRepo.findNotesByUser(userId);
    }

    public Note createNoteForUser(int userId, Note note){
        User user = userRepo.findUserById(userId);
        note.setUser(user);
        return noteRepo.save(note);
    }

    public List<Note> findNotesByFolder(int folderId){
        return noteRepo.findNotesByFolder(folderId);
    }

    public Note createNoteForFolder(int folderId, Note note){
        Folder folder = folderRepo.findFolderById(folderId);
        note.setFolder(folder);
        return noteRepo.save(note);
    }

    public int updateNote(int noteId, Note updatedNote){
        Note note = noteRepo.findNoteById(noteId);
        updatedNote.setUser(note.getUser());
        updatedNote.setFolder(note.getFolder());
        noteRepo.save(updatedNote);
        return 1;
    }

    public int deleteNote(int noteId){
        noteRepo.deleteById(noteId);
        return 1;
    }
}
