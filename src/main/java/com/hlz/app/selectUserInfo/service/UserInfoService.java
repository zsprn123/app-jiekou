package com.hlz.app.selectUserInfo.service;

import com.hlz.app.selectUserInfo.model.UserInfoDto;

import java.util.List;

public interface UserInfoService {
    List<UserInfoDto> FindUserInfo(String user_uuid);
}
