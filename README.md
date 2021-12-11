# 미션 - 자판기

## 기능 구현 목록
- [ ] 입력
  - [ ] 자판기 보유 금액
  - [ ] 상품명, 가격, 수량 
  - [ ] 투입 금액
- [ ] 출력
  - [ ] 자판기 보유 동전
  - [ ] 현재 남은 투입 금액
  - [ ] 잔돈
- [ ] 게임 진행
  - [ ] 자판기가 보유한 동전 랜덤 생성
  - [ ] 상품 구매
    - [ ] 투입한 금액이 상품의 최저 가격보다 적으면 바로 잔돈을 돌려준다
    - [ ] 모든 상품이 소진된 경우 바로 잔돈을 돌려준다
  - [ ] 잔돈 출력
    - [ ] 최소한의 동전으로 돌려준다.
- [ ] 예외
  - [ ] 자판기가 보유하고 있는 금액은 양수여야 한다.
  - [ ] 상품 입력은 `;` 으로 구분되어야 한다.
  - [ ] 상품 입력은 `[`로 시작해서 `]`로 끝나야 한다.
  - [ ] 상품명은 문자열이여야 한다.
  - [ ] 가격과 수량은 양수여야 한다.
  - [ ] 투입 금액은 양수여야 한다.
  - [ ] 존재하는 상품만 구매할 수 있다.

## 구현 객체 목록
- [ ] ConsolePrinter
  - [ ] 출력 담당
- [ ] ConsoleReader
  - [ ] 입력 담당
- [ ] CoinPocket
  - [ ] Key가 Coin, Value가 Coin의 개수인 Map을 가지고 있다.
- [ ] CoinExchanger (문자열의 돈을 받아서 CoinPocket으로 리턴)
  - [ ] 랜덤 생성
  - [ ] 잔돈 생성
- [ ] Merchandise
  - [ ] 상품의 이름, 가격, 수량 정보를 저장
- [ ] ShowCase
  - [ ] Merchandise를 Set으로 가지고 있다.
  - [ ] 상품이 존재하는지 체크
  - [ ] 상품의 정보를 제공
- [ ] PaidMoney
- [ ] VendingMachine
  - [ ] 동전 보유
  - [ ] 상품 보유
  - [ ] 투입 금액
  - [ ] 잔돈 반환