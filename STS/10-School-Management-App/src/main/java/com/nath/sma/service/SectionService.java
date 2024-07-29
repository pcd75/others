package com.nath.sma.service;
import com.nath.sma.entity.Section;

public interface SectionService {

    void deleteSection(Section section);

    Iterable<Section> getAllSection();

    void saveSection(Section section);

    Section getSectionById(long id);
    
}
