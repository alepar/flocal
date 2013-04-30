package ru.alepar.flocal;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Future;

public class MoreGuava {

    private static Logger log = LoggerFactory.getLogger(MoreGuava.class);

    static <T> Predicate<T> notNull() {
        return new Predicate<T>() {
            @Override
            public boolean apply(T input) {
                return input != null;
            }
        };
    }

    static <T> Function<Future<T>, T> unwrapFuture() {
        return new Function<Future<T>, T>() {
            @Override
            public T apply(Future<T> input) {
                try {
                    return input.get();
                } catch (Exception e) {
                    log.error("future failed", e);
                    return null;
                }
            }
        };
    }
}
