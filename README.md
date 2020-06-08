# Spring Boot CRUD App
A small spring boot CRUD app using an in memory DB. 

## DataBase
There are two implemenations of a DB.
* [`fakeDao`](src/main/java/com/example/demo/dao/FakePersonDataAccessService.java)
* [`someDB`](src/main/java/com/example/demo/dao/PersonDataAccessService.java) 

Which can be configured in the [`PersonService`](src/main/java/com/example/demo/service/PersonService.java) 

## API

### Add Person 
```
POST localhost:8080/api/v1/person

{
    "name": "Joe Bloggs"
}
```

### Get All People
```
GET localhost:8080/api/v1/person
```

### Get A Person
```
GET localhost:8080/api/v1/person/{id}
```

### Update A Person
```
PUT localhost:8080/api/v1/person/{id}

{
    "name": "Joe New Name Bloggs"
}
```

### Delete A Person
```
DEL localhost:8080/api/v1/person/{id}
```
