package com.company.project.service;

import com.company.project.model.User;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2018/10/11.
 */
public interface UserService extends Service<User> {
    //如果需要拓展service方法,只需要在此定义方法即可,因为实现类已经继承抽象service类,实现了所有的基本方法
    User getUserByNickName(String nickName);

}
