package com.goshapp.myuserlisttest.data.pojo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.goshapp.myuserlisttest.data.converter.InfoListTypeConverter;
import com.goshapp.myuserlisttest.data.converter.ResultListTypeConverter;

import java.util.List;

@Entity
public class RandomUser {
    @PrimaryKey
    public int id;

    @TypeConverters(ResultListTypeConverter.class)
    public List<Result> results;

    @TypeConverters(InfoListTypeConverter.class)
    private List<Info> info;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public List<Info> getInfo() {
        return info;
    }

    public void setInfo(List<Info> info) {
        this.info = info;
    }


}
