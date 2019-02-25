package com.moosilaukecycling.service;

import com.moosilaukecycling.domain.Repairable;

public class RepairService {

    public RepairService() { }

    public void repair(Repairable repairable) {
        repairable.repair();
    }

}
