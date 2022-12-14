package com.example.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Entity.UserEntity;
import com.example.repository.UserRepository;

/**
 * usersテーブルを操作するサービス.
 * 
 * @author 萩田
 *
 */
@Transactional
@Service
public class InsertUserService {

	@Autowired
	private UserRepository repository;

	/**
	 * ユーザー登録.
	 * 
	 * @param user ユーザー情報
	 */
	public void insert(UserEntity userEntity) {
		// パスワードのハッシュ化
//		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
//		String hashedPassword = bcpe.encode(user.getPassword());
//		user.setPassword(hashedPassword);
//		repository.insert(userEntity);
		repository.save(userEntity);
	}

}
