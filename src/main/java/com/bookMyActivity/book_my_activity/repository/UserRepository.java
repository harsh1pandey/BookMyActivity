package com.bookMyActivity.book_my_activity.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookMyActivity.book_my_activity.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
    List<User> findByRole(User.Role role);
    List<User> findByAlertsForCategoriesContaining(String category);
}