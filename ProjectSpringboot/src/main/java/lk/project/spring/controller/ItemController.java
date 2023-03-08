package lk.project.spring.controller;

import lk.project.spring.dto.ItemDto;
import lk.project.spring.service.ItemService;
import lk.project.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllItem(){
        return new ResponseUtil(200,"OK",itemService.getAllItem());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveItem(@ModelAttribute ItemDto item) {
        itemService.saveItem(item);
        return new ResponseUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateItem(@RequestBody ItemDto item) {
        itemService.updateItem(item);
        return new ResponseUtil(200,"updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteItem(@RequestParam String id) {
        itemService.deleteItem(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil serarchItem(@PathVariable String id) {
        return new ResponseUtil(200,"OK",itemService.serarchItem(id));
    }

}
