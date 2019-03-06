/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.ieti.task_planner_api;

import java.util.List;

/**
 *
 * @author 2104481
 */
public interface UserService {
    
    List<User>  getUsersList ();
    User  getUserById ();
    User  createUser ();    
    User  updateUser ();    
    void  removeUser ();
}
