package com.test.teamlog.payload;

import com.test.teamlog.entity.Project;
import com.test.teamlog.entity.User;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

public class ProjectJoinDTO {
    @Data
    @Builder
    public static class ProjectJoinForProject {
        private Long id;
        private String projectName;
        private UserDTO.UserSimpleInfo user;
    }

    @Data
    @Builder
    public static class ProjectJoinForUser {
        private Long id;
        private String projectName;
    }
}
