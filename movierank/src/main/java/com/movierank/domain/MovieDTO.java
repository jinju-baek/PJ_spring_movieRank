package com.movierank.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "movie")
public class MovieDTO {
	// 특정 컬렉션에 값을 넣고 싶을 경우
	// @Document(collection = "컬렉션명") 사용
	@Id
	private int rank; // 순위
	private String movie; // 영화 제목
	private String imgsrc; // 포스터 이미지
	private String type; // 영화 장르
	private String opendate; // 개봉일
	private String bookingrate; // 예매율
	private String runtime; // 상영시간
	private String director; // 감독
	private String actor; // 출연자
	private String navercode; // 네이버 영화코드
	private double naverscore; // 네이버 평점
	private String daumcode; // 다음 영화코드
	private double daumscore; // 다음 평점
	public MovieDTO(int rank, String movie, String imgsrc, String type, String opendate, String bookingrate,
			String runtime, String director, String actor, String navercode, double naverscore, String daumcode,
			double daumscore) {
		super();
		this.rank = rank;
		this.movie = movie;
		this.imgsrc = imgsrc;
		this.type = type;
		this.opendate = opendate;
		this.bookingrate = bookingrate;
		this.runtime = runtime;
		this.director = director;
		this.actor = actor;
		this.navercode = navercode;
		this.naverscore = naverscore;
		this.daumcode = daumcode;
		this.daumscore = daumscore;
	}
	private double score; // 네이버 + 다음 평점의 평균
}
