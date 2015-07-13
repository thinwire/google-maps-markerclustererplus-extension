package com.vaadin.tapio.googlemaps.markerclustererplus;

import com.vaadin.server.AbstractExtension;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.markerclustererplus.client.MarkerClustererPlusState;

public class MarkerClustererPlus extends AbstractExtension {

    private GoogleMap map;

    public MarkerClustererPlus(GoogleMap map) {
        this.map = map;
        extend(map);
    }

    @Override
    public MarkerClustererPlusState getState() {
        return (MarkerClustererPlusState) super.getState();
    }
}
