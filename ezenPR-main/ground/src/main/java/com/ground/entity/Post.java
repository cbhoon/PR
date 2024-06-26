package com.ground.entity;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.ground.entity.Post;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Post {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "post_id")
   private Integer postId;

   private Integer mh_id;

   private String title;
   
   private String cntent;

   private String img_path;
   
   private String hash_tag;
   
   private String url_path;
   
   @CreationTimestamp
   private LocalDateTime create_date = LocalDateTime.now();
   
   @UpdateTimestamp
   private LocalDateTime update_date = LocalDateTime.now();
   
   
}