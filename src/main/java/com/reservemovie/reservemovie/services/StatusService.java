package com.reservemovie.reservemovie.services;

import com.reservemovie.reservemovie.entities.Status;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatusService {

    public Status acceptStatusDetails(Status status);

    public Status getStatusDetails(int id);

    public Status updateStatusDetails(Status status);

    public List<Status> getAllStatus();

    public void deleteStatus(Status status);


}
