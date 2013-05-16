package com.maxmind.geoip2.record;

import com.google.api.client.util.Key;

public class Subdivision extends RecordWithNames {
    @Key("iso_code")
    private String isoCode;

    public Subdivision() {
    }

    public String getIsoCode() {
        return isoCode;
    }
}
