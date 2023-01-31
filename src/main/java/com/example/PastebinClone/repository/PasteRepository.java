package com.example.PastebinClone.repository;

import com.example.PastebinClone.entity.Paste;
import org.springframework.data.repository.CrudRepository;


public interface PasteRepository extends CrudRepository<Paste, Long> {
}
