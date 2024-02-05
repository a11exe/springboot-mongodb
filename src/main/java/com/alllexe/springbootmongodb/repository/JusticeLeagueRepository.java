package com.alllexe.springbootmongodb.repository;

import com.alllexe.springbootmongodb.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface JusticeLeagueRepository extends MongoRepository<Member, String> {

    /**
     * Этот метод извлекает подробности об участнике лиги справедливости, связанным с переданным именем.
     *
     * @param superHeroName имя участника лиги справедливости для поиска и извлечения.
     * @return возвращает {@link Member} с подробностями об участнике.
     */
    @Query("{ 'name' : {$regex: ?0, $options: 'i' }}")
    Member findBySuperHeroName(final String superHeroName);
}
