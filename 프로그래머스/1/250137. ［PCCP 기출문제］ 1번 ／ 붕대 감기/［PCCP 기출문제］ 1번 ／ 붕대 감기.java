class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        //NOTE: t초 동안 붕대 감기
        //NOTE: 1초마다 x만큼 체력 회복, 연속 t초동안 붕대 감으면 y만큼 추가 회복
        //NOTE: 최대 체력보다 커질 수 없다.
        //NOTE: 기술을 쓰는 도중 몬스터에게 공격 당하면 기술 취소
        //NOTE: 공격 당하는 순간 체력 회복x
        //NOTE: 기술 취소 or 끝나면 붕대 감기 사용하며, 연속 성공 시간 0으로 초기화
        //NOTE: 몬스터 공격 받으면 정해진 만큼 피해
        //NOTE: 체력 0이하 되면 체력 회복x(사망)
        //NOTE: bandage: 사용자의 시전 정보
        //NOTE: health: 최대 체력
        //NOTE: attacks: 몬스터 공격 정보
        //TODO: 몬스터 공격 표현
        //TODO: 현재 체력과 max 비교
        //TODO: max 아니라면 체력 회복
        //TODO: 지속 시간 만큼 했는지 확인하고, 만족하면 추가 회복
        //TODO: 사망 시 -1로 리턴
        //TODO: 사망 안하면 체력 회복
        int endTime = attacks[attacks.length - 1][0];
        int count = 0;
        int max = health;
        int recoveryTime = 0;
        for (int i = 1; i <= endTime; i++) {
            if (attacks[count][0] == i) {
                health -= attacks[count++][1];
                recoveryTime = 0;
                
                if (health <= 0) 
                    return -1;
                
                continue;
            }
            
            health += bandage[1];
            
            if (max < health) 
                health = max;

            recoveryTime++;

            if (recoveryTime == bandage[0]) {
                health += bandage[2];
                
                if (health > max)
                    health = max;
                
                recoveryTime = 0;
            }
        }
        return health;
    }
}