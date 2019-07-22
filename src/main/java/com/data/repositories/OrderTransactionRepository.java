package com.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.data.documents.OrderTransaction;

public interface OrderTransactionRepository extends MongoRepository<OrderTransaction, String> {}
