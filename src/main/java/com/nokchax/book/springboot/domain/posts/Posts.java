package com.nokchax.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity // 테이블과 링크될 클래스임을 나타냄
public class Posts {
    @Id // pk필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // springboot 2.0 부터는 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment가 된다
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    // 빌더 패턴의 이점: 어느 필드에 어떤 값을 채워야 할지 명확해진다.
    // i.g. Example.builder().a(a).b(b).build();
    // new Example(a, b); 순서를 알기 힘들 수 있음
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
