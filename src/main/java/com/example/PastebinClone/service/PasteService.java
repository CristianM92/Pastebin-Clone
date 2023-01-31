package com.example.PastebinClone.service;

import com.example.PastebinClone.dto.PasteDTO;
import com.example.PastebinClone.entity.Paste;
import com.example.PastebinClone.repository.PasteRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class PasteService {

    private final PasteRepository pasteRepository;

    public PasteService(PasteRepository pasteRepository) {
        this.pasteRepository = pasteRepository;
    }

    public long addPaste(PasteDTO pasteDTO) {

        Paste newPaste = new Paste();
        newPaste.setPasteName(pasteDTO.getPasteName());
        newPaste.setPasteText(pasteDTO.getPasteText());
        newPaste.setExpiration(pasteDTO.getExpiration());
        newPaste.setBurnAfterRead(pasteDTO.isBurnAfterRead());
        newPaste.setExposure(pasteDTO.getExposure());
        newPaste.setFolder(pasteDTO.getFolder());
        newPaste.setPassword(pasteDTO.getPassword());
        newPaste.setPasswordStatus(pasteDTO.isPasswordStatus());
        newPaste.setPasteInstanceMoment(pasteDTO.getPasteInstanceMoment());
        newPaste.setSyntaxHighlighting(pasteDTO.getSyntaxHighlighting());
        newPaste.setPasteInstanceMomentString(pasteDTO.getPasteInstanceMomentString());

        return pasteRepository.save(newPaste).getPasteId();
    }

    public List<Paste> getAllPastes() {
        Iterable<Paste> pastes = this.pasteRepository.findAll();
        List<Paste> pasteList = new ArrayList<>();
        pastes.forEach(paste -> {pasteList.add(paste);});
        return pasteList;
    }

    public Paste getSelectedPaste(long id) {
        if (pasteRepository.findById(id).isPresent()) {
            Paste selectedPaste = pasteRepository.findById(id).get();
            return selectedPaste;
        } else {
            return null;
        }
    }
}