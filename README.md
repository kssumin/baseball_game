### 기능구현

컴퓨터 정답 숫자 생성 Computer 클래스
-   컴퓨터 숫자 생성 setComputerNumber 메서드
    -   각 자릿수 랜덤 생성 createRandomNumber 메서드
    -   각 자릿수 중복 체크 isUnique 메서드

사용자 입력 User 클래스
-  사용자 숫자 입력 setuserNumbers 메서드
-  사용자 입력을 배열로 바꾸는 toArray 메서드
-  다음판 실행 여부 입력받는 메서드

컴퓨터 정답값과 사용자 입력값 비교하는 Compare 클래스
- 컴퓨터와 사용자 값 비교하는 compareNumber 메서드
    -  스트라이크, 볼 계산하는 validateNumber 메서드
    -  동일한 게임판에서 다음 사용자의 입력을 위한 initScore()메서드
    -  다음 게임판 실행을 위한 초기화 initCompare메서드
-스트라이크, 볼 결과값 출력을 위한 result 메서드
- 해당 판 종료 여부 결정하는 isNextPlat()메서드

전체적인 게임 흐름 설계를 위한 BaseballGame 클래스
- 게임 시작을 위한 startGame()메서드
- 다음판 진행 여부를 위한 checkReplay()메서드

게임 실행을 위한 Applicationm 클래스
