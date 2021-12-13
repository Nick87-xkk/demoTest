package com.example.demo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author nick
 * @since 2021-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sid;

    private Integer cid;

    private Integer score;


}
