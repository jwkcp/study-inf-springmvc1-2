package hello.spingmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/mapping/users")
public class MappingClassController {
    @GetMapping()
    public String users() {
        return "get users";
    }

    @PostMapping()
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get user = " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId, @RequestParam String username) {
        return "modify user = " + userId + "(" + username + ")";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete user = " + userId;
    }
}
