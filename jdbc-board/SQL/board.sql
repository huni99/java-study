-- Active: 1749600516352@@127.0.0.1@3306@jdbc_board
-- 게시판 프로젝트 데이터베이스 생성
CREATE DATABASE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board(
  no INTEGER AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL,
  writer VARCHAR(100) NOT NULL,
  content TEXT,
  reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP, -- DATETIME,TIME 자료형일때는 CURRENT_TIMESTAMP을 사용하면 기본값으로 SQL 문이 실행되는 시점의 시스템 날짜 및 시간 즉 등록일
  -- DATE 타입 : reg_date DATE NOT NULL DEFAULT CURRENT_DATE,
  upd_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  -- ON UPDATE CURRENT_TIMESTAMP : UPDATE 시 자동으로 수정 시간도 갱신
  PRIMARY KEY (no)

);

DESC board;

-- 추가

INSERT INTO board(title, writer ,content )
VALUES ('아침 메뉴' , '정길훈' , '닭가슴살, 삼각김밥');

-- 조회
SELECT * FROM board; -- 전체 게시글 목록 조회
SELECT * FROM board WHERE no = 1; -- 특정 게시글 조회

--수정
UPDATE board
SET content ='닭가슴살 ,삼각김밥 , 커피'
WHERE no = 1;

-- 테이블 생성시 ON UPDATE CURRENT_TIMESTAMP를 안써줬다면 
-- 수정할 때 udp_date = now()를 추가 해주면 된다

-- 삭제
DELETE FROM board
WHERE no = 1;
