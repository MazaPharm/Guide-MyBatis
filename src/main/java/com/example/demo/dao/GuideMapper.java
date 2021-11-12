package com.example.demo.dao;

import com.example.demo.entity.Guide;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface GuideMapper {

    @Insert("INSERT into guide(id, title,abbreviate) VALUES(#{id}, #{title}, #{abbreviate})")
    void insert(Guide guide);

    @Select("SELECT * from guide")
    Guide getGuides();

    @Delete("DELETE from guide WHERE id =#{id}")
    void delete(Long id);

    @Select("SELECT id, title,abbreviate from guide WHERE id = #{id}")
    Guide selectGuide(Long id);

    @Update("UPDATE guide SET title=#{title}, abbreviate =#{abbreviate} WHERE id =#{id}")
    void updateVillage(Guide guide);
}
