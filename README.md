# insighthub_react_springboot

## 프론트엔드 설치방법
- 프론트는 src/frontend에 있습니다.
  - 설치방법 cd src로 이동후 -> npm create vite@latest my-app -- --template react
  - 'my-app'은 원하는 폴더이름으로 변경가능
  - 버전은 최신버전 추후 고정
- 의존성 설치
  - 명령어 : npm install react-router-dom axios @tanstack/react-query zustand react-hook-form clsx dayjs lodash-es framer-motion


## .gitignore
```
- Frontend
  - src/frontend/node_modules/
  - src/frontend/.env
```
위 내용을 .gitignore에 넣어야지 git에 올릴 수 있음.

