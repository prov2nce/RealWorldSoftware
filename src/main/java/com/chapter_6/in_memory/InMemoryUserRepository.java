package com.chapter_6.in_memory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.chapter_6.FollowStatus;
import com.chapter_6.User;
import com.chapter_6.interf.UserRepository;

public class InMemoryUserRepository implements UserRepository{
	private final Map<String, User> userIdToUser = new HashMap<>();
	
	@Override
    public Optional<User> get(final String userId) {
        return Optional.ofNullable(userIdToUser.get(userId));
    }
	
	@Override
    public boolean add(final User user) {
        return userIdToUser.putIfAbsent(user.getId(), user) == null;
    }
	
	@Override
    public void update(final User user) {
        // Deliberately blank - since we don't actually persist this data
    }
	
	@Override
    public FollowStatus follow(final User follower, final User userToFollow) {
        return userToFollow.addFollower(follower);
    }
	
	@Override
    public void clear() {
        userIdToUser.clear();
    }

	@Override
    public void close() {

    }
}
