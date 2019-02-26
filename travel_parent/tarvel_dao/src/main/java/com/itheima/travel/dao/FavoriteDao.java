package com.itheima.travel.dao;

import com.itheima.travel.pojo.Favorite;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface FavoriteDao {

    /**
     * 根据rid和uid查询收藏信息
     * @param rid
     * @param uid
     * @return
     */
    @Select("select * from tab_favorite where rid = #{rid} and uid = #{uid}")
    public Favorite findByRidAndUid(int rid, int uid);

    /**
     * 根据rid 查询收藏次数
     * @param rid
     * @return
     */
    @Select("SELECT COUNT(*) FROM tab_favorite WHERE rid = #{rid}")
    public int findCountByRid(int rid);

    /**
     * 添加收藏
     * @param i
     * @param uid
     */
    @Insert("insert into tab_favorite values(#{rid},#{date},#{uid})")
    void add(int i, int uid);
}
