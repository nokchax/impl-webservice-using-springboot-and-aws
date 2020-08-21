package com.nokchax.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// Entity 와 Repository 는 밀접한 관계이므로 같이 움직이는 것이 좋다.
// 따라서 Repository 는 도메인 패키지에서 함께 관리
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
