package com.wheat.NameNode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class NameNodeController {
    private static final Log log = LogFactory.getLog(NameNodeController.class);

    @Value("${file.blocksize}")
    private int bs;
    @Value("${file.replicas}")
    private int rep;

    private FileManager fm = new FileManager(0, bs, rep);

    @GetMapping
    public List<File> getAllFiles(){
        if(log.isTraceEnabled()) {
            log.trace("getAllFiles() called");
        }

        return fm.getFilelist();
    }

    @GetMapping("/{id}")
    public File getOneFile(@PathVariable int id) {
        if(log.isTraceEnabled()) {
            log.trace("getFile " + id);
        }
        if(fm.getFilelist().contains(id)) {
            //TODO:get file
            return fm.getFilelist().get(fm.getFilelist().indexOf(id));
        }else {
            throw new ResourceNotFoundException();
        }
    }

    @PostMapping
    public File postOneFile(@RequestBody File filesDto) {
        if(log.isTraceEnabled()) {
            log.trace("post a file to server: " + filesDto);
        }
        //TODO:save it to server

        filesDto.setId(3);
        return filesDto;
    }

    @PutMapping("/{id}")
    public File updateOneFile(@PathVariable int id, @RequestBody File filesDto) {
        if(log.isTraceEnabled()) {
            log.trace("update file: " + id);
        }
        if(fm.getFilelist().contains(id)) {
            //TODO: update file in server
            return fm.getFilelist().get(fm.getFilelist().indexOf(id));
        }else {
            throw new ResourceNotFoundException();
        }
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteOne(@PathVariable int id, HttpServletRequest request,
                                         @RequestParam(value = "delete_reason", required = false) String deleteReason) throws Exception {
        if(log.isTraceEnabled()) {
            log.trace("delete file: " + id);
        }
        Map<String, String> result = new HashMap<>();
        if(id == 1) {
            //TODO: delete file
        }else {
            throw new ResourceNotFoundException();
        }
        return result;
    }

}
