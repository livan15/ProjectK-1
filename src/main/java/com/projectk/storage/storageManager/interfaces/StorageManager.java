package com.projectk.storage.storageManager.interfaces;

import com.projectk.storage.connectionManager.customExceptions.StorageException;

import java.sql.SQLException;
import java.util.List;

public interface StorageManager<T, Q> {
    List<T> filter(Q searchEntity) throws StorageException;

    void add(T entity) throws StorageException;

    void delete(T entity) throws StorageException;

    void update(T entity) throws StorageException;
}
