package com.example.themeunderstanding.Modals;

import java.util.List;

public class Latest {
    String author;
    String domain;
    String image;
    String link;
    String publisher;
    String pubLogo;
    String pubLogoLarge;
    String title;
    List<RelatedArticles> relatedArticles;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPubLogo() {
        return pubLogo;
    }

    public void setPubLogo(String pubLogo) {
        this.pubLogo = pubLogo;
    }

    public String getPubLogoLarge() {
        return pubLogoLarge;
    }

    public void setPubLogoLarge(String pubLogoLarge) {
        this.pubLogoLarge = pubLogoLarge;
    }

    public List<RelatedArticles> getRelatedArticles() {
        return relatedArticles;
    }

    public void setRelatedArticles(List<RelatedArticles> relatedArticles) {
        this.relatedArticles = relatedArticles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static class RelatedArticles{
        String author;
        String domain;
        String image;
        String link;
        String publisher;
        String pubLogo;
        String pubLogoLarge;
        String title;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getPubLogo() {
            return pubLogo;
        }

        public void setPubLogo(String pubLogo) {
            this.pubLogo = pubLogo;
        }

        public String getPubLogoLarge() {
            return pubLogoLarge;
        }

        public void setPubLogoLarge(String pubLogoLarge) {
            this.pubLogoLarge = pubLogoLarge;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
