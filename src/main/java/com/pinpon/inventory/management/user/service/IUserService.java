package com.pinpon.inventory.management.user.service;

import com.pinpon.inventory.management.user.dto.CreateUserRequestDTO;
import com.pinpon.inventory.management.user.dto.UpdatedUserRequestDTO;
import com.pinpon.inventory.management.user.dto.UserResponseDTO;

import java.util.List;

public interface IUserService {
    //create
    UserResponseDTO createUser(CreateUserRequestDTO requestDTO);
    //get
    List<UserResponseDTO> getAllUsers();
    //get id
    UserResponseDTO getUserById(Long id);
    //update
    UserResponseDTO updateUser(Long id, UpdatedUserRequestDTO requestDTO);
    //delete
    void deleteUser(Long id);
}
