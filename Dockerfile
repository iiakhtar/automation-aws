FROM centos:7

LABEL org.label-schema.schema-version=1.0 org.label-schema.name="CentOS Base"
RUN yum update -y
RUN yum install -y python3
RUN python3 --version

