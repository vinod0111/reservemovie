package com.reservemovie.reservemovie.services;

import com.reservemovie.reservemovie.dao.StatusDao;
import com.reservemovie.reservemovie.entities.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService{

    @Autowired
    StatusDao statusDao;

    @Override
    public Status acceptStatusDetails(Status status) {

        return statusDao.save(status);
    }

    @Override
    public Status getStatusDetails(int id) {
        return statusDao.findById(id).get();
    }

    @Override
    public Status updateStatusDetails(Status status) {

        return statusDao.save(status);
    }

    @Override
    public List<Status> getAllStatus() {
        return statusDao.findAll();
    }

    @Override
    public void deleteStatus(Status status) {

        statusDao.delete(status);
    }
}
