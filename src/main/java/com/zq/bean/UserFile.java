package com.zq.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserFile {

    private Integer id;
    private String oldFileName;
    private String newFileName;
    private String ext; //文件后缀
    private String path;
    private String size;
    private String type;
    private String isImg;
    private int downCounts;
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date uploadTime;
    private int userId;
}
