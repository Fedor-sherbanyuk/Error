package com.example.demo.repository;

import com.example.demo.entity.ImageModel;
import com.example.demo.entity.Post;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ImageModelRepository extends JpaRepository<ImageModel,Long> {

   Optional<ImageModel> findByUserId(Long userid);
   Optional<ImageModel> findByPostId(Long postid);
}
