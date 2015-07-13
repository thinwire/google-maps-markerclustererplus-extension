package com.vaadin.tapio.googlemaps.markerclustererplus.client;

import com.google.gwt.maps.client.MapWidget;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.extensions.AbstractExtensionConnector;
import com.vaadin.shared.ui.Connect;
import com.vaadin.tapio.googlemaps.client.GoogleMapConnector;
import com.vaadin.tapio.googlemaps.client.GoogleMapInitListener;
import com.vaadin.tapio.googlemaps.markerclustererplus.MarkerClustererPlus;

@Connect(MarkerClustererPlus.class)
public class MarkerClustererPlusConnector extends AbstractExtensionConnector {
    @Override
    protected void extend(ServerConnector serverConnector) {
        GoogleMapConnector connector = (GoogleMapConnector) serverConnector;
        connector.addInitListener(new GoogleMapInitListener() {
            @Override
            public void mapWidgetInitiated(MapWidget map) {
                applyToMap(map);
            }

            @Override
            public void mapsApiLoaded() {
                // NOP
            }
        });
    }

    protected void applyToMap(MapWidget map) {

    }
}
