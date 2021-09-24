## jwp-chess2

## 기능 목록
- 콘솔 UI에서 체스 게임을 할 수 있는 기능을 구현한다.

## 구현 목록
- [x] piece 구현
  - 퀸, 비숍, 킹, 나이트, 룩, 폰
  - 색
- [x] 1단계는 체스 게임을 할 수 있는 체스판을 초기화한다.
  - 체스판에서 말의 위치 값은 가로 위치는 왼쪽부터 a ~ h이고, 세로는 아래부터 위로 1 ~ 8로 구현한다.
- [x] 체스 말 이동 기능
  - 각 말마다 행마법 다름
  - 행마법에 따라 보드에서 움직임 기능
- [x] 게임 종료 & 점수 확인
  - 왕이 죽으면 게임 끝
  - queen은 9점, rook은 5점, bishop은 3점, knight는 2.5점이고 pawn의 기본 점수는 1점이다. <br>
    하지만 같은 세로줄에 같은 색의 폰이 있는 경우 1점이 아닌 0.5점을 준다.
  - 점수 보여주기 기능
- [x] 콘솔 UI 기능
   - 체스말, 빈칸 표시
  - white는 소문자, black은 대문자, 빈칸은 .으로 출력
- [x] 게임 제어
  - 게임 시작 : start
  - 게임 종료 : end
  - 기물 이동 : move source위치 target위치 - 예. move b2 b3
  - 점수 현황 : status
- [x] 예외 처리 
  - 명령어 검증
    - start -> move, end, status 명령어 순서를 지켰는 지
    - 유효한 명령어를 입력했는 지
  - move 명령어 검증(source, target 검증)
    - source나 target이 보드 범위를 벗어나는지
    - 턴 검증
    - 유효한 source, target 이름인지 (예 move aa b123)
    - source, target 누락되지 않았는 지 (예 move a1  )
  
  - ~~보드 인덱스 범위 벗어나는 지~~
  - ~~moveStrategy 에러메세지 출력 추가~~
  - ~~start 안하고 바로 move 명령어가 실행되는 경우~~
  - ~~move만 입력했을 때~~
  
## 배운 점들
- 함수형 인터페이스 적용 (CommandType) (뭔가 별로)
- 인터페이스 적용 (CommandType2 - Command, PieceType - MoveStrategy)


## 아쉬운 점
- File, Rank wrapper 해야하는가? (기본형 int 사용)
- Move 전략 다른 방법은 어떤게 있을까?
- command 전략 다른 방법은 어떤게 있을까?
- static이 많이 사용되었는데 좋은 코드일까? 사용하지 않고 어떻게?
