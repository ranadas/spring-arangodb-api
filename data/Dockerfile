FROM arangodb/arangodb:3.6.2

ENV ARANGO_NO_AUTH=1
ENV ARANGO_ROOT_PASSWORD=openSesame

EXPOSE 8529

RUN apk update
RUN apk upgrade
RUN apk add bash


COPY dockerbashrc /.bashrc
# To run
#docker build --tag arzaarango:1.0 .
#docker run --publish 8529:8529 --detach --name arangodb arzaarango:1.0

#docker run -p 8529:8529 -e ARANGO_ROOT_PASSWORD=openSesame arangodb/arangodb:3.6.2
