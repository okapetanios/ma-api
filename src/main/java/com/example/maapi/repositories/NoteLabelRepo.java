//package com.example.maapi.repositories;
//
//import com.example.maapi.models.NoteLabel;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface NoteLabelRepo extends CrudRepository<NoteLabel, Integer> {
//    @Query("select noteLabel from NoteLabel noteLabel")
//    public List<NoteLabel> findAllNoteLabels();
//
//    @Query("select noteLabel from NoteLabel noteLabel where noteLabel.id=:nlid")
//    public NoteLabel findNoteLabelById(@Param("nlid") int noteLabelId);
//
//    @Query("select noteLabel from NoteLabel noteLabel where noteLabel.note.id=:nid")
//    public List<NoteLabel> findNoteLabelsByNote(@Param("nid") int noteId);
//
//    @Query("select noteLabel from NoteLabel noteLabel where noteLabel.label.id=:lid")
//    public List<NoteLabel> findNoteLabelsByLabel(@Param("lid") int labelId);
//}
