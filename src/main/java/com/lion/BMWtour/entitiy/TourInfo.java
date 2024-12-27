package com.lion.BMWtour.entitiy;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;


@Document(indexName = "tourinfos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setting(settingPath = "elasticsearch/tourinfos-setting.json")
@Mapping(mappingPath = "elasticsearch/tourinfos-mapping.json")
public class TourInfo {
    @Id
    private String id;
    private String title;
    @Field(type = FieldType.Text)
    private String address;
    private GeoPoint point;
    @Field(type = FieldType.Text)
    private String summary;
    private String openTime;
    @Field(type = FieldType.Text)
    private String detailInfo;
    private String category;
}