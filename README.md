# Dali


[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Dali is a Spring boot graph API based on ArangoDB.

  - Graph API
  - Sonar 
  - Github Actions

### Installation

Dali requires [ArangoDb](https://www.arangodb.com//) v3.6+ to run.

Install the dependencies and devDependencies and start the server.

```sh
$ cd data
$ docker build --tag arzaarango:1.0 .
$ docker run --publish 8529:8529 --detach --name arangodb arzaarango:1.0
$ 
```
 or Straight from dockerhub
 ```shell script
$ docker run -p 8529:8529 -e ARANGO_ROOT_PASSWORD=openSesame arangodb/arangodb:3.6.2
```

## Run UI
http://localhost:8529/_db/_system/_admin/aardvark/index.html#dashboard

### Development


### Reference URLS
* for Markdown
  
	https://dillinger.io/
* for latitude and longitidude

    https://www.latlong.net/