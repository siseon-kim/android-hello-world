# Android Intellij 개발환경 가이드

### SDK 다운로드
https://developer.android.com/sdk/index.html#Other

다운로드 후 intellij 에서 찾을 수 있도록 ANDROID_HOME path를 지정해야 한다.

### Intellij 를 열어 SBT 프로젝트 생성
New Project -> Scala -> SBT

### Project Structure 설정
#### project 탭
* project SDK : 1.7
* project language level : 7.0 Diamonds

#### Modules 탭
* Dependencies -> Modules SDK -> android(사용할 버전) !! 참고로 New.. 버튼을 클릭 한 후 android SDK 를 다운받아 압축을 푼 폴더를 경로로 선택하면 의존성으로 추가할 수 있는 SDK의 목록이 나오게 된다.

#### 소스 가져오기
git 에서 Hello World 소스를 가져온다

#### 에뮬레이터 실행 혹은 디바이스 연결
### 에뮬레이터 실행
* 터미널에서 android avd 명령을 치거나 직접 avd 매니져를 실행한다
* avd 매니져를 실행한 후 에뮬레이터가 없으면 create 버튼을 눌러 에뮬레이터를 먼저 생성해야 한다.
* 실행할 에뮬레이터를 설정 한 후 start 버튼 클릭

#### 소스 컴파일 & run
https://github.com/pfn/android-sdk-plugin/tree/master/sbt-test/android-sdk-plugin 
* 컴파일   - sbt android:compile
* apk 생성 - sbt android:package
* apk 실행 - sbt android:run












