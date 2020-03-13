package com.michalkowol.demodata;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@RequiredArgsConstructor
@Component
public class CompositeDemoData {

    private final List<DemoData> demoData;

    @PostConstruct
    @Transactional
    public void addDemoData() {
        demoData.forEach(DemoData::addDemoData);
    }
}
