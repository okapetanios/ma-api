package com.example.maapi.services;

import com.example.maapi.models.Folder;
import com.example.maapi.models.User;
import com.example.maapi.repositories.FolderRepo;
import com.example.maapi.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FolderService {
    @Autowired
    FolderRepo folderRepo;
    @Autowired
    UserRepo userRepo;

    public List<Folder> findAllFolders(){
        return folderRepo.findAllFolders();
    }

    public Folder findFolderById(int folderId){
        return folderRepo.findFolderById(folderId);
    }

    public List<Folder> findFoldersByUser(int userId){
        return folderRepo.findFoldersByUser(userId);
    }

    public Folder createFolder(int userId, Folder folder){
        User user = userRepo.findUserById(userId);
        folder.setUser(user);
        return folderRepo.save(folder);
    }

    public int updateFolder(int folderId, Folder updatedfolder){
        Folder folder = folderRepo.findFolderById(folderId);
        updatedfolder.setUser(folder.getUser());
        folderRepo.save(updatedfolder);
        return 1;
    }

    public int deleteFolder(int folderId){
        folderRepo.deleteById(folderId);
        return 1;
    }
}
