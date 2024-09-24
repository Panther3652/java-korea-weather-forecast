package idusw;

/*
Todo List
- 행정구역을 입력받은 후 CSV 파일에서 검색 후 X, Y좌표 값 반환 (완료)
- 검색하고자 하는 정보 유형 입력 ex)전체, 날씨, 기온, ...
-
 */

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Screen screen = new Screen();
        screen.screenMain();
    }
}