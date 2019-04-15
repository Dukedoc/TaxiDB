package com.epam.ryazan.taxi.dba.pojo;

import java.util.Objects;

public class Role {
   private long roleId;
   private String roleDescription;

   public Role() {}

   public Role(long roleId, String roleDescription) {
      this.roleId = roleId;
      this.roleDescription = roleDescription;
   }

   public long getRoleId() {
      return roleId;
   }

   public void setRoleId(long roleId) {
      this.roleId = roleId;
   }

   public String getRoleDescription() {
      return roleDescription;
   }

   public void setRoleDescription(String roleDescription) {
      this.roleDescription = roleDescription;
   }

   @Override
   public String toString() {
      return "Role{" + "roleId=" + roleId + ", roleDescription='" + roleDescription + '\'' + '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }
      if (o == null || getClass() != o.getClass()) {
         return false;
      }
      Role role = (Role) o;
      return roleId == role.roleId && Objects.equals(roleDescription, role.roleDescription);
   }

   @Override
   public int hashCode() {

      return Objects.hash(roleId, roleDescription);
   }
}
