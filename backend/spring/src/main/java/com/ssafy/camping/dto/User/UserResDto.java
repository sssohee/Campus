package com.ssafy.camping.dto.User;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@ApiModel(value = "UserResDto : 회원정보")
public class UserResDto {
    @ApiModelProperty(value = "회원 고유번호")
    @NotBlank(message = "userUid는 빈 값이 올 수 없습니다.")
    private String userUid;

    @ApiModelProperty(value = "회원 이름")
    @NotBlank(message = "userName은 빈 값이 올 수 없습니다.")
    private String userName;

    @ApiModelProperty(value = "회원 상태")
    @NotBlank(message = "userState는 빈 값이 올 수 없습니다.")
    private String userState;

    @ApiModelProperty(value = "회원 프로필 사진")
    private String userProfile;
}
