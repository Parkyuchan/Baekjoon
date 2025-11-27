import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        // data: 코드 번호(code) + 제조일(date) + 최대 수량(maximum) + 현재 수량(remain)
        // 제조일이 20300501 이전인 물건들을 현재 수량이 적은 순서로 정렬
        // val_ext: 기준으로 낮은 데이터를 추출
        // sort_by: 추출된 데이터를 정렬시킬 기준
        
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        int len = data.length;
        int extIndex = map.get(ext);
        int sortBy = map.get(sort_by);
        List<int[]> list = new ArrayList<>();
        
        for (int i = 0; i < len; i++) {
            if (data[i][extIndex] < val_ext)
                list.add(data[i]);
        }
        list.sort((a, b) -> Integer.compare(a[sortBy], b[sortBy]));

        answer = list.toArray(new int[0][]);
    
        return answer;
    }
}