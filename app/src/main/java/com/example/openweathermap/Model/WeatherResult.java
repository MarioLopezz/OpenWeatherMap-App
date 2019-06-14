package com.example.openweathermap.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherResult {
        @SerializedName("coord")
        Coord Coord;
        @SerializedName("weather")
        List<Weather> weathers;
        private String base;
        @SerializedName("main")
        Main Main;
        private float visibility;
        @SerializedName("wind")
        Wind Wind;
        @SerializedName("clouds")
        Clouds Clouds;
        private float dt;
        @SerializedName("sys")
        Sys Sys;
        private float timezone;
        private float id;
        private String name;
        private float cod;

        public WeatherResult() {

        }

        public com.example.openweathermap.Model.Coord getCoord() {
                return Coord;
        }

        public List<Weather> getWeathers() { return weathers; }

        public void setWeathers(List<Weather> weathers) { this.weathers = weathers; }

        public void setCoord(com.example.openweathermap.Model.Coord coord) {
                Coord = coord;
        }

        public String getBase() {
                return base;
        }

        public void setBase(String base) {
                this.base = base;
        }

        public com.example.openweathermap.Model.Main getMain() {
                return Main;
        }

        public void setMain(com.example.openweathermap.Model.Main main) {
                Main = main;
        }

        public float getVisibility() {
                return visibility;
        }

        public void setVisibility(float visibility) {
                this.visibility = visibility;
        }

        public com.example.openweathermap.Model.Wind getWind() {
                return Wind;
        }

        public void setWind(com.example.openweathermap.Model.Wind wind) {
                Wind = wind;
        }

        public com.example.openweathermap.Model.Clouds getClouds() {
                return Clouds;
        }

        public void setClouds(com.example.openweathermap.Model.Clouds clouds) {
                Clouds = clouds;
        }

        public float getDt() {
                return dt;
        }

        public void setDt(float dt) {
                this.dt = dt;
        }

        public com.example.openweathermap.Model.Sys getSys() {
                return Sys;
        }

        public void setSys(com.example.openweathermap.Model.Sys sys) {
                Sys = sys;
        }

        public float getTimezone() {
                return timezone;
        }

        public void setTimezone(float timezone) {
                this.timezone = timezone;
        }

        public float getId() {
                return id;
        }

        public void setId(float id) { this.id = id; }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public float getCod() {
                return cod;
        }

        public void setCod(float cod) {
                this.cod = cod;
        }


        @Override
        public String toString() {
                return "WeatherResult{" +
                        "Coord=" + Coord +
                        ", base='" + base + '\'' +
                        ", Main=" + Main +
                        ", visibility=" + visibility +
                        ", Wind=" + Wind +
                        ", Clouds=" + Clouds +
                        ", dt=" + dt +
                        ", Sys=" + Sys +
                        ", timezone=" + timezone +
                        ", id=" + id +
                        ", name='" + name + '\'' +
                        ", cod=" + cod +
                        '}';
        }
}
