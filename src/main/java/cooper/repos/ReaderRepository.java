/*
 * Copyright (C) 2015 by Amobee Inc.
 * All Rights Reserved.
 */
package cooper.repos;

import cooper.models.Reader;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ReaderRepository extends MongoRepository<Reader, String> {
}