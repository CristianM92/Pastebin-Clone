package com.example.PastebinClone.controller;

import com.example.PastebinClone.service.PasteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/view_selection1")
public class ViewSelectionController {

    private final PasteService pasteService;

    public ViewSelectionController(PasteService pasteService) {
        this.pasteService = pasteService;
    }

    @GetMapping(value = "/{id}")
    public String getSelectedPaste(@PathVariable(value = "id") long id, Model model){
        model.addAttribute("pastes", this.pasteService.getSelectedPaste(id));
        return "/view_selection";
    }

    @GetMapping
    public String getAllPastes( Model model){
        model.addAttribute("pastes", this.pasteService.getAllPastes());
        return "/view_selection";
    }
}