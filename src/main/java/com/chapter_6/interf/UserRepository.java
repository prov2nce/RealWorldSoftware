package com.chapter_6.interf;

import java.util.Optional;

import com.chapter_6.FollowStatus;
import com.chapter_6.User;

public interface UserRepository extends AutoCloseable {
    boolean add(User user);

    Optional<User> get(String userId);

    void update(User user);

    void clear();

    FollowStatus follow(User follower, User userToFollow);
}
