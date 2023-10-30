FROM centos:7

LABEL org.label-schema.schema-version=1.0 org.label-schema.name="CentOS Base"


 RUN yum -y install epel-release
 RUN yum -y update
 RUN yum install wget -y
 RUN yum install unzip -y

#downloading and installating chrome driver and browser
WORKDIR /usr/bin
RUN  wget https://edgedl.me.gvt1.com/edgedl/chrome/chrome-for-testing/117.0.5938.88/linux64/chromedriver-linux64.zip
RUN pwd
RUN  unzip chromedriver-linux64.zip -d /usr/bin
RUN  mv chromedriver-linux64/chromedriver /usr/bin/chromedriver
RUN pwd
RUN ls

# install headless chrome
RUN curl -O  https://dl.google.com/linux/direct/google-chrome-stable_current_x86_64.rpm
RUN yum install google-chrome-stable_current_x86_64.rpm -y
RUN  mv /usr/bin/google-chrome-stable /usr/bin/google-chrome


#mkdir tf_automation

#cd tmp
RUN mkdir temp

#virtual env pip
#RUN yum install https://repo.ius.io/ius-release-el$(rpm -E '%{rhel}').rpm
RUN yum update -y
RUN yum install -y python3

#setting python environment
WORKDIR /
RUN python3 -m venv /automation_Robot_app 
RUN source /automation_Robot_app/bin/activate

RUN pwd
#installing pip
RUN yum install python3-pip
RUN python3 -m pip install --upgrade pip
RUN pip install robotframework==5
RUN pip install wheel==0.41.0
RUN pip install robotframework-ride==2.0.6
RUN pip install robotframework-selenium2library==3.0.0
RUN pip install robotframework-seleniumlibrary==6.1.0
RUN pip install selenium==4.9.0
RUN pip install setuptools==47.1.0

#SSM
RUN yum install -y -d0 -e0 https://s3.amazonaws.com/ec2-downloads-windows/SSMAgent/latest/linux_amd64/amazon-ssm-agent.rpm
RUN systemctl start amazon-ssm-agent

#copy file from S3 bucket to ec2
#RUN aws s3 cp s3://tf-rf-scripts-spe-qaqc-bucket/scripts/TestSuite.robot testsuite.robot
#RUN aws s3 cp s3://tf-rf-scripts-spe-qaqc-bucket/scripts/aut-rf-spt temp --recursive
#Robot Specific
#RUN mkdir /robot
#RUN mkdir /results
#ENTRYPOINT ["robot"]