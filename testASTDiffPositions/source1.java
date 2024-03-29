/*
 * Copyright (c) 2010-2012 Mark Allen.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.restfb.types;

import java.io.Serializable;

import com.restfb.Facebook;
import com.restfb.util.ReflectionUtils;

/**
 * Represents the <a
 * href="http://developers.facebook.com/docs/reference/api/">Venue Graph API
 * type</a>.
 *
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class Venue implements Serializable {

    @Facebook
    private String id;

    @Facebook
    private String street;

    @Facebook
    private String city;

    @Facebook
    private String state;

    @Facebook
    private String country;

    @Facebook
    private String zip;

    @Facebook
    private Double latitude;

    @Facebook
    private Double longitude;

    private static final long serialVersionUID = 1L;

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return ReflectionUtils.hashCode(this);
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object that) {
        return ReflectionUtils.equals(this, that);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ReflectionUtils.toString(this);
    }

    /**
     * Facebook id of the venue.
     *
     * @return Facebook id of the venue.
     */
    public String getId() {
        return id;
    }

    public void setId(String val) {
        this.id = val;
    }

    /**
     * Street address of the venue.
     *
     * @return Street address of the venue.
     */
    public String getStreet() {
        return street;
    }

    /**
     * The venue's city.
     *
     * @return The venue's city.
     */
    public String getCity() {
        return city;
    }

    public void setCity(String val) {
        this.city = val;
    }

    /**
     * The venue's state.
     *
     * @return The venue's state.
     */
    public String getState() {
        return state;
    }

    public void setState(String val) {
        this.state = val;
    }

    /**
     * The venue's zip code.
     *
     * @return The venue's zip code.
     */
    public String getZip() {
        return zip;
    }

    /**
     * The venue's country.
     *
     * @return The venue's country.
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String val) {
        this.country = val;
    }

    /**
     * The venue's latitude.
     *
     * @return The venue's latitude.
     */
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double val) {
        this.latitude = val;
    }

    /**
     * The venue's longitude.
     *
     * @return The venue's longitude.
     */
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double val) {
        this.longitude = val;
    }

    public void setFrom(Location location) {

        if (location == null)
            return;

        this.latitude = location.getLatitude();
        this.longitude = location.getLongitude();
        this.street = location.getStreet();
        this.city = location.getCity();
        this.state = location.getState();
        this.zip = location.getZip();
        this.country = location.getCountry();

    }

}
