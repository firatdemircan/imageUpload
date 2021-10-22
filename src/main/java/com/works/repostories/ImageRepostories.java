package com.works.repostories;

import com.works.entites.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ImageRepostories extends JpaRepository<Image,Integer> {

    @Query("Select a from Image a where user_id = ?1 and document_type = ?2")
    Image checkDocumentByUserId(Integer userId, String docType);

    @Query("Select fileName from Image a where user_id = ?1 and document_type = ?2")
    String getUploadDocumnetPath(Integer userId, String docType);

}
