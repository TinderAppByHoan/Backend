package com.capstone.auth.domain.model;

import com.capstone.common.model.BaseModel;
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
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users extends BaseModel {
  @Id
  String userId;

  @Column(unique = true, nullable = false)
  String email;

  @Column(unique = true, nullable = false)
  String username;

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
}
