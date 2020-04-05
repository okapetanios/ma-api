//package com.example.maapi.services;
//
//import com.example.maapi.models.*;
//import com.example.maapi.repositories.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class NoteLabelService {
//    @Autowired
//    NoteLabelRepo notelabelRepo;
//    @Autowired
//    NoteRepo noteRepo;
//    @Autowired
//    LabelRepo labelRepo;
//
//    public List<NoteLabel> findAllNoteLabels(){
//        return notelabelRepo.findAllNoteLabels();
//    }
//
//    public NoteLabel findNoteLabelById(int noteLabelId){
//        return notelabelRepo.findNoteLabelById(noteLabelId);
//    }
//
//    public List<NoteLabel> findNoteLabelsByNote(int noteId){
//        return notelabelRepo.findNoteLabelsByNote(noteId);
//    }
//
//    public NoteLabel createNoteLabelForNote(int noteId, NoteLabel notelabel){
//        Note note = noteRepo.findNoteById(noteId);
//        notelabel.setNote(note);
//        return notelabelRepo.save(notelabel);
//    }
//
//    public List<NoteLabel> findNoteLabelsByLabel(int labelId){
//        return notelabelRepo.findNoteLabelsByLabel(labelId);
//    }
//
//    public NoteLabel createNoteLabelForLabel(int labelId, NoteLabel notelabel){
//        Label label = labelRepo.findLabelById(labelId);
//        notelabel.setLabel(label);
//        return notelabelRepo.save(notelabel);
//    }
//
//    public int updateNoteLabel(int notelabelId, NoteLabel updatedNoteLabel){
//        NoteLabel noteLabel = notelabelRepo.findNoteLabelById(notelabelId);
//        updatedNoteLabel.setNote(noteLabel.getNote());
//        updatedNoteLabel.setLabel(noteLabel.getLabel());
//        notelabelRepo.save(updatedNoteLabel);
//        return 1;
//    }
//
//    public int deleteNoteLabel(int notelabelId){
//        notelabelRepo.deleteById(notelabelId);
//        return 1;
//    }
//}
