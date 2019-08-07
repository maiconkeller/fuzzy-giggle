package com.example.demo.Services;

import com.example.demo.models.Deploy;
import com.example.demo.repositories.DeployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeployService {

    private DeployRepository deployRepository;

    @Autowired
    public DeployService(DeployRepository deployRepository) {
        this.deployRepository = deployRepository;
    }

    public Deploy save(Deploy deploy) {
        return this.deployRepository.save(deploy);
    }

}
