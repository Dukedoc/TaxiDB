package com.epam.ryazan.taxi.dba;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.ryazan.taxi.dba.pojo.Role;

@RestController
public interface RolesManager {

   @RequestMapping("/roles/get")
   List<Role> getAllRoles();


}
