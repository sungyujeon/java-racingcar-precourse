## 자동차 경주 게임 precourse

기간/이름: 2022.10.04 ~ 2022.10.10 / 전선규

> [기능 요구사항](#기능-요구사항)
>
> [프로그래밍 요구사항](#프로그래밍-요구사항)
>
> [구현 기능 목록](#구현-기능-목록)

<br>

## 기능 요구사항

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있음
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 대 자동차 이름을 같이 출력
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능
- 사용자는 몇 번의 이동을 할 것인지를 입력
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후, 그 값이 4 이상일 경우 전진하고 3이하의 값이면 멈춤
- 자동차 경주 게임을 완료 후 누가 우승했는지를 알려줌
- 우승자가 한 명 이상일 경우 쉼표(,)로 이름을 구분해 출력
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받음
  - Exception이 아닌 IllegalArgumentException, IllegalStateExcetpion 등과 같은 명확한 유형을 처리

<br>

## 프로그래밍 요구사항

> 1주차와 동일한 요구사항은 생략

- 일급콜렉션을 활용해 구현한다 [참고문서](https://developerfarm.wordpress.com/2012/02/01/object_calisthenics_/)
- 모든 원시값과 문자열을 포장한다 [참고문서](https://developerfarm.wordpress.com/2012/01/27/object_calisthenics_4/)

<br>

## 구현 기능 목록

> 기능 구현 시 다음의 요구사항 충족에 초점을 맞춘다
>
> - TDD 활용
> - 일급 컬렉션 활용
> - 원시값과 문자열 포장
> - 리팩터링 중점 사항
>   - 메서드 분리로 중복 기능 제거
>   - 객체지향적 기능 활용(메시지 활용)
>   - 값에 대한 하드 코딩 지양(상수 활용)

- [x] ~~랜덤 정수 0~9 생성~~
- [x] 5자 이하 자동차 이름 검증
  - [x] 5자 초과일 경우 예외를 던진다.
  - [x] 예외메시지는 [ERROR]로 시작하여야 한다.

- [x] 위치 이동(전진) 구현
  - [x] 4이상 이동
    - [x] 포지션 증가
  - [x] 4미만 이동 없음

- [x] 실행 횟수 입력 숫자
  - [x] 숫자가 아닌 입력 불가능
  - [x] 음수 입력 불가능

- [x] 자동차 리스트(이하 Cars) 기능 구현
  - [x] Cars 수 n대 검증
  - [x] Cars 인스턴스 쉼표 구분 검증
  - [x] 우승자 검증
  - [x] 다수 우승자 검증
- [x] 입출력 기능 구현

<br>

## 테스트 결과

![](./src/test-passed.png)


