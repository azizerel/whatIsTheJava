package com.azizerel.javablog.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * created by Abdulaziz Erel on 21:18 10.02.2020
 **/
@Getter
@Setter
@NoArgsConstructor
public class BaseModel {

    private Long id;

    private Integer version;

    private Long createdAt;

    private Long lastModified;
}
