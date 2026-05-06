package com.capstone.auth.domain.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@ToString(exclude = "role")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {
  @Id
  String userId;

  @Column(unique = true, nullable = false)
  String email;

  @Column(unique = true, nullable = false)
  String username;

//  @Column(nullable = false)
//  LocalDateTime createdAt;
//
//  @Column(nullable = false)
//  LocalDateTime updatedAt;

  @Column(nullable = false)
  Boolean isEnabled;

  @Column(nullable = false)
  Boolean isLocked;

  String lockedReason;

  LocalDateTime lockedAt;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "role_id")
  Roles role;

  @Transient
  Collection<? extends GrantedAuthority> authorities;

//  @PrePersist
//  void onCreate() {
//    this.createdAt = LocalDateTime.now();
//    this.updatedAt = this.createdAt;
//  }
//
//  @PreUpdate
//  void onUpdate() {
//    this.updatedAt = LocalDateTime.now();
//  }
}
