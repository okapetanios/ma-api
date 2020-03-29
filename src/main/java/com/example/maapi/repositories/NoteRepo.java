package com.example.maapi.repositories;

import com.example.maapi.models.Note;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NoteRepo extends CrudRepository<Note, Integer> {
    @Query("select note from Note note")
    public List<Note> findAllNotes();

    @Query("select note from Note note where note.id=:nid")
    public Note findNoteById(@Param("nid") int noteId);

    @Query("select note from Note note where note.user.id=:uid")
    public List<Note> findNotesByUser(@Param("uid") int userId);

    @Query("select note from Note note where note.folder.id=:fid")
    public List<Note> findNotesByFolder(@Param("fid") int folderId);
}
