# Java_study
기초부터 하는 java공부


## 🌻 자료형에 대해

### 1. 숫자(상수): 변하지 않는 수

- 2진수, 8진수, 10진수, 16진수(표현방식: 0x8 )

### 2. 변수: 특정 이름을 정하고 값을 변경할 수 있는 공간

1) 종류

- 정수
    - byte : 1 byte
    - short: 2 byte
    - int : 4 byte
    - long: 8 byte
- 실수
    - float: 4 byte
    - double: 8 byte
- 문자
    - char: 2 byte
- string: 문자열
- Boolean: 논리형(1 byte)

*변수는 의미를 잘 부여하는 것이 중요하다

2)특징

- 선언후에 대입하는 방법과 선언하며 대입하는 방법 있음
- 변수규칙: 대문자, 소문자 구분함, 언더바가능, 숫자로 시작불가
- 낙타표기법(Camel) 사용
- 예약어(int, double 등) 사용불가
- 같은이름의 변수명 사용불가

## 3. Array(배열)

:같은 자료형 변수들의 모음

정적할당

```java
//선언면저하는 방법
int arr[]=new int[8];
//선언과 초기화를 동시에 하는 방법
int arr[]={1,2,3,4,5,6}
```

동적할당

```java
int arr[];
arr=new int[8];
```

### Alias

```java
int arr[]={1,2,3};
int myalias[]=arr;
```

: 주소를 알려주는 것으로 이름만 바꿔주는것 복사가 아님 

→ myalias[0]=70으로 바꾸면 arr[0]도 70

### 4. String

:문자열

- 비교하는 방법

```java
string1.equals(string2)
```

## 🌻 제어문

### Switch case문

- 값이 명확해야함
- 범위지정불가
- 실수 사용불가
- break필요
- default도 필요
- case안에 중괄호 없어도됨
- 문자열은 안됐었는데 지원시작됨

### For문

```java
for(int i:array) {
			System.out.println(i);
		}
```

```python
for i in array:
	print(i)
```

→자바가 밑의 파이선과 같은 내용

### 반복문 탈출방법

- 제어용 변수 이용하기

```python
if(i==3) 변수=false;
if(변수==false) break;
```

- break out 사용하기

```python
out: for(){
	if(){break out;}
}
```

## 실습

