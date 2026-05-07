package com.capstone.auth.domain.model;

import com.capstone.common.enumerate.RoleName;
import com.capstone.common.model.BaseModel;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_roles")
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Roles extends BaseModel implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "role_id")
  String id;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false, unique = true)
  RoleName name;

  @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  Set<Users> users;

  public boolean removeUserFromRole(Users... usersList) {
    if (usersList != null && usersList.length > 0 && !users.isEmpty()) {
      Arrays.stream(usersList)
          .sequential()
          .forEach(user -> users.remove(user));
      return true;
    }
    return false;
  }

  public boolean addUserToRole(Users... usersList) {
    if (usersList != null && usersList.length > 0 && !users.isEmpty()) {
      users.addAll(Arrays.asList(usersList));
      return true;
    }
    return false;
  }

}
