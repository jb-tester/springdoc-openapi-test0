package com.mytests.spring.springdocOpenapiTest0;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MemoController implements MemoApi {

    private List<Memo> memos;

    @Override
    public List<Memo> findAll() {
        return memos;
    }

    @Override
    public Memo findById(String id) {
        return memos.stream().filter(memo -> memo.getId().equals(id)).findFirst().orElseGet(null);
    }

    @Override
    public Memo save(Memo memo) {
        memos.add(memo);
        return memo;
    }

    @Override
    public Memo update(String id, Memo memo) {
       
        for (Memo t : memos) {
            if (t.getId().equals(id)) {
                t.setText(memo.getText());
                t.setCategory(memo.getCategory());
            }
        }

        return memo;
    }

    @Override
    public void delete(String id) {
        memos.removeIf(t -> t.getId().equals(id));
    }

    @PostConstruct
    public void onInit() {
        memos = new ArrayList<>();
        memos.add(new Memo("1","meeting with crew: possible areas to improve","work"));
        memos.add(new Memo("2","plan the cats vaccination","family"));
        memos.add(new Memo("3","visit parents this Saturday","family"));
    }
}