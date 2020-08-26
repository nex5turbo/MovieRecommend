# MovieRecommendApp(08.24 ~ 진행중)

## Naver Movie API
하나만 짚고 넘어가겠다. JSON 받아와서 영화 포스터 이미지를 추출하려고 할 때,    
java.net.MalformedURLException: no protocol 에러가 뜨는 상황이 발생한다.    
검색하고 뭐하면서 URL인코딩 해보고 이스케이프 시퀀스 해보고 다해봤는데, 해결못했다.    
그러다 발견한 사실... url이 잘못된게 아니고 이미지가 없는 상황이다.    
이미지가 없어서 해당 영화의 네이버 상세페이지를 url로 올려둔건데, 이미지 파일도 없고,     
받아올 데이터도 없으니 이런 에러가 뜨는 것이다.     
혹시나 이걸 모르고 삽질하는 분들을 위해 ... ~~peess~~..
    
**정정 : 그냥 json에 이미지 url 자체가 없는 것**


## 너무 느려
영화진흥위원회 API와 Naver API를 같이 써서 이미지, 장르, 평점을 받아오는 데 성공!    
근데 속도가 개느리다.     
진흥위원회 API에는 평점이랑 포스터 이미지가 없고, Naver API에는 장르가 없다.    
(장르가 있는데 내가 못찾는 것 같다.. 장르만 받아올 수 있으면 굳이 진흥위원회 API를 쓸 필요가 없는데 ㅠㅠ)    
네이버 API에서 장르를 받아올 수 있는 방법을 조금만 찾아보고, 정 안되면 두 개를 연동해서 헤로쿠 서버에    
따로 JSON을 생성해야 할 것 같다ㅠㅠ 

**TMDB API를 발견했다!.! 영어로 되어있긴한데 아 몰라 일단 트라이**
