#### 1. 가상환경 생성(처음 한번만)

```python
python -m venv venv
```



#### 2. 가상환경 실행 - 터미널창에서 (venv) 뜸

```python
source venv/Scripts/activate
```



#### 3. pip 설치 - requirements.txt 안에 있는 것들이 설치됨

```python
pip install -r requirements.txt
```



#### 4. 모델 정의 후에 마이그레이션 수행

```shell
python manage.py makemigrations
python manage.py migrate
```



#### 5. 서버 실행

```
python manage.py runserver
```





#### pip 설치목록 저장 - 새로운 것을 설치했을 때

```python
pip freeze > requirements.txt
```



#### MySQL 모델이 변경되었을 때

```django
python manage.py inspectdb > models.py
```

- 생성된 models.py 파일을 api폴더에 넣어준다.



