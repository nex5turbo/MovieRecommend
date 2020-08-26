package wonyong.by.movierecommend;

import android.provider.BaseColumns;

public final class DataBase {
/*
movieNm 영화제목
movieNmEn 영화 영어제목
openDt 개봉일
prdtStatNm 개봉상태
repNationNm 제작국가
repGenreNm 장르
 */
    public static final class CreateDB implements BaseColumns{
        public static final String MOVIENM = "movienm";
        public static final String MOVIENMEN = "movienmen";
        public static final String OPENDT = "opendt";
        public static final String PRDTSTATNM = "prdtstatnm";
        public static final String REPNATIONNM = "repnationnm";
        public static final String REPGENRENM = "repgenrenm";
        public static final String _TABLENAME0 = "usertable";
        public static final String _CREATE0 = "create table if not exists "+_TABLENAME0+"("
                +MOVIENM+" primary key , "
                +MOVIENMEN+" text not null , "
                +OPENDT+" integer , "
                +PRDTSTATNM+" text not null , "
                +REPNATIONNM+" text not null , "
                +REPGENRENM+" text not null );";
    }
}
