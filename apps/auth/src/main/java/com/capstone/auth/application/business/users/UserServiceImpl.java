package com.capstone.auth.application.business.users;

import com.capstone.auth.infrastructure.persistence.*;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.capstone.auth.application.business.profile.ProfileService;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserServiceImpl implements UserService {
  UserRepository repo;
  ProfileRepository profileRepo;
  ProfileService pSrv;
  RoleRepository roleRepo;
}
