package com.example.maapi.repositories;

import com.example.maapi.models.Folder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FolderRepo {
    @Query("select folder from Folder folder")
    public List<Folder> findAllFolders();

    @Query("select folder from Folder folder where folder.id=:fid")
    public Folder findFolderById(@Param("fid") int folderId);

    @Query("select folder from Folder folder where folder.user.id=:uid")
    public List<Folder> findFoldersByUser(@Param("uid") int userId);
    
}
