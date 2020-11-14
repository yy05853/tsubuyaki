package com.yama.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.yama.springboot.model.Tsubuyaki;

public interface TsubuyakiRepository extends CrudRepository<Tsubuyaki, Long> {
    Iterable<Tsubuyaki> findAllByOrderByUpdatedTimeDesc();
}