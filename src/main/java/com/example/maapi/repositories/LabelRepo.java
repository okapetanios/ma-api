package com.example.maapi.repositories;

import com.example.maapi.models.Label;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LabelRepo extends CrudRepository<Label, Integer> {
    @Query("select label from Label label")
    public List<Label> findAllLabels();

    @Query("select label from Label label where label.id=:lid")
    public Label findLabelById(@Param("lid") int labelId);

    @Query("select label from Label label where label.user.id=:uid")
    public List<Label> findLabelsByUser(@Param("uid") int userId);

    @Query("select label from Label label where label.folder.id=:fid")
    public List<Label> findLabelsByFolder(@Param("fid") int folderId);
}
