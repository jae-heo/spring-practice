package com.example.springpractice.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {


    /**
     * 회원 관리 매핑들
     * 조회, 추가, 삭제, 수정 등
     * @return
     */

    @GetMapping
    public String user(){
        return "get users";
    }

    @PostMapping
    public String addUsers(){
        return "post users";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get userId = " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId){
        return "update userId = " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "delete userId = " + userId;
    }
}
