package com.example.saatcms.requirement.main;

import javax.persistence.*;

@Entity
@Table
public class Content {
    @Id
    @SequenceGenerator(
            name= "content_sequence",
            sequenceName= "content_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "contentSequence"
    )
    private Long id;
    private String name;
    private String status;
    private String posterUrl;
    private String videoUrl;

    public Content(Long id,
                   String name,
                   String status,
                   String posterUrl,
                   String videoUrl) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.posterUrl = posterUrl;
        this.videoUrl = videoUrl;
    }

    public Content(String name,
                   String status,
                   String posterUrl,
                   String videoUrl) {
        this.name = name;
        this.status = status;
        this.posterUrl = posterUrl;
        this.videoUrl = videoUrl;

    }

    public Content() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", posterUrl='" + posterUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                '}';
    }
}
