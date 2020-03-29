package com.example.maapi.services;

import com.example.maapi.models.Folder;
import com.example.maapi.models.Label;
import com.example.maapi.models.User;
import com.example.maapi.repositories.FolderRepo;
import com.example.maapi.repositories.LabelRepo;
import com.example.maapi.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelService {
    @Autowired
    LabelRepo labelRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    FolderRepo folderRepo;

    public List<Label> findAllLabels(){
        return labelRepo.findAllLabels();
    }

    public Label findLabelById(int labelId){
        return labelRepo.findLabelById(labelId);
    }

    public List<Label> findLabelsByUser(int userId){
        return labelRepo.findLabelsByUser(userId);
    }

    public Label createLabelForUser(int userId, Label label){
        User user = userRepo.findUserById(userId);
        label.setUser(user);
        return labelRepo.save(label);
    }

//    public List<Label> findLabelsByFolder(int folderId){
//        return labelRepo.findLabelsByFolder(folderId);
//    }
//
//    public Label createLabelForFolder(int folderId, Label label){
//        Folder folder = folderRepo.findFolderById(folderId);
//        label.setFolder(folder);
//        return labelRepo.save(label);
//    }

    public int updateLabel(int labelId, Label updatedLabel){
        Label label = labelRepo.findLabelById(labelId);
        updatedLabel.setUser(label.getUser());
//        updatedLabel.setFolder(label.getFolder());
        labelRepo.save(updatedLabel);
        return 1;
    }

    public int deleteLabel(int labelId){
        labelRepo.deleteById(labelId);
        return 1;
    }
}
