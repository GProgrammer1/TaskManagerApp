package com.TaskManager.TaskManager.Task;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.regex.Pattern;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks") // Optional: specify the table name if different from the class name
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use IDENTITY or another strategy based on your requirements
    private Long id;

    private String description;
    private boolean completed;
    private Long executorID;
    private LocalDateTime deadline;



}


