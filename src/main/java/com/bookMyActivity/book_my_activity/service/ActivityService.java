package com.bookMyActivity.book_my_activity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookMyActivity.book_my_activity.model.Activity;
import com.bookMyActivity.book_my_activity.repository.ActivityRepository;

@Service
public class ActivityService {
    private final ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public Activity getActivityById(String id) {
        return activityRepository.findById(id).orElse(null);
    }

    public Activity createActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    public Activity updateActivity(String id, Activity activityDetails) {
        Activity activity = activityRepository.findById(id).orElse(null);
        if (activity != null) {
            activity.setTitle(activityDetails.getTitle());
            activity.setDescription(activityDetails.getDescription());
            activity.setCategory(activityDetails.getCategory());
            activity.setStartDate(activityDetails.getStartDate());
            activity.setEndDate(activityDetails.getEndDate());
            activity.setDayOfWeek(activityDetails.getDayOfWeek());
            activity.setTime(activityDetails.getTime());
            activity.setDuration(activityDetails.getDuration());
            activity.setLocation(activityDetails.getLocation());
            activity.setMinAge(activityDetails.getMinAge());
            activity.setMaxAge(activityDetails.getMaxAge());
            activity.setMaxParticipants(activityDetails.getMaxParticipants());
            activity.setStatus(activityDetails.getStatus());
            activity.setPrice(activityDetails.getPrice());
            activity.setImageUrls(activityDetails.getImageUrls());
            return activityRepository.save(activity);
        }
        return null;
    }

    public void deleteActivity(String id) {
        activityRepository.deleteById(id);
    }

    public List<Activity> getActivitiesByCategory(String category) {
        return activityRepository.findByCategory(category);
    }

    public List<Activity> getActivitiesByStatus(Activity.Status status) {
        return activityRepository.findByStatus(status);
    }
}