```java
package assign;

import java.util.Scanner;

public class no1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		/*
		1) 두 수의 차구하기
			1. 두 수 입력받기
			2. 더 큰수 찾기
			3. 큰수-작은수
			 */
		int i1, i2;
		System.out.println("첫번째수를 입력하세요");
		i1= sc.nextInt();
		System.out.println("두번째수를 입력하세요");
		i2= sc.nextInt();
		if(i1>i2) System.out.println("두수의 차:" + (i1-i2));
		else System.out.println("두수의 차:" + (i2-i1));
		
			
	
		/*
		  2) 홀짝판단
			1. 숫자 입력받기
			2. 숫자를 2로 나눈 나머지가 0인지 확인하고 나머지가 0이면 짝수 1이면 홀수 출력
		 */
		System.out.println("수를 입력하세요");
		i1= sc.nextInt();
		if(i1%2==0) System.out.println("짝수입니다");
		else System.out.println("홀수입니다");
		
		
			
		/*
		 3) 두 수 중 큰수찾기
		 	1. 한 수 입력받고 처음수를 max로 지정
		 	2. 두번째 수 입력받아서 처음수보다 크면 max 수정 
		 */
		int max;
		System.out.println("첫수를 입력하세요");
		max= sc.nextInt();
		System.out.println("두 번째수를 입력하세요");
		i2= sc.nextInt();
		if(i2>max) max=i2;
		System.out.printf("더 큰수는 %d입니다\n", max);
		
		
		/*
		 4) 세 수 중 큰수찾기
		 	1. 한 수 입력받고 처음수를 max로 지정
		 	2. 두번째 수 입력받아서 처음수보다 크면 max 수정 
		 	3. 세번째 수 입력받아서 현 max보다 크면 max갱신
		 */
		System.out.println("첫수를 입력하세요");
		max= sc.nextInt();
		System.out.println("두 번째수를 입력하세요");
		i2= sc.nextInt();
		if(i2>max) max=i2;
		System.out.println("세 번째수를 입력하세요");
		i2= sc.nextInt();
		if(i2>max) max=i2;
		System.out.printf("더 큰수는 %d입니다\n", max);
		
		
		/*
		 5) 배열에서 최댓값 찾기
		 	1. 배열의 개수 입력받기
		 	2. max라는 변수를 설정하기
		 	3. 배열 입력받으며 첫 자리의 수를 max에다가 넣고 두번째 자리부터 모두 비교해 가장 큰수 찾기()
		 		3-1) 두번째 자리수를 max와 비교해 현 max보다 크면 max갱신
		 		3-2) 세번째 자리수를 max와 비교해 현 max보다 크면 max갱신
		 		3-n) n-1번째 자리수를 max와 비교해 현 max보다 크면 max갱신
		 */
		int arrLen;
		System.out.println("배열의 길이를 입력하세요");
		arrLen= sc.nextInt();
		int myArr[]=new int[arrLen];
		
		for (int i = 0; i < arrLen; i++) {
			System.out.printf("배열의 %d번째 수를 입력하세요:", i+1);
			myArr[i]= sc.nextInt();
			if(i==0) max=myArr[0];
			if(myArr[i]>max) max=myArr[i];
		}
		
		System.out.printf("최댓값은 %d입니다\n", max);
		
	
		
		
		/*
		 6) 두 변수 값 교환하기
		 	1. 두 변수 입력받기
		 	2. tmp라는 변수를 선언하고 첫 변수로 초기화
		 	3. 첫 변수에 두번째 변수 값 대입
		 	4. 두번째 변수에 tmp값 대입
		 */
		System.out.println("첫번째수를 입력하세요");
		i1= sc.nextInt();
		System.out.println("두번째수를 입력하세요");
		i2= sc.nextInt();
		
		int tmp=i1;
		i1=i2;
		i2=tmp;
		System.out.printf("첫수: %d\n두번째 수:%d\n", i1, i2);
		
		
		/*
		 7) 작은수에서 큰수까지의 합 구하기
		 	1. 작은수 입력받기
		 	2. 큰수 입력받기
		 	3. sum이라는 변수를 0으로 초기화 하기
		 	4. for문 (int i는 작은수~큰수+1 범위) 실행
		 	5. for문 내부에서 i의 값을 계속해서 sum에 더하기

		 */
		System.out.println("작은수를 입력하세요");
		i1= sc.nextInt();
		System.out.println("큰수를 입력하세요");
		i2= sc.nextInt();
		int sum=0;
		for (int i = i1; i <= i2; i++) {
			sum += i;
		}
		
		System.out.printf("%d ~ %d 의 값의 합은 %d입니다\n", i1, i2, sum);
		
		/*
		 8) 특정 숫자 까지의 3의배수 합 구하기
		 	1. 특정숫자 입력받기
		 	2. 특정 숫자 3으로 나누기
		 	3. sum이라는 변수를 0으로 초기화 하기
		 	4. for문 (int i는 1~특정숫자 범위) 실행
		 	5. for문 내부에서 i나누기 3의 나머지가 0이면 sum에 더하기

		 */
		
		System.out.println("수를 입력하세요");
		i1= sc.nextInt();
		sum=0;
		for (int i = 1; i < i1+1; i++) {
			if(i%3==0) sum += i;
		}
		System.out.printf("%d 까지의 3의배수 합은 %d입니다\n", i1, sum);
		
		
		/*
		 9) 1, -2, 3, -4,..., -100합 구하기
		 	1. sum이라는 변수를 0으로 초기화 하기
		 	2. for문 (int i는 1~100+1 범위) 실행
		 	3. for문 내부에서 만약 i가 2로나눈 나머지가 0이면 i에 -1 곱하기
		 	4. sum에 계속해 i더하기
		 */
		sum=0;
		for (int i = 1; i < 100+1; i++) {
			if(i%2==0) tmp= i*(-1);
			else tmp=i;
			sum += tmp;
		}
		System.out.printf("1, -2, 3, -4,..., -100합은 %d입니다\n", sum);
		
	}

}
```
