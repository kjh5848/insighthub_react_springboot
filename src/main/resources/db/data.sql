-- 테스트 사용자 데이터
INSERT INTO users (username, email, password) VALUES
('admin', 'admin@example.com', '$2a$10$rDkPvvAFV6GgJjXp5P5qUOQZ5Z5Z5Z5Z5Z5Z5Z5Z5Z5Z5Z5Z5Z5Z'),
('user1', 'user1@example.com', '$2a$10$rDkPvvAFV6GgJjXp5P5qUOQZ5Z5Z5Z5Z5Z5Z5Z5Z5Z5Z5Z5Z5Z5Z');

-- 테스트 게시물 데이터
INSERT INTO posts (title, content, user_id) VALUES
('첫 번째 게시물', '안녕하세요! 첫 번째 게시물입니다.', 1),
('두 번째 게시물', '반갑습니다! 두 번째 게시물입니다.', 1),
('세 번째 게시물', '환영합니다! 세 번째 게시물입니다.', 2); 