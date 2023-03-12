package com.example.PastebinClone.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="paste")
public class Paste implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "pasteId", columnDefinition = "integer")
    private long pasteId;
    @Column(name = "pasteName", columnDefinition = "varchar")
    private String pasteName;

    @Column(name = "pasteInstanceMoment", columnDefinition = "timestamp")
    private Date pasteInstanceMoment = new Date( );

    private SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");

    private String pasteInstanceMomentString = ft.format(pasteInstanceMoment);

    @Column(name = "syntaxHighlightingStatus", columnDefinition = "boolean")
    private Boolean syntaxHighlightingStatus;

    @Column(name = "syntaxHighlighting", columnDefinition = "text")
    private String syntaxHighlighting = "text";

    @Column(name = "pasteText", columnDefinition = "text")
    private String pasteText;

    @Column(name = "expiration", columnDefinition = "integer")
    private long expiration;

    @Column(name = "exposure", columnDefinition = "varchar")
    private String exposure;

    @Column(name = "folder", columnDefinition = "varchar")
    private String folder;

    @Column(name = "passwordStatus", columnDefinition = "boolean")
    private boolean passwordStatus;

    @Column(name = "password", columnDefinition = "varchar")
    private String password;

    @Column(name = "burnAfterRead", columnDefinition = "boolean")
    private boolean burnAfterRead;

    @Column(name = "objectSize", columnDefinition = "integer")
    private long objectSize;

    public long getPasteId() {
        return pasteId;
    }

    public void setPasteId(long pasteId) {
        this.pasteId = pasteId;
    }

    public String getPasteName() {
        return pasteName;
    }

    public void setPasteName(String pasteName) {
        this.pasteName = pasteName;
    }

    public Date getPasteInstanceMoment() {
        return pasteInstanceMoment;
    }

    public void setPasteInstanceMoment(Date pasteInstanceMoment) {
        this.pasteInstanceMoment = pasteInstanceMoment;
    }

    public Boolean getSyntaxHighlightingStatus() {
        return syntaxHighlightingStatus;
    }

    public void setSyntaxHighlightingStatus(Boolean syntaxHighlightingStatus) {
        this.syntaxHighlightingStatus = syntaxHighlightingStatus;
    }

    public String getPasteText() {
        return pasteText;
    }

    public void setPasteText(String pasteText) {
        this.pasteText = pasteText;
    }

    public long getExpiration() {
        return expiration;
    }

    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }

    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public boolean isPasswordStatus() {
        return passwordStatus;
    }

    public void setPasswordStatus(boolean passwordStatus) {
        this.passwordStatus = passwordStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBurnAfterRead() {
        return burnAfterRead;
    }

    public void setBurnAfterRead(boolean burnAfterRead) {
        this.burnAfterRead = burnAfterRead;
    }

    public long getObjectSize() {
        return objectSize;
    }

    public void setObjectSize(long objectSize) {
        this.objectSize = objectSize;
    }

    public String getSyntaxHighlighting() {
        return syntaxHighlighting;
    }

    public void setSyntaxHighlighting(String syntaxHighlighting) {
        this.syntaxHighlighting = syntaxHighlighting;
    }

    public String getPasteInstanceMomentString() {
        return pasteInstanceMomentString;
    }

    public void setPasteInstanceMomentString(String pasteInstanceMomentString) {
        this.pasteInstanceMomentString = pasteInstanceMomentString;
    }

    @Override
    public String toString() {
        return "Paste{" +
                "pasteId=" + pasteId +
                ", pasteName='" + pasteName + '\'' +
                ", pasteInstanceMoment=" + pasteInstanceMoment +
                ", syntaxHighlightingStatus=" + syntaxHighlightingStatus +
                ", syntaxHighlighting='" + syntaxHighlighting + '\'' +
                ", pasteText='" + pasteText + '\'' +
                ", expiration=" + expiration +
                ", exposure='" + exposure + '\'' +
                ", folder='" + folder + '\'' +
                ", passwordStatus=" + passwordStatus +
                ", password='" + password + '\'' +
                ", burnAfterRead=" + burnAfterRead +
                ", objectSize=" + objectSize +
                '}';
    }
}