package com.chapter_6.interf;

import java.util.Optional;
import java.util.function.Consumer;

import com.chapter_6.Twoot;
import com.chapter_6.TwootQuery;

public interface TwootRepository {
	Twoot add(String id, String userId, String content);

    Optional<Twoot> get(String id);

    void delete(Twoot twoot);

    void query(TwootQuery twootQuery, Consumer<Twoot> callback);

    void clear();
}
