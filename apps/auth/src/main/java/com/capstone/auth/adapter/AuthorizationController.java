package com.capstone.auth.adapter;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/authorization")
@RequiredArgsConstructor
@Tag(name = "", description = "")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthorizationController {
}
