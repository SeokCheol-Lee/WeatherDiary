package com.example.weatherdiary.repository;

import com.example.weatherdiary.domain.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
class JpaMemoRepositoryTest {

    @Autowired
    JpaMemoRepository jpaMemoRepository;

    @Test
    void insertMemoTest(){
        //given
        Memo memo = new Memo(10,"memo");
        //when
        jpaMemoRepository.save(memo);


        //thensdf
        List<Memo> memoList = jpaMemoRepository.findAll();


        assertTrue(memoList.size() > 0);
    }

    @Test
    void findByIdTest(){
        Memo memo = new Memo(10,"memo");

        Memo memo1 = jpaMemoRepository.save(memo);

        Optional<Memo> result = jpaMemoRepository.findById(memo1.getId());
        assertEquals(result.get().getText(), "memo");
    }

}