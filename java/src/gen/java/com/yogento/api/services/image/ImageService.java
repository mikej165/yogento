package com.yogento.api.services.image;

public interface ImageService {
    public boolean deleteImageThumbnail(String imageUrl, com.yogento.api.models.image.ImageResolution thumbnailResolution);
    public String getImageThumbnailUrl(String imageUrl, com.yogento.api.models.image.ImageResolution thumbnailResolution) throws com.yogento.api.services.image.NoSuchImageException;
}
