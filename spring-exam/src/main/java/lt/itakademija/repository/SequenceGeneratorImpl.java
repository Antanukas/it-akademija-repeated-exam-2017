package lt.itakademija.repository;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

/**
 * Created by mariusg on 2017.03.19.
 */
@Service
public class SequenceGeneratorImpl implements SequenceGenerator {

    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    public Long getNext() {
        return sequence.incrementAndGet();
    }

}
