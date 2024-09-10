package idusw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Util 클래스
 * @author Ki-Chang Kim
 */

public class Util {
    /**
     * 입력받은 행정구역의 X좌표 값과 Y좌표 값 검색
     *
     * @throws java.io.IOException 입출력
     * @param firstDist 1차 행정구역 (특별시, 광역시, 도, 특별자치시)
     * @param secondDist 2차 행정구역 (시, 군, 구)
     * @param thirdDist 3차 행정구역 (읍, 면, 동)
     * @return X좌표 값, Y좌표 값
     */
    public Location getLocation(String firstDist, String secondDist, String thirdDist) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/storage/db/location.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",");

                if (columns[2].equals(firstDist) &&
                    (secondDist == null || columns[3].equals(secondDist)) &&
                    (thirdDist == null || columns[4].equals(thirdDist))) {
                    String xCord = columns[5];
                    String yCord = columns[6];
                    return new Location(xCord, yCord);
                }
            }
        }
        return null;
    }
}
