##### "스프링 부트와 AWS로 혼자 구현하는 웹서비스" 책을 기반으로한 학습
##
#### Project Spec
Moudule | Version
------------ | ------------- 
Spring Boot | 2.1.9 RELEASE
JDK | 10.0.2 
Gradle | 4.8

----
#### Using Library
Library | 설명
------------ | ------------- 
Lombok | 
Jquery | 
Spring Boot JPA | 

----
#### Gradle 이란?   
 - Gradle은 Groovy를 기반으로 Ant와 Maven과 같은 이전 세대 빌드 도구의 단점을 보완을 한 빌드 도구.   
 - 의존성이나 플러그인 설정 등과 같은 빌드에 필요한 설정을 하게 된다.  
  
#### API를 만들기 위한 클래스 3가지.  
 - Request 데이터를 받을 Dto  
 - API 요청을 받을 Controller  
 - 트랜잭션,도메인 기능 간의 순서를 보장하는 Service  
 
 ![web_hierarchy](/image/web_hierarchy.png)


   ##### JPA Auditing 이란?  
    Audit은 감시하다, 감사하다라는 뜻으로 Spring Data JPA에서 시간에 대해서 자동으로 값을 넣어주는 기능.  
    
어노테이션 | 설명
------------ | ------------- 
@MappedSuperclass	 | JPA Entity 클래스들이 해당 추상 클래스를 상속할 경우 createDate, modifiedDate를 컬럼으로 인식
@EntityListeners | 해당 클래스에 Auditing 기능을 포함
@CreatedDate	 | Entity가 생성되어 저장될 때 시간이 자동 저장
@LastModifiedDate		 | 조회한 Entity의 값을 변경할 때 시간이 자동 저장


#### 템플릿 엔진이란?  
     지정된 템플릿 양식과 데이터가 합쳐져 HTML문서를 출력하는 소프트웨어이다.   
        EX) JSP, Freemarker // Server 템플릿 엔진   
           React, Vue_View 등등.. // Client 템플릿 엔진  
