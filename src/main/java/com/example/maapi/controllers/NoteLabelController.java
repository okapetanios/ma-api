//package com.example.maapi.controllers;
//
//import com.example.maapi.models.NoteLabel;
//import com.example.maapi.services.NoteLabelService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "*")
//public class NoteLabelController {
//    @Autowired
//    NoteLabelService service;
//
//    @GetMapping("/api/noteLabels")
//    public List<NoteLabel> findAllLabels(){
//        return service.findAllNoteLabels();
//    }
//
//    @GetMapping("/api/noteLabels/{nlid}")
//    public NoteLabel findLabelById(@PathVariable("nlid") int noteLabelId){
//        return service.findNoteLabelById(noteLabelId);
//    }
//
//    @GetMapping("/api/notes/{nid}/noteLabels")
//    public List<NoteLabel> findLabelsByNote(@PathVariable("nid") int noteId){
//        return service.findNoteLabelsByNote(noteId);
//    }
//
//    @PostMapping("/api/otes/{nid}/noteLabels")
//    public NoteLabel createLabelForUser(@PathVariable("nid") int noteId, @RequestBody NoteLabel newNoteLabel){
//        return service.createNoteLabelForNote(noteId, newNoteLabel);
//    }
//
//    @GetMapping("/api/labels/{lid}/NoteLabels")
//    public List<NoteLabel> findLabelsByFolder(@PathVariable("lid") int labelId){
//        return service.findNoteLabelsByLabel(labelId);
//    }
//
//    @PostMapping("/api/labels/{lid}/NoteLabels")
//    public NoteLabel createLabelForFolder(@PathVariable("lid") int labelId, @RequestBody NoteLabel newNoteLabel){
//        return service.createNoteLabelForLabel(labelId, newNoteLabel);
//    }
//
//    @PutMapping("/api/noteLabels/{nlid}")
//    public int updateLabel(@PathVariable("nlid") int noteLabelId, @RequestBody NoteLabel updated){
//        return service.updateNoteLabel(noteLabelId, updated);
//    }
//
//    @DeleteMapping("/api/noteLabels/{nlid}")
//    public int deleteLabel(@PathVariable("nlid") int noteLabelId){
//        return service.deleteNoteLabel(noteLabelId);
//    }
//}
