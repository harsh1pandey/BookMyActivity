package com.bookMyActivity.book_my_activity.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookMyActivity.book_my_activity.model.Activity;

public interface ActivityRepository extends MongoRepository<Activity, String> {
    List<Activity> findByCategory(String category);
    List<Activity> findByStatus(Activity.Status status);
    List<Activity> findByUsersId(String userId);
}