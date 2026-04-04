package com.pinpon.inventory.management.user.dto;

import com.pinpon.inventory.management.user.entity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserResponseDTO {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Role role;
}
