package br.com.sather.atelieback.authentication.user.dto;

import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class UserRoleDto {
  private UUID idUser;

  private List<UUID> idsRoles;
}
