package com.mytests.spring.springdocOpenapiTest0;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/memos")
@Tag(name = "Memo API", description = "memo description")  // ignored
@SecurityRequirement(name = "api")    // ignored
public interface MemoApi {

    @GetMapping("/all")
    @ResponseStatus(code = HttpStatus.OK)   // ignored - https://youtrack.jetbrains.com/issue/IDEA-266635
    List<Memo> findAll();

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    Memo findById(@PathVariable String id);

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    Memo save(@RequestBody Memo memo);

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    Memo update(@PathVariable String id, @RequestBody Memo memo);

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void delete(@PathVariable String id);
}