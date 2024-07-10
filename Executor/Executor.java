package com.TaskManager.TaskManager.Executor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "executors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Executor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID ;

    private String name ;


}
