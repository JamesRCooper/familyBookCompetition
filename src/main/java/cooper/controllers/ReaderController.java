/*
 * Copyright (C) 2015 by Amobee Inc.
 * All Rights Reserved.
 */
package cooper.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import cooper.models.Reader;
import cooper.repos.ReaderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

@RestController
@RequestMapping("/reader")
public class ReaderController {

    private final ReaderRepository readerRepository;

    @Autowired
    public ReaderController(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    @RequestMapping(value = "list", method = GET)
    public List<Reader> listReadersExpanded() {
        return Lists.newArrayList(readerRepository.findAll());
    }
}
