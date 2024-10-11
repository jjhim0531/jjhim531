<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "https://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!-- namespace: 해당 mapper파일의 고유한 별칭 -->

<mapper namespace="boardMapper">
	<resultMap id="boardResultSet" type="Board">
		<result column="BOARD_NO" property="boardNo" />
		<result column="BOARD_TITLE" property="boardTitle" />
		<result column="USER_ID" property="boardWriter" />
		<result column="COUNT" property="count" />
		<result column="CREATE_DATE" property="createDate" />
		<result column="BOARD_CONTENT" property="boardContent" />
	</resultMap>
	<resultMap id="replyResultSet" type="Reply">
		<result column="REPLY_NO" property="replyNo" />
		<result column="USER_ID" property="replyWriter" />
		<result column="REPLY_CONTENT" property="replyContent" />
		<result column="CREATE_DATE" property="createDate" />
	</resultMap>
  	<select id="selectListCount" resultType="_int">
  		SELECT COUNT(*)
  		  FROM BOARD
  		 WHERE STATUS = 'Y'
  	</select>
  	<select id="selectList" resultMap="boardResultSet">
  		SELECT BOARD_NO,
  			   BOARD_TITLE,
  			   USER_ID,
  			   COUNT,
  			   CREATE_DATE
  		  FROM BOARD B
  		  JOIN MEMBER ON(BOARD_WRITER = USER_NO)
  		 WHERE B.STATUS = 'Y'
  		 ORDER BY BOARD_NO DESC
  	</select>
  	<update id="increaseCount" parameterType="_int">
  		UPDATE BOARD
  		   SET COUNT = COUNT + 1
  		 WHERE BOARD_NO = #{boardNo}
  		   AND STATUS = 'Y'
  	</update>
  	<select id="selectBoard" parameterType="_int" resultMap="boardResultSet">
  		SELECT BOARD_NO,
  			   BOARD_TITLE,
  			   USER_ID,
  			   COUNT,
  			   CREATE_DATE,
  			   BOARD_CONTENT
  		  FROM BOARD B
		  JOIN MEMBER ON(BOARD_WRITER = USER_NO)
  		 WHERE B.STATUS = 'Y'
  		   AND BOARD_NO = #{boardNo}
  	</select>
  	<select id="selectReplyList" parameterType="_int" resultMap="replyResultSet">
  		SELECT REPLY_NO,
  			   USER_ID,
  			   REPLY_CONTENT,
  			   CREATE_DATE
  		  FROM REPLY R
  		  JOIN MEMBER ON(REPLY_WRITER = USER_NO)
  		 WHERE REF_BNO = #{boardNo}
  		   AND R.STATUS = 'Y'
  		 ORDER BY REPLY_NO DESC
  	</select>
	<select id="selectSearchCount" resultType="_int">
  		SELECT COUNT(*)
  		  FROM BOARD B
  		  JOIN MEMBER ON (BOARD_WRITER = USER_NO)
  		 WHERE B.STATUS = 'Y'
  		 <if test="condition == 'writer'">
  		 	AND USER_ID
  		 </if>
  		 <if test="condition == 'title'">
  		 	AND BOARD_TITLE
  		 </if>
  		 <if test="condition == 'content'">
  		 	AND BOARD_CONTENT
  		 </if>
  		 LIKE '%' || #{keyword} || '%'
  	</select>
 	<select id="selectSearchList" resultMap="boardResultSet">
  		SELECT BOARD_NO,
  			   BOARD_TITLE,
  			   USER_ID,
  			   COUNT,
  			   CREATE_DATE
  		  FROM BOARD B
  		  JOIN MEMBER ON(BOARD_WRITER = USER_NO)
  		 WHERE B.STATUS = 'Y'
  		 <choose>
  		 	<when test="condition == 'writer'">
  		 		AND USER_ID
  		 	</when>
  		 	<when test="condition == 'title'">
  		 		AND BOARD_TITLE
  		 	</when>
	  		<otherwise>
	  		 	AND BOARD_CONTENT
	  		</otherwise>
  		 </choose>
  		 LIKE '%' || #{keyword} || '%'
  		 ORDER BY BOARD_NO DESC
  	</select>
</mapper>