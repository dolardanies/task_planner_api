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
public interface TaskService {
    
    List<Task> geTasksList();        
    Task getTaskById(String id);        
    List<Task> getTasksByUserId(String userId);        
    Task assignedTaskToUser(String taskId, User user);        
    void removeTask();        
    Task updateTask(Task task);
    
}
