package com.capstone.auth.domain.model;

import com.capstone.common.model.BaseModel;
import com.capstone.common.utils.SharedConstant;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "profile")
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Profile extends BaseModel {
  @Id
  String profileId;

  @OneToOne(fetch = FetchType.EAGER)
  @MapsId
  @JoinColumn(name = "user_id")
  Users users;

  @Transient
  String fullname;
  String avatarUrl;
  String address;

  @Column(unique = true, nullable = false)
  String phoneNumber;
  Boolean gender;

  @JsonFormat(pattern = SharedConstant.DATE_PATTERN)
  LocalDate birthday;
}
