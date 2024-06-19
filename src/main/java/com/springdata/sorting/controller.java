package com.springdata.sorting;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/all")
public class controller {
@Autowired
    private service servi;
private repo r;
@GetMapping("/get")
    public List<entity>alldata(){
    return servi.give();
}
@GetMapping("/get/{id}")
    public entity id(@PathVariable Long id){
return servi.getbyid(id);
}
//    @GetMapping("/pagenation")
//    public Page<entity> getAllUsers(@RequestParam(defaultValue = "0") int page,
//                                    @RequestParam(defaultValue = "10") int size) {
//        return servi.getAllUsersWithPagination(page, size);
//    }
//    @GetMapping
//    public APIResponse<List<entity>> givethedata(){
//    List<entity>sorted=servi.give();
//        APIResponse<List<entity>> listAPIResponse = new APIResponse<>(sorted.size(), sorted);
//        return listAPIResponse;
//    }
//    @GetMapping("{bus}")
//    public APIResponse<List<entity>> givedata(@RequestParam String bus){
//        List<entity>asc=servi.findbysort(bus);
//        return new APIResponse<>(asc.size(),asc);
//}
//    @GetMapping("/{des}")
//    public APIResponse<List<entity>> desc(@PathVariable String descending){
//        List<entity>des=servi.desc(descending);
//        return new APIResponse<>(des.size(),des);}


    @GetMapping("/pagination")
    public  Page<entity>getthevalue(@RequestParam(defaultValue = "0")
    int page,
    @RequestParam (defaultValue = "10")
    int size,
@RequestParam(defaultValue = "name")
String sortby){
    return servi.getvalue(page,size,sortby);
    }
@PostMapping("/post")
    public entity postthevalue(@RequestBody entity postit){
    return servi.post(postit);
}
}




