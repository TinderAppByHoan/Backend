package com.capstone.auth.adapter;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/me")
@SecurityRequirement(name = "Keycloak")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Tag(name = "", description = "")
public class ProfileController {
}
