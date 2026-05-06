package com.capstone.auth.domain.model;

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
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Profile {
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

  @JsonFormat(pattern = "yyyy-MM-dd")
  LocalDate birthday;
}
