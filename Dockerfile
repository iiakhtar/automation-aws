FROM centos:7

LABEL org.label-schema.schema-version=1.0 org.label-schema.name="CentOS Base"

RUN yum -y install epel-release update wget unzip git
