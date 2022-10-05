package ru.nova.sweater.repo;

import org.springframework.data.repository.CrudRepository;
import ru.nova.sweater.domain.Message;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
}
