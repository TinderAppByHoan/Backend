package com.capstone.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseModel {
  // TODO: xử lý modified
  @Column(nullable = false)
  String createdBy;

  @Column(nullable = false)
  LocalDateTime createdAt;

  @Column(nullable = false)
  String modifiedBy;

  @Column(nullable = false)
  LocalDateTime modifiedAt;

  @PrePersist
  void onCreate() {
    this.createdAt = LocalDateTime.now();
    this.modifiedAt = this.createdAt;
  }

  @PreUpdate
  void onUpdate() {
    this.modifiedAt = LocalDateTime.now();
  }
}
