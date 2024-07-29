package com.nath.sma.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nath.sma.entity.Section;
import com.nath.sma.repository.SectionRepository;

@Service
public class SectionServiceImpl implements SectionService {

    private SectionRepository sectionRepository;

    @Autowired
    public void setSectionService(SectionRepository sectionRepository){
        this.sectionRepository = sectionRepository;
    }

    @Override
    public void deleteSection(Section section) {
        
        sectionRepository.delete(section);
    }

    @Override
    public Iterable<Section> getAllSection() {
        return sectionRepository.findAll();
    }

    @Override
    public void saveSection(Section section) {
        sectionRepository.save(section);
    }

    @Override
    public Section getSectionById(long id) {
        return sectionRepository.findById(id);
    }


}